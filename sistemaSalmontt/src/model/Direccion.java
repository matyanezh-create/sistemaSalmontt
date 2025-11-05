package model;

// Clase que representa una dirección física
// Se usará como parte de la clase Persona (composición)
public class Direccion {
    private String calle;
    private String ciudad;
    private String region;
    private String codigoPostal;

    // Constructor
    public Direccion(String calle, String ciudad, String region, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.codigoPostal = codigoPostal;
    }

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //Muestrar los datos en una sola línea
    public String toString() {
        return calle + ", " + ciudad + ", " + region + " (" + codigoPostal + ")";
    }
}
