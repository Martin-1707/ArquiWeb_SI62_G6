package pe.edu.upc.project_security_g06.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Ubicacions")
public class Ubicacions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_postal;

    @Column(name = "Ciudad", nullable = false, length = 50)
    private String ciudad;

    @Column(name = "Distrito", nullable = false, length = 50)
    private String distrito;

    @Column(name = "Longitud", nullable = false, length = 100)
    private int longitud;

    @Column(name = "Latitud", nullable = false, length = 100)
    private int latitud;

    public Ubicacions() {}

    public Ubicacions(int id_postal, String ciudad, String distrito, int longitud, int latitud) {
        this.id_postal = id_postal;
        this.ciudad = ciudad;
        this.distrito = distrito;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public int getId_postal() {return id_postal;}
    public void setId_postal(int id_postal) {this.id_postal = id_postal;}
    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public String getDistrito() {return distrito;}
    public void setDistrito(String distrito) {this.distrito = distrito;}
    public int getLongitud() {return longitud;}
    public void setLongitud(int longitud) {this.longitud = longitud;}
    public int getLatitud() {return latitud;}
    public void setLatitud(int latitud) {this.latitud = latitud;}



}
