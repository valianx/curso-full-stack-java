/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28ejercicio;

/**
 *
 * @author Ruben
 */
public class Bicicleta extends Vehiculo   {
    private boolean tieneCanasto;

    public Bicicleta(boolean tieneCanasto, int codigo, int cantidadRuedas, String color, double precio) {
        super(codigo, cantidadRuedas, color, precio);
        this.tieneCanasto = tieneCanasto;
    }

    public boolean isTieneCanasto() {
        return tieneCanasto;
    }

    public void setTieneCanasto(boolean tieneCanasto) {
        this.tieneCanasto = tieneCanasto;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "tieneCanasto=" + tieneCanasto + " " + super.toString() +'}';
    }
    
    
}
