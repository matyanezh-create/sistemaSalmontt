package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

// Clase principal del programa
// Aquí probamos que las clases funcionen correctamente
public class Main {
    public static void main(String[] args) {

        //Dirección
        Direccion dir1 = new Direccion("Av. Los Salmones 123", "Puerto Montt", "Los Lagos", "5670000");
        Direccion dir2 = new Direccion("Calle del Mar 45", "Puerto Varas", "Los Lagos", "6780000");
        Direccion dir3 = new Direccion("Ruta 5 Sur Km 1000", "Osorno", "Los Lagos", "9870000");

        //Persona y Empleado
        Persona p1 = new Persona("Martina Garcia", "14.345.978-9", "+56 9 4839 4389", dir1);
        Empleado e1 = new Empleado("Carlos Hernandez", "19.654.321-0", "+56 9 3637 7343", dir2, "Supervisor ", 880000);
        Empleado e2 = new Empleado("FelipeTorres", "20.554.575-5", "+56 9 5443 9876", dir3, "Analista ", 670000);

        // Mostrar resultados por consola
        System.out.println("=== Persona ===");
        System.out.println(p1);
        System.out.println("\n=== Empleado 1 ===");
        System.out.println(e1);
        System.out.println("\n=== Empleado 2 ===");
        System.out.println(e2);
    }
}
