package pe.edu.upc.project_security_g06.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.UserDTO;
import pe.edu.upc.project_security_g06.dtos.UsuarioContactosDTO;
import pe.edu.upc.project_security_g06.dtos.UsuarioDispositivoRolDTO;
import pe.edu.upc.project_security_g06.dtos.UsuarioHistorialClinicoDTO;
import pe.edu.upc.project_security_g06.entities.Users;
import pe.edu.upc.project_security_g06.servicesinterfaces.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UserDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listarId(id), UserDTO.class);
        return dto;
    }

    @GetMapping
    public List<UserDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/rolxdispositivodeusuario")
    public List<UsuarioDispositivoRolDTO>obtenerUsuariosConDispositivosYRoles(){
        List<String[]> lista=uS.obtenerUsuariosConDispositivosYRoles();
        List<UsuarioDispositivoRolDTO>listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            UsuarioDispositivoRolDTO dto=new UsuarioDispositivoRolDTO();
            dto.setNombreUsuario(columna[0]);
            dto.setApellidoUsuario(columna[1]);
            dto.setNombreDispositivo(columna[2]);
            dto.setRolUsuario(columna[3]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping
    public List<UsuarioContactosDTO> ObtenerContactosEmergenciaPersonalesDeUsuario(@PathVariable("us_nombre") String us_nombre) {
        List<String[]> resultados = uS.ObtenerContactosEmergenciaPersonalesDeUsuario(us_nombre);
        ModelMapper m = new ModelMapper();
        List<UsuarioContactosDTO> dtoList = resultados.stream()
                .map(resultado -> {
                    UsuarioContactosDTO dto = new UsuarioContactosDTO();
                    dto.setIdUsario(Integer.parseInt(resultado[0]));
                    dto.setUs_nombre(resultado[1]);
                    dto.setUs_apellido(resultado[2]);
                    dto.setNombre_dispositivo(resultado[3]);
                    dto.setNombreContactoEmergencia(resultado[4]);
                    dto.setTelefonoContactoEmergencia(resultado[5]);
                    dto.setNombreContactoAutoridad(resultado[6]);
                    dto.setTelefonoContactoAutoridad(resultado[7]);
                    return dto;
                })
                .collect(Collectors.toList());

        return dtoList;
    }


    @GetMapping("/{idUsuario}/informacionclinica")
    public UsuarioHistorialClinicoDTO obtenerInformacionClinicaXusuario(@PathVariable("idUsuario") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioHistorialClinicoDTO dto = m.map(uS.obtenerInformacionClinicaPorUsuario(id), UsuarioHistorialClinicoDTO.class);
        return dto;
    }

}
