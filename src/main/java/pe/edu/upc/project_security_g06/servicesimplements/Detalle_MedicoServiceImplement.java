package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Detalle_Medico;
import pe.edu.upc.project_security_g06.repositories.IDetalle_MedicoRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IDetalle_MedicoService;

import java.util.ArrayList;

@Service
public class Detalle_MedicoServiceImplement implements IDetalle_MedicoService {
    @Autowired
    private IDetalle_MedicoRepository dmR;

    @Override
    public void insert(Detalle_Medico detmed) {
        dmR.save(detmed);
    }
}