package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Dispositivo;

import java.util.List;

public interface IDispositivoService {
    public void insert(Dispositivo dispositivo);
    public Dispositivo list(int Idispositivo);

    public List<String[]> obtenerdetalledispositivoycontactoautoridad (Integer idDispositivo);
}
