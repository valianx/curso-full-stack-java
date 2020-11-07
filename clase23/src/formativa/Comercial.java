package formativa;

public class Comercial extends Avion {
    private int costo;

    public Comercial(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        System.out.println("Obtener el costo del avión comercial");

        return costo;
    }

    public void setCosto(int costo) {
        System.out.println("Estanlecer el costo del avión comercial");
        this.costo = costo;
    }
}
