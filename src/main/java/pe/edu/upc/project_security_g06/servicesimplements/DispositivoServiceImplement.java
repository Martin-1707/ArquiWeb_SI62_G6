package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Dispositivo;
import pe.edu.upc.project_security_g06.repositories.IDispositivoRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IDispositivoService;

@Service
public class DispositivoServiceImplement implements IDispositivoService {

    @Autowired
    private IDispositivoRepository dR;

    @Override
    public void insert(Dispositivo dispositivo) {
        dR.save(dispositivo);
    }

    @Override
    public Dispositivo list(int Idispositivo) {
        return dR.findById(Idispositivo).orElse(new Dispositivo());
    }
}
