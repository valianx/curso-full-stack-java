/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad18;

/**
 *
 * @author Asus
 */
public class Ropa {
    private String tipoRopa;
    private String talla;
    private String modelo;
    private double precio;

    public Ropa(String tipoRopa, String talla, String modelo, double precio) {
        this.tipoRopa = tipoRopa;
        this.talla = talla;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getTipoRopa() {
        return tipoRopa;
    }

    public void setTipoRopa(String tipoRopa) {
        this.tipoRopa = tipoRopa;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ropa{" + "tipoRopa=" + tipoRopa + ", talla=" + talla + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

    //metodos customer - personalizados
    //1. festividad  2.Temporada Baja 3. Dia de semana
    public double precioDescuento(int tipoPromocion){
        double descuento, total=0;
       
        if(tipoPromocion == 1){
            descuento = precio*0.3;
            total = precio - descuento;
        }
        
        if(tipoPromocion == 2){
            descuento = precio*0.6;
            total = precio - descuento;
        }
        
        if(tipoPromocion == 3){
            descuento = precio*0.15;
            total = precio - descuento;
        }
        return total;
    }

    
    //1. Imprimir toda la información de la prenda. ToString()
    public String impresion(int tipoPromocion){
        String salida="";
        if(tipoPromocion == 1){
           salida = salida + "Festividad - 30% - Total a pagar :" 
                   +precioDescuento(tipoPromocion); 
        }
        
        if(tipoPromocion == 2){
            salida = salida + "Temporada Baja - 60% - Total a pagar :" 
                   +precioDescuento(tipoPromocion); 
        }
        
        if(tipoPromocion == 3){
          salida = salida + "Dia de Semana - 60% - Total a pagar :" 
                   +precioDescuento(tipoPromocion); 
        }
        return salida;
    }
   
}
