package pe.edu.upc.project_security_g06.dtos;


public class Historial_ClinicoDTO {

    private int IdHistorialClinico;
    private String SeguroMed;

    public  int getIdHistorialClinico() {
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
