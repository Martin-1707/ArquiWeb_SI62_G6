package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Users;
import pe.edu.upc.project_security_g06.repositories.IUserRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Users listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }

    @Override
    public List<String[]> obtenerUsuariosConDispositivosYRoles() {
        return uR.findUsuariosWithDevicesAndRoles();
    }


    @Override
    public List<String[]> findConteoAlergiaYtipoEnfermedadXusuario(String nombre) {
        return uR.findConteoAlergiaYtipoEnfermedadXusuario(nombre);
    }


    @Override
    public List<String[]> ObtenerContactosEmergenciaPersonalesDeUsuario(String nombre) {
        return uR.findContactosByUsuario(nombre);
    }

    public List<String[]> obtenerInformacionClinicaPorUsuario(Long idUsuario) {
        return uR.findInformacionClinicaByUsuarioId(idUsuario);
    }

    @Override
    public List<String[]> obtenerCantidadDispositivosPorUsuario() {
        return uR.findCantidadDispositivosPorUsuario();


    @Override
    public List<String[]> obtenerHistorialUbicacionPorUsuario(Long idUsuario) {
        return uR.findHistorialUbicacionByUsuarioId(idUsuario);
    }

    @Override
    public List<String[]> obtenerEnfermedadesPorUsuario(Long idUsuario) {
        return uR.findEnfermedadesByUsuarioId(idUsuario);
    }

    @Override
    public List<String[]> obtenerAlergiasPorUsuario(Long idUsuario) {
        return uR.findAlergiasByUsuarioId(idUsuario);
    }
}
