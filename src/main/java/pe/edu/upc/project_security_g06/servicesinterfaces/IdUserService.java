package pe.edu.upc.project_security_g06.servicesinterfaces;

import pe.edu.upc.project_security_g06.entities.Users;

import java.util.List;

public interface IdUserService {
    public List<Users> list();
    public void insert(Users user);
    public Users listId(int id);
    public void delete(int id);
    public void update(Users user);
    public List<Users>buscar(String username);
}
