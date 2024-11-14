package pe.edu.upc.project_security_g06.dtos;


import pe.edu.upc.project_security_g06.entities.Dispositivo;
import pe.edu.upc.project_security_g06.entities.Ubicacion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Historial_UbicacionDTO {

    private int IdHistorial_Ubicacion;
    private LocalDate fecha;
    private LocalTime hora;
    private Dispositivo dis;
    private Ubicacion ubi;

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
