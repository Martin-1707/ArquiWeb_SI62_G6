package pe.edu.upc.project_security_g06.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.CiudadDTO;
import pe.edu.upc.project_security_g06.entities.Ciudad;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdCiudadService;

@RestController
@RequestMapping("/Ciudades")
public class CiudadController {
    @Autowired
    private IdCiudadService cS;

    @PostMapping
    private void registrar(@RequestBody CiudadDTO dto) {
        ModelMapper m = new ModelMapper();
        Ciudad c = m.map(dto, Ciudad.class);
        cS.insert(c);
    }
}
