package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Users;
import pe.edu.upc.project_security_g06.repositories.IdUserRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IdUserService;
//falta_cambiar_todo
import java.util.List;

@Service
public class UserServiceImplement implements IdUserService {
    @Autowired
    private IdUserRepository dR;

    @Override
    public List<Users> list() {
        return List.of();
    }

    @Override
    public void insert(Users user) {

    }

    @Override
    public Users listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Users user) {

    }

    @Override
    public List<Users> buscar(String username) {
        return List.of();
    }
}
