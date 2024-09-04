package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Ubicacions;
import pe.edu.upc.project_security_g06.repositories.IdUbicacionRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.idPostalService;

import java.util.List;

@Service
public class UbicacionServiceImplement implements idPostalService {
    @Autowired
    private  IdUbicacionRepository dU;

    @Override
    public List<Ubicacions> list() {
        return dU.findAll();
    }

    @Override
    public void insert(Ubicacions ubi) {
        dU.save(ubi);
    }

    @Override
    public Ubicacions listId(int id) {
        return dU.findById(id).orElse(new Ubicacions());
    }

    @Override
    public void delete(int id) {
        dU.deleteById(id);
    }

    @Override
    public void update(Ubicacions ubi) {
        dU.save(ubi);
    }

    @Override
    public List<Ubicacions> buscar(String nombre) {
        return dU.buscar(nombre);
    }

}
