package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Contacto_Autoridades;
import pe.edu.upc.project_security_g06.entities.Contacto_Emergencia;

import java.util.List;

public interface IContacAutoridadesService {
    public void insert(Contacto_Autoridades contacto_autoridades);
    public List<Contacto_Autoridades> list();
}
