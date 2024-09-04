package pe.edu.upc.project_security_g06.dtos;

public class UbicacionsDTO {
    private int id_postal;
    private String ciudad;
    private String distrito;
    private int longitud;
    private int latitud;

    public int getId_postal() {return id_postal;}
    public void setId_postal(int id_postal) {this.id_postal = id_postal;}
    public String getCiudad() {return ciudad;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    private String getDistrito() {return distrito;}
    public void setDistrito(String distrito) {this.distrito = distrito;}
    public int getLongitud() {return longitud;}
    public void setLongitud(int longitud) {this.longitud = longitud;}
    public int getLatitud() {return latitud;}
    public void setLatitud(int latitud) {this.latitud = latitud;}

}
