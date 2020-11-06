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
public class Vehiculo implements IActor, IObjetoInerte {
    private int codigo;
    private int cantidadRuedas;
    private String color;
    private double precio;

    public Vehiculo(int codigo, int cantidadRuedas, String color, double precio) {
        this.codigo = codigo;
        this.cantidadRuedas = cantidadRuedas;
        this.color = color;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", cantidadRuedas=" + cantidadRuedas + ", color=" + color + ", precio=" + precio + '}';
    }

    

   /* @Override
    public boolean buscar(String codigo) {
        boolean result=false;
        int intCodigo = Integer.parseInt(codigo);
        if (this.codigo == intCodigo) {
            result = true;
        } 
        return result;
    }*/

    @Override
    public String imprimir() {
        return "El valor del vehiculo en pesos es " + precio;
    }

    @Override
    public String precioDolar() {
       return  "El valor del vehiculo en dolar es " + precio/dolar;
    }

   

    
    
}
