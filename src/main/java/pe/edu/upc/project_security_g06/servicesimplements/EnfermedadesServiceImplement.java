package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Enfermedades;
import pe.edu.upc.project_security_g06.repositories.IEnfermedadesRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdEnfermedadService;

import java.util.List;

@Service
public class EnfermedadesServiceImplement implements IdEnfermedadService{
    @Autowired
    private IEnfermedadesRepository eR;

    @Override
    public List<Enfermedades> listarEnfermedades() {
        return eR.findAll();
    }

    @Override
    public void insert(Enfermedades enfe) {
        eR.save(enfe);
    }
}
