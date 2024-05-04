/*
Nombre:Abigail Espinosa
Programacion II
TallerMetodosObjetos
 */

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        // Crear un empleado
        Empleado empleado1 = new Empleado("Abigail Espinosa", 'F', "1751444710", LocalDate.of(2005, 5, 12), LocalDate.of(2023,12,4),2200.0);

        System.out.println("EMPLEADO:");

        // Modificar el salario del empleado
        empleado1.modificarSalario(3000.0);

        // Imprimir información del empleado
        empleado1.imprimirInformacion();

        // Calcular la edad del empleado
        System.out.println("Edad: " + empleado1.calcularEdad());
        // residencia
        Residencia residencia1 = new Residencia("El Condado", "Quito");
        // Calcular prestaciones del empleado
        System.out.println("Prestaciones del empleado: " + empleado1.calcularPrestaciones());
    }
}