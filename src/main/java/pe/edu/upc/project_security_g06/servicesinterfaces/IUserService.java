package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.dtos.UsuarioDispositivoRolDTO;
import pe.edu.upc.project_security_g06.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);

    public List<String[]> obtenerUsuariosConDispositivosYRoles();

    public List<String[]> obtenerInformacionClinicaPorUsuario(Long idUsuario);

    public List<String[]> obtenerCantidadDispositivosPorUsuario();

    public List<String[]> obtenerHistorialUbicacionPorUsuario(Long idUsuario);

}
