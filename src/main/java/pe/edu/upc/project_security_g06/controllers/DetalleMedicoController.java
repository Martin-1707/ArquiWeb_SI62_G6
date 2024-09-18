package pe.edu.upc.project_security_g06.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project_security_g06.dtos.Detalle_MedicoDTO;
import pe.edu.upc.project_security_g06.entities.Detalle_Medico;
import pe.edu.upc.project_security_g06.servicesinterfaces.IDetalle_MedicoService;


@RestController
@RequestMapping("/detalle medico")
public class DetalleMedicoController {
    @Autowired
    private IDetalle_MedicoService dmS;

    @PostMapping
    public void insertar(@RequestBody Detalle_Medico dto) {
        ModelMapper m = new ModelMapper();
        Detalle_Medico d = m.map(dto, Detalle_Medico.class);
        dmS.insert(d);
    }
}
