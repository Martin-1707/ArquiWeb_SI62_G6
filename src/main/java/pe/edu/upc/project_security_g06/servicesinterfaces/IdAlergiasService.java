package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Alergias;
import pe.edu.upc.project_security_g06.entities.Users;

import java.util.List;

public interface IdAlergiasService {
    //Create
    public void insert(Alergias ale);
    //Read
    public List<Alergias> list();
    //Update
    public void update(Alergias alergias);
    //Delete
    public void delete(int id);
    //ListarId
    public Alergias listarId(int id);
}
