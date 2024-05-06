import java.util.Calendar;
import java.util.Date;

public class Empleado {
    private static int ultimoId = 999;
    public int id;
    public String cedula;
    public String nombre;
    private Residencia residencia;
    private char genero;
    private Date fecha_nacimiento;
    private double salario;
    private Date fecha_ingreso;
    private int edad;
    public double prestaciones;
    private int antiguedad;


    public Empleado(){
        this.id = ++ultimoId;
        this.cedula="";
        this.nombre="";
        this.genero='F';
        this.fecha_nacimiento= new Date();
        this.salario=400;
        this.fecha_ingreso= new Date();
        this.residencia = Residencia.createResidencia("Dirección1", "Quito", 109876);
    }

    public Empleado(String cedula, String nombre, char genero, Date fecha_nacimiento, Date fecha_ingreso){
        this.id = ++ultimoId;
        this.cedula=cedula;
        this.nombre=nombre;
        this.genero=genero;
        this.fecha_nacimiento= fecha_nacimiento;
        this.salario=400;
        this.fecha_ingreso= fecha_ingreso;
        this.residencia = Residencia.createResidencia("Dirección1", "Quito", 109876);
    }



    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Residencia getResidencia() {
        return residencia;
    }

    public void setResidencia(Residencia residencia) {
        this.residencia = residencia;
    }

    public int CalcularEdad(){
        Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);

        calendar.setTime(fecha_nacimiento);
        int anio_nacimiento = calendar.get(Calendar.YEAR);

        return anio_actual - anio_nacimiento;
    }


    public void CalcularAntiguedad(){
        Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);

        calendar.setTime(fecha_ingreso);
        int anio_ingreso = calendar.get(Calendar.YEAR);

        this.antiguedad = anio_actual - anio_ingreso;
    }

    public void CalcularPrestaciones(){
        CalcularAntiguedad();
        this.prestaciones = this.antiguedad * (this.salario/12);
        System.out.println("Prestaciones: "+ String.format("%.2f",prestaciones)+"$" );
    }
}