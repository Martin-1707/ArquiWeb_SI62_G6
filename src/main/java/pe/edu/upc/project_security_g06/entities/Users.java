package pe.edu.upc.project_security_g06.entities;

import jakarta.persistence.*;

//Falta_poner_la_fk_de_roll
@Entity
@Table(name = "Usuario")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Column(name = "UserLastName", nullable = false, length = 50)
    private String UserLastName;
    @Column(name = "Dni", nullable = false, length = 50)
    private int dni;
    @Column(name = "Celular", nullable = false, length = 50)
    private int cel;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "password", nullable = false, length = 50)
    private String password;

    public Users() {
    }

    public Users(int idUser, String username, String UserLastName, int dni, int cel, String email, String password) {
        this.idUser = idUser;
        this.username = username;
        this.UserLastName = UserLastName;
        this.dni = dni;
        this.cel = cel;
        this.email = email;
        this.password = password;
    }


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