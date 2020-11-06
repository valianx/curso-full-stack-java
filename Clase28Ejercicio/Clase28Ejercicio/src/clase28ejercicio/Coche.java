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
public class Coche extends Vehiculo {
    private String patente;
    private int cantidadPuertas;

    public Coche(String patente, int cantidadPuertas, int codigo, int cantidadRuedas, String color, double precio) {
        super(codigo, cantidadRuedas, color, precio);
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "patente=" + patente + ", cantidadPuertas=" + cantidadPuertas + super.toString() + '}';
    }

    

}
