package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Ubicacions;

import java.util.List;

public interface idPostalService {
    public List<Ubicacions> list();
    public void insert(Ubicacions ubicacion);
    public Ubicacions listId(int id);
    public void delete(int id);
    public void update(Ubicacions ubicacion);
    public List<Ubicacions>buscar(String nombre);
}
