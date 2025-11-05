package model;

// Clase base que representa a una persona dentro de la empresa
// Esta clase será la "madre" de otras, como Empleado.
public class Persona {
    private String nombre;
    private String rut;
    private String telefono;
    private Direccion direccion; // Relación de composición: una persona tiene una dirección

    public Persona(String nombre, String rut, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Métodos getter y setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    //Muestrar los datos de forma legible

    public String toString() {
        return "Nombre: " + nombre +
                "\nRUT: " + rut +
                "\nTeléfono: " + telefono +
                "\nDirección: " + direccion;
    }
}
