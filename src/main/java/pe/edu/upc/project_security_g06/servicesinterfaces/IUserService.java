package pe.edu.upc.project_security_g06.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;
import pe.edu.upc.project_security_g06.dtos.UsuarioDispositivoRolDTO;
import pe.edu.upc.project_security_g06.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(int id);

    public void update(Users usuario);

    public Users listarId(int idUsuario);

    public List<String[]> obtenerUsuariosConDispositivosYRoles();

    public List<String[]> findConteoAlergiaYtipoEnfermedadXusuario(String nombre);

    public List<String[]> obtenerInformacionClinicaPorUsuario(int idUsuario);

    public List<String[]> obtenerCantidadDispositivosPorUsuario();

    public List<String[]> obtenerHistorialUbicacionPorUsuario(int idUsuario);

    public List<String[]> obtenerEnfermedadesPorUsuario(int idUsuario);

    public List<String[]> obtenerAlergiasPorUsuario(int idUsuario);

    public List<String[]> ObtenerContactosEmergenciaPersonalesDeUsuario(String nombre);


}
