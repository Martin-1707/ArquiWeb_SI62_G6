package pe.edu.upc.project_security_g06.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.project_security_g06.dtos.UserDTO;
import pe.edu.upc.project_security_g06.entities.User;

import java.util.List;

public interface IdUserService {
    public List<User> list();
    public void insert(User user);
    public User listId(int id);
    public void delete(int id);
    public void update(User user);
    public List<User> buscar (String username);
}
