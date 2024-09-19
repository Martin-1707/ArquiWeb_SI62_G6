package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Distrito;

import java.util.List;

public interface IDistritoService {
    public void insert(Distrito distrito);
    List<Distrito> list();
}