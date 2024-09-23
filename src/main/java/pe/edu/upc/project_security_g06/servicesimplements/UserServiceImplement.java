package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.dtos.UsuarioDispositivoRolDTO;
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
    public List<String[]> obtenerInformacionClinicaPorUsuario(Long idUsuario) {
        return uR.findInformacionClinicaByUsuarioId(idUsuario);
    }
}
