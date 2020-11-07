package formativa;

public class Avion extends Transporte {
    private double velocidad;
    private double potencia;
    private int pasajeros;
    private double consumo;
    private double altura;

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
        System.out.println("Obtener capacidad de pasajeros del avión");
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        System.out.println("Establecer capacidad  del avión");
        this.pasajeros = pasajeros;
    }


    public double getConsumo() {
        System.out.println("Obtener consumo  del avión");
        return consumo;
    }

    public void setConsumo(double consumo) {
        System.out.println("Establecer consumo del avión");
        this.consumo = consumo;
    }

    public double getAltura() {
        System.out.println("Obtener altura del avión");
        return altura;
    }

    public void setAltura(double altura) {
        System.out.println("Establecer altura del avión");
        this.altura = altura;
    }
}
