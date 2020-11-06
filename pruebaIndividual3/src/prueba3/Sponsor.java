package prueba3;

public class Sponsor {
    private String rut;
    private String nombre;
    private int monto;
    private char nacionalidad;

    public Sponsor(String rut, String nombre, int monto, char nacionalidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.monto = monto;
        this.nacionalidad = nacionalidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public char getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(char nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", monto=" + monto +
                ", nacionalidad=" + nacionalidad +
                '}';
    }
}
