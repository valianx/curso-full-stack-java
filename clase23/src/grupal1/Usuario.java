package grupal1;

public class Usuario {
    private String nombre;
    private String password;
    private String run;
    private String ciudad;


    public Usuario(String nombre, String password, String run, String ciudad) {

        this.nombre = nombre;
        this.password = password;
        this.run = run;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", run='" + run + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
