package pe.edu.upc.project_security_g06.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.CantidadRelacionContactosDTO;
import pe.edu.upc.project_security_g06.dtos.Contacto_EmergenciaDTO;
import pe.edu.upc.project_security_g06.dtos.UsuarioContactosDTO;
import pe.edu.upc.project_security_g06.dtos.CiudadDTO;
import pe.edu.upc.project_security_g06.entities.Ciudad;

import pe.edu.upc.project_security_g06.entities.Contacto_Emergencia;
import pe.edu.upc.project_security_g06.servicesinterfaces.IContacEmergenciaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contactoEmergencia")
@PreAuthorize("hasAnyAuthority('ADMINISTRADOR','PERSONALEMERGENCIA','USUARIO')")
public class ContactoEmergenciaController {
    @Autowired
    private IContacEmergenciaService ceS;

    @PostMapping
    public void insertar (@RequestBody Contacto_EmergenciaDTO dto) {
        ModelMapper m = new ModelMapper();
        Contacto_Emergencia d = m.map(dto, Contacto_Emergencia.class);
        ceS.insert(d);
    }

    @GetMapping
    public List<Contacto_EmergenciaDTO> listar() {
        return ceS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Contacto_EmergenciaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Contacto_EmergenciaDTO dto){
        ModelMapper m=new ModelMapper();
        Contacto_Emergencia d=m.map(dto,Contacto_Emergencia.class);
        ceS.update(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ceS.delete(id);
    }

    @GetMapping("/buscarpornombresdereferencia/{relacion_contacto}")
    public List<CantidadRelacionContactosDTO> buscar(@RequestParam("relacion_contacto") String relacion_contacto) {
        List<String[]> lista = ceS.listaCantidadRelacionesContacto(relacion_contacto);
        List<CantidadRelacionContactosDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            CantidadRelacionContactosDTO dto = new CantidadRelacionContactosDTO();
            dto.setRelacion_contacto(columna[0]);
            dto.setCantidad_relaciones_similares(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/{id}")
    public Contacto_EmergenciaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        Contacto_EmergenciaDTO dto = m.map(ceS.listarId(id), Contacto_EmergenciaDTO.class);
        return dto;
    }

}
