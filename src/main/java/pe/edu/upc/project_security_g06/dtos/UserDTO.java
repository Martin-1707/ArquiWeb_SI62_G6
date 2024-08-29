package pe.edu.upc.project_security_g06.dtos;

public class UserDTO {
    private int idUser;
    private String username;
    private String UserLastName;
    private int dni;
    private int cel;
    private  String email;
    private String password;



    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserLastName() {
        return UserLastName;
    }
    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getCel() {
        return cel;
    }
    public void setCel(int cel) {
        this.cel = cel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
