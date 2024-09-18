package pe.edu.upc.project_security_g06.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "HistorialClinico")
public class Historial_Clinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdHistorialClinico;

    @Column(name = "SeguroMed",nullable = false,length = 20)
    private String SeguroMed;

    public Historial_Clinico() {
    }

    public Historial_Clinico(int IdHistorialClinico, String SeguroMed) {
        this.IdHistorialClinico = IdHistorialClinico;
        this.SeguroMed = SeguroMed;
    }
    public int getIdHistorialClinico() {
        return IdHistorialClinico;
    }
    public void setIdHistorialClinico(int IdHistorialClinico) {
        this.IdHistorialClinico = IdHistorialClinico;
    }
    public String getSeguroMed() {
        return SeguroMed;
    }
    public void setSeguroMed(String SeguroMed) {
        this.SeguroMed = SeguroMed;
    }
}
