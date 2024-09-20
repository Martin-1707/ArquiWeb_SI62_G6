package pe.edu.upc.project_security_g06.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Historial_Ubicacion")
public class Historial_Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdHistorial_Ubicacion;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "hora",nullable = false)
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "Idispositivo")
    private Dispositivo dis;

    @ManyToOne
    @JoinColumn(name = "IdUbicacion")
    private Ubicacion ubi;

    public Historial_Ubicacion() {
    }

    public Historial_Ubicacion(int IdHistorial_Ubicacion, LocalDate fecha, LocalTime hora, Dispositivo dis, Ubicacion ubi) {
        this.IdHistorial_Ubicacion = IdHistorial_Ubicacion;
        this.fecha = fecha;
        this.hora = hora;
        this.dis = dis;
        this.ubi = ubi;
    }
    public int getIdHistorial_Ubicacion() {
        return IdHistorial_Ubicacion;
    }
    public void setIdHistorial_Ubicacion(int IdHistorial_Ubicacion) {
        this.IdHistorial_Ubicacion = IdHistorial_Ubicacion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public Dispositivo getDis() {
        return dis;
    }
    public void setDis(Dispositivo dis) {
        this.dis = dis;
    }
    public Ubicacion getUbi() {
        return ubi;
    }
    public void setUbi(Ubicacion ubi) {
        this.ubi = ubi;
    }
}
