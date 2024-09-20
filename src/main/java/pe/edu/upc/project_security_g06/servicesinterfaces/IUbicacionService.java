package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {

    public void insert(Ubicacion ubicacion);
    public List<Ubicacion> list();

}