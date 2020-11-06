/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27_actividad27;

/**
 *
 * @author Katherine
 */
public class Clase27_actividad27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Costruir un objeto lomo y manzana.
	
	//Imprimir los atributos del lomo y manzana.
        
        Carne lomo = new Carne('V',100,15,7000,"Chile");
        FrutaVerdura manzana = new FrutaVerdura("Si",101,30,700,"Chile");
        
        //Calcular el total de la venta de 10 lomos un día LUNES.
        System.out.println("El valor de lomo es "+ (int) lomo.getValor());
        System.out.println("El valor del descuento el día lunes es de: "+ (int) lomo.calcularDescuento("miercoles"));
        System.out.println("El total a pagar considerando descuentos comprando 10 lomos es: "+(int) lomo.calcularTotal(10, "miercoles"));
        

        System.out.println(lomo.toString());
        System.out.println(manzana.toString());

        
    }
    
}
