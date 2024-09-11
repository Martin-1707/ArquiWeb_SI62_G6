package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Ciudad;

import java.util.List;

public interface IdCiudadService {
    public void insert(Ciudad ciudad);
    public List<Ciudad> list();
    public List<Ciudad> findByName(String nombre);
}
