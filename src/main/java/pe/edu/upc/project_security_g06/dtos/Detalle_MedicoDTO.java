package pe.edu.upc.project_security_g06.dtos;


import pe.edu.upc.project_security_g06.entities.Alergias;
import pe.edu.upc.project_security_g06.entities.Enfermedades;
import pe.edu.upc.project_security_g06.entities.Historial_Clinico;

public class Detalle_MedicoDTO {
    private int IdDetalleMedico;
    private Alergias ale;
    private Enfermedades enfe;
    private Historial_Clinico hisclinico;

    public int getIdDetalleMedico() {
        return IdDetalleMedico;
    }
    public void setIdDetalleMedico(int IdDetalleMedico) {
        this.IdDetalleMedico = IdDetalleMedico;
    }
    public Alergias getAle() {
        return ale;
    }
    public void setAle(Alergias ale) {
        this.ale = ale;
    }
    public Enfermedades getEnfe() {
        return enfe;
    }
    public void setEnfe(Enfermedades enfe) {
        this.enfe = enfe;
    }
    public Historial_Clinico getHisclinico() {
        return hisclinico;
    }
    public void setHisclinico(Historial_Clinico hisclinico) {
        this.hisclinico = hisclinico;
    }
}
