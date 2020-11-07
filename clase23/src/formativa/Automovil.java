package formativa;

public class Automovil extends Transporte {
    private double velocidad;
    private double potencia;
    private int pasajeros;
    private double consumo;
    private double cuatro;

    public double getVelocidad() {
        System.out.println("Obtener velocidad del automóvil");
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        System.out.println("Establecer velocidad del automóvil");
        this.velocidad = velocidad;
    }

    public double getPotencia() {
        System.out.println("Obtener potencia del automóvil");
        return potencia;
    }

    public void setPotencia(double potencia) {
        System.out.println("Establecer potencia del automóvil");
        this.potencia = potencia;
    }

    public int getPasajeros() {
        System.out.println("Obtener capacidad de pasajeros del automóvil");
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        System.out.println("Establecer capacidad de pasajeros del automóvil");
        this.pasajeros = pasajeros;
    }


    public double getConsumo() {
        System.out.println("Obtener consumo del automóvil");
        return consumo;
    }

    public void setConsumo(double consumo) {
        System.out.println("Establecer consumo del automóvil");
        this.consumo = consumo;
    }


    public double getCuatro() {
        System.out.println("Obtener si el automóvil es 4x4");
        return cuatro;
    }

    public void setCuatro(double cuatro) {
        System.out.println("Establecer si el automóvil es 4x4");
        this.cuatro = cuatro;
    }
}
