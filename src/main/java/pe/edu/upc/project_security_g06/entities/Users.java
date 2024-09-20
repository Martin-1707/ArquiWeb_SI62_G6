package pe.edu.upc.project_security_g06.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdUsario;

    @Column(name = "us_nombre",nullable = false,length = 30)
    private String us_nombre;
    @Column(name = "us_apellido",nullable = false,length = 30)
    private String us_apellido;
    @Column(name = "us_dni",nullable = false,unique = true,length = 8)
    private int us_dni;
    @Column(name = "us_telefono",nullable = false,unique = true,length = 9)
    private int us_telefono;
    @Column(name = "us_fechanacimiento",nullable = false)
    private LocalDate us_fechanacimiento;
    @Column(name = "us_email",nullable = false,length = 30)
    private String us_email;
    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 200)
    private String password;
    private Boolean enabled;
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Users() {
    }

    public Users(String us_nombre,String us_apellido,int us_dni,int us_telefono,LocalDate us_fechanacimiento,String us_email) {
        this.us_nombre = us_nombre;
        this.us_apellido = us_apellido;
        this.us_dni = us_dni;
        this.us_telefono = us_telefono;
        this.us_fechanacimiento = us_fechanacimiento;
        this.us_email = us_email;
    }

    public Long getIdUsario() {
        return IdUsario;
    }

    public void setIdUsario(Long IdUsario) {
        this.IdUsario = IdUsario;
    }

    public String getUs_nombre() {
        return us_nombre;
    }
    public void setUs_nombre(String us_nombre) {
        this.us_nombre = us_nombre;
    }
    public String getUs_apellido() {
        return us_apellido;
    }
    public void setUs_apellido(String us_apellido) {
        this.us_apellido = us_apellido;
    }
    public int getUs_dni() {
        return us_dni;
    }
    public void setUs_dni(int us_dni) {
        this.us_dni = us_dni;
    }
    public int getUs_telefono() {
        return us_telefono;
    }
    public void setUs_telefono(int us_telefono) {
        this.us_telefono = us_telefono;
    }
    public LocalDate getUs_fechanacimiento() {
        return us_fechanacimiento;
    }
    public void setUs_fechanacimiento(LocalDate us_fechanacimiento) {
        this.us_fechanacimiento = us_fechanacimiento;
    }
    public String getUs_email() {
        return us_email;
    }
    public void setUs_email(String us_email) {
        this.us_email = us_email;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}