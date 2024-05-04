import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    private String nombre;
    private char genero;
    private String cedula;
    private LocalDate fechaNacimiento; // Changed to fechaNacimiento
    private LocalDate fechaContratacion;
    private double salario;

    public Empleado(String nombre, char genero, String cedula, LocalDate fechaNacimiento, LocalDate fechaContratacion, double salario) {
        this.nombre = nombre;
        this.genero = genero;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public int calcularEdad() {
        LocalDate currentDate = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, currentDate); // Calculate age based on fechaNacimiento
        return periodo.getYears();
    }

    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public double calcularPrestaciones() {
        int antiguedad = calcularEdad();
        return (antiguedad * salario) / 12;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Cédula: " + cedula);
        System.out.println("Fecha de contratación: " + fechaContratacion);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
}
