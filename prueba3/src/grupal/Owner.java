package grupal;

public class Owner {
    private String nombre;
    private int codigo;
    private int telefono;
    private char tipo;

    public Owner(String nombre, int codigo, int telefono, char tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean obtenerCodigo() {
        return codigo == 22;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", telefono='" + telefono + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}


