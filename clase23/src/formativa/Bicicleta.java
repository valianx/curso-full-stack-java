package formativa;

public class Bicicleta extends Transporte {
    private double velocidad;
    private double potencia;
    private int pasajeros;
    private double consumo;
    private boolean canasto;

    public Bicicleta(double velocidad, double potencia, double consumo, boolean canasto) {
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.pasajeros = 1;
        this.consumo = consumo;
        this.canasto = canasto;
    }

    public double getVelocidad() {
        System.out.println("Obtener velocidad del avión");
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        System.out.println("Establecer velocidad del avión");
        this.velocidad = velocidad;
    }

    public double getPotencia() {
        System.out.println("Obtener potencia del avión");

        return potencia;
    }

    public void setPotencia(double potencia) {
        System.out.println("Establecer potencia del avión");
        this.potencia = potencia;
    }

    public int getPasajeros() {
        System.out.println("Obtener capacidad de pasajeros de la bicicleta");
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        System.out.println("Establecer capacidad de pasajeros de la bicicleta");
        this.pasajeros = pasajeros;
    }


    public double getConsumo() {
        System.out.println("Obtener consumo de la bicicleta");
        return consumo;
    }

    public void setConsumo(double consumo) {
        System.out.println("Establecer consumo de la bicicleta");
        this.consumo = consumo;
    }

    public boolean isCanasto() {
        System.out.println("Obetener si tiene canasta la bicicleta");
        return canasto;
    }

    public void setCanasto(boolean canasto) {
        System.out.println("Establecer si tiene canasta la bicicleta");
        this.canasto = canasto;
    }
}
