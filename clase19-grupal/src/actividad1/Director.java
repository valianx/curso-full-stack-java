package actividad1;

import java.util.ArrayList;

public class Director {
    private String nombre;
    private String nacionalidad;
    private boolean oscar;

    public Director(String nombre, String nacionalidad, boolean oscar) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.oscar = oscar;
    }

    public Director() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isOscar() {
        return oscar;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    @Override
    public String toString() {
        return "Director{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", oscar=" + oscar +
                '}';
    }

    public ArrayList<Director> generar(){
        ArrayList<Director> lista = new ArrayList<>();

        lista.add(new Director("Martin Scorsese", "Estados unidos", true));
        lista.add(new Director("Alfred Hitchcock", "Estados unidos", false));
        lista.add(new Director("Quentin Tarantino", "Estados unidos", true));
        return lista;
    }
    public void imprimir(ArrayList<Director> lista){
        for(Director director:lista){
            System.out.println(director);
        }
    }
}
