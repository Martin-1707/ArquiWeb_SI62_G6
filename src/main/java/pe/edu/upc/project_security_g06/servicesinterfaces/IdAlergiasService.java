package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Alergias;

import java.util.List;

public interface IdAlergiasService {

    public List<Alergias> list();
    public void insert(Alergias ale);

}
