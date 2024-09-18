package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Enfermedades;

import java.util.List;

public interface IdEnfermedadService {
    public List<Enfermedades> listarEnfermedades();
    public void insert (Enfermedades enfe);
}
