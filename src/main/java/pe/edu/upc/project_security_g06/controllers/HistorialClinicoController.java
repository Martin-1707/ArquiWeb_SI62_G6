package pe.edu.upc.project_security_g06.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.AlergiasDTO;
import pe.edu.upc.project_security_g06.dtos.Historial_ClinicoDTO;
import pe.edu.upc.project_security_g06.entities.Historial_Clinico;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdHistorial_ClinicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historialClinico")
@PreAuthorize("hasAnyAuthority('ADMINISTRADOR','PERSONALEMERGENCIA','USUARIO')")
public class HistorialClinicoController {
    @Autowired
    private IdHistorial_ClinicoService hcS;

    @PostMapping
    public void insertar(@RequestBody Historial_ClinicoDTO dto){
        ModelMapper m=new ModelMapper();
        Historial_Clinico d=m.map(dto,Historial_Clinico.class);
        hcS.insert(d);
    }

    @GetMapping
    public List<Historial_ClinicoDTO> listar() {
        return hcS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Historial_ClinicoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody Historial_ClinicoDTO dto){
        ModelMapper m=new ModelMapper();
        Historial_Clinico d=m.map(dto,Historial_Clinico.class);
        hcS.update(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        hcS.delete(id);
    }

    @GetMapping("/{id}")
    public Historial_ClinicoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        Historial_ClinicoDTO dto=m.map(hcS.listarId(id),Historial_ClinicoDTO.class);
        return dto;
    }

}
