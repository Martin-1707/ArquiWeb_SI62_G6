package pe.edu.upc.project_security_g06.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Rols {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoll;

    @Column(name = "nombreRol", nullable = false, length = 50)
    private String nombreRol;

    public Rols() {
    }

    public Rols(int idRoll, String nombreRol) {
        this.idRoll = idRoll;
        this.nombreRol = nombreRol;
    }

    public int getIdRoll() {return idRoll;}
    public void setIdRoll(int idRoll) {this.idRoll = idRoll;}
    public String getNombreRol() {return nombreRol;}
    public void setNombreRol(String nombreRol) {this.nombreRol = nombreRol;}

}
