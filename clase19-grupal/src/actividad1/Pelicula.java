package actividad1;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private int duracion;
    private Director director;
    private Distribuidora distribuidora;
    private String reseña;

    public Pelicula(String titulo, int duracion, Director director, Distribuidora distribuidora, String reseña) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.distribuidora = distribuidora;
        this.reseña = reseña;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", director=" + director +
                ", distribuidora=" + distribuidora +
                ", reseña='" + reseña + '\'' +
                '}';
    }

    public ArrayList<Pelicula> generar(){
        ArrayList<Pelicula> lista = new ArrayList<>();

        lista.add(new Pelicula("El Señor de los Anillos: el retorno del Rey", 263, new Director("Peter Jackson", "nueva zelanda",true), new Distribuidora("Warner Bros", 1923), "Frodo, Sam y Gollum se acercan al monte del Destino, donde destruirán el anillo o perecerán en el intento. Mientras, Aragorn y sus compañeros se enfrentan a las monstruosas tropas de Sauron."));
        lista.add(new Pelicula("Joker", 263, new Director("Todd Phillips", "Estados Unidos",false), new Distribuidora("Warner Bros", 1923), "Arthur Fleck adora hacer reír a la gente, pero su carrera como comediante es un fracaso. El repudio social, la marginación y una serie de trágicos acontecimientos lo conducen por el sendero de la locura y, finalmente, cae en el mundo del crimen."));
        lista.add(new Pelicula("El hobbit: un viaje inesperado", 122, new Director("Peter Jackson", "nueva zelanda",true), new Distribuidora("Warner Bros", 1923), "Bilbo Bolsón lleva una vida sencilla con sus compañeros hobbits en la comarca, hasta que el mago Gandalf llega y lo convence de unirse a un grupo de enanos para recuperar el reino de Erebor. El viaje lleva a Bilbo en un camino a través de tierras peligrosas llenas de orcos, goblins y otras amenazas, además de su encuentro con Gollum y un sencillo anillo de oro que está unido al destino de la Tierra Media de una forma que Bilbo no puede imaginarse."));

        return lista;
    }
    public void imprimir(ArrayList<Pelicula> lista){
        for(Pelicula pelicula:lista){
            System.out.println(pelicula);
        }
    }
}
