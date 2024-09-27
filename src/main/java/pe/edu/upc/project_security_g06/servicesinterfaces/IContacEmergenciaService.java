package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Contacto_Emergencia;

import java.util.List;

public interface IContacEmergenciaService {
    public void insert(Contacto_Emergencia contactoEmergencia);
    public List<Contacto_Emergencia> list();
    public List<String[]> listaCantidadRelacionesContacto(String relacion_contacto);
}
