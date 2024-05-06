public class Residencia {
    private String direccion;
    private String ciudad;
    private int codigo_postal;

    private Residencia(String direccion, String ciudad, int codigo_postal) {
        setDireccion(direccion);
        setCiudad(ciudad);
        setCodigo_postal(codigo_postal);
    }

    public static Residencia createResidencia(String direccion, String ciudad, int codigo_postal) {
        return new Residencia(direccion, ciudad, codigo_postal);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = (direccion != null && !direccion.isEmpty()) ? direccion : this.direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = (ciudad != null && !ciudad.isEmpty()) ? ciudad : this.ciudad;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = (codigo_postal > 0) ? codigo_postal : this.codigo_postal;
    }
}
