package pe.edu.upc.project_security_g06.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.Historial_ClinicoDTO;
import pe.edu.upc.project_security_g06.entities.Historial_Clinico;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdHistorial_ClinicoService;

@RestController
@RequestMapping("/historial clinico")
public class HistorialClinicoController {
    @Autowired
    private IdHistorial_ClinicoService hcS;

    @PostMapping
    public void insertar(@RequestBody Historial_ClinicoDTO dto){
        ModelMapper m=new ModelMapper();
        Historial_Clinico d=m.map(dto,Historial_Clinico.class);
        hcS.insert(d);
    }
}
