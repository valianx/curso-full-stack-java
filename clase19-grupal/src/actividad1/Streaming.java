package actividad1;

import java.util.ArrayList;

public class Streaming {
    public static void main(String[] args) {
        ArrayList<Director> listaDirectores = new ArrayList<>();
        ArrayList<Distribuidora> listaDistribuidoras = new ArrayList<>();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        System.out.println("Bienvenido al programa\n");
        Pelicula pelicula = new Pelicula();
        Director director = new Director();
        Distribuidora distribuidora = new Distribuidora();

        listaDirectores = director.generar();
        listaDistribuidoras = distribuidora.generar();
        listaPeliculas = pelicula.generar();
        System.out.println("Listado de directores: ");
        director.imprimir(listaDirectores);
        System.out.println("");
        System.out.println("Listado de distrubuidoras: ");
        distribuidora.imprimir(listaDistribuidoras);
        System.out.println("");
        System.out.println("Listado de peliculas: ");
        pelicula.imprimir(listaPeliculas);
        System.out.println("");

        System.out.println("Fin programa");

    }
}
