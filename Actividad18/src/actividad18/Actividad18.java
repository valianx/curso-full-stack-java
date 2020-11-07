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
public class Actividad18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ropa prenda1 = new Ropa("Poleron", "XL", "Adidas", 55000 );
        Ropa prenda2 = new Ropa("Zapatilla", "45", "Nike", 30000 );
        
        //descuento Festividad para prenda 1
        System.out.println(prenda1.impresion(1));
        
        //descuento Temporada Baja para prenda 2
        System.out.println(prenda2.impresion(2));
        
    }
    
}
