package model;

// Clase que agrega atributos propios de un empleado
public class Empleado extends Persona {
    private String cargo;
    private double salario;

    // Constructor que usa "super" para heredar los datos de Persona
    public Empleado(String nombre, String rut, String telefono, Direccion direccion, String cargo, double salario) {
        super(nombre, rut, telefono, direccion);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters y Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Sobrescribo el método toString() para agregar los datos de empleados
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo +
                "\nSalario: $" + salario;
    }
}
