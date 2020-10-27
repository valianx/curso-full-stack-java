package actividad1;

import java.util.ArrayList;

public class Distribuidora {
    private String nombre;
    private int año;

    public Distribuidora(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    public Distribuidora() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Distribuidora{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                '}';
    }

    public ArrayList<Distribuidora> generar(){
        ArrayList<Distribuidora> lista = new ArrayList<>();

        lista.add(new Distribuidora("Columbia Pictures", 1924));
        lista.add(new Distribuidora("20th Century-Fox", 1935));
        lista.add(new Distribuidora("Warner Bros", 1923));
        return lista;
    }
    public void imprimir(ArrayList<Distribuidora> lista){
        for(Distribuidora distribuidora:lista){
            System.out.println(distribuidora);
        }
    }
}
