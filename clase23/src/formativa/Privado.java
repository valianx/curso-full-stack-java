package formativa;

public class Privado extends Avion {
    private int costo;

    public Privado(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        System.out.println("Obtener el costo del avión privado");
        return costo;
    }

    public void setCosto(int costo) {
        System.out.println("establecer el costo del avión privado");
        this.costo = costo;
    }
}
