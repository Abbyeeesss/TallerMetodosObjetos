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
        Empleado emp1 = new Empleado("1751444710", "Abigail Espinosa", 'F', fecha_nacimiento, fecha_ingreso);
        emp1.getResidencia().setCiudad("Quito");
        emp1.getResidencia().setDireccion("El Condado");
        System.out.println("ID: " + emp1.id);
        System.out.println("Cédula: " + emp1.getCedula());
        System.out.println("Nombre: " + emp1.getNombre());
        System.out.println("Género: " + emp1.getGenero());
        System.out.println("Edad: " + emp1.CalcularEdad()+" años    ");
        System.out.println("Dirección: " + emp1.getResidencia().getDireccion());
        System.out.println("\nEl sueldo actual es: " + emp1.getSalario());
        emp1.setSalario(400);
        System.out.println("Sueldo actualizado: " + emp1.getSalario());

        emp1.CalcularPrestaciones();
    }
}