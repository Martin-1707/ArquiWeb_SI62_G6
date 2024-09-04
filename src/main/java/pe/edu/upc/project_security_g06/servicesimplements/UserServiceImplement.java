package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Users;
import pe.edu.upc.project_security_g06.repositories.IdUserRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IdUserService {
    @Autowired
    private IdUserRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users user) {
        uR.save(user);
    }

    @Override
    public Users listId(int id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public void update(Users user) {
        uR.save(user);
    }

    @Override
    public List<Users> buscar(String username) {
        return uR.buscar(username);
    }
}
