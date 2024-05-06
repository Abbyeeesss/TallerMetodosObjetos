/*
Nombre:Abigail Espinosa
Programacion II
TallerMetodosObjetos
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date fecha_nacimiento = new Date("17/3/2005");
        Date fecha_ingreso = new Date("13/11/2019");

        System.out.println("DATOS DE EMPLEADO:");

        Empleado empleado1 = new Empleado("1751444710", "Abigail Espinosa", 'F', fecha_nacimiento, fecha_ingreso);

        empleado1.getResidencia().setCiudad("Quito");
        empleado1.getResidencia().setDireccion("El Condado");

        // Impresión de los detalles del empleado.
        System.out.println("ID: " + empleado1.id);  // Aquí se asume que 'id' es público o se accede dentro de su contexto permitido.
        System.out.println("Cédula: " + empleado1.getCedula());
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Género: " + empleado1.getGenero());
        System.out.println("Edad: " + empleado1.CalcularEdad() + " años");
        System.out.println("Dirección: " + empleado1.getResidencia().getDireccion());

        // Impresión y actualización del salario del empleado.
        System.out.println("\nEl sueldo actual es: " + empleado1.getSalario());
        empleado1.setSalario(400);
        System.out.println("Sueldo actualizado: " + empleado1.getSalario());

        // Cálculo de las prestaciones del empleado.
        empleado1.CalcularPrestaciones();
    }
}
