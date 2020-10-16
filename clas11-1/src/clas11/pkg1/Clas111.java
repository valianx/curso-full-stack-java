/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clas11.pkg1;
import java.util.Scanner;

/**
 *
 * @author Valian
 */
public class Clas111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, clave;
        int precio;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido al programa");

        System.out.println("Ingrese el nombre del articulo");
        nombre = scan.next();

        System.out.println("Ingrese el precio del articulo");
        precio = scan.nextInt();

        System.out.println("Ingrese una clave de descuento");
        clave = scan.next();

        switch (clave){
            case "01":
                System.out.println("El producto "+ nombre+" con valor "+ precio + " se le aplico un descuento del 10% ");
                System.out.println("El total es: "+ (int)calculoTotal(precio, 10));
                break;
            case "02":
                System.out.println("El producto "+ nombre+" con valor "+ precio + " se le aplico un descuento del 20% ");
                System.out.println("El total es: "+ (int)calculoTotal(precio, 20));
                break;
            default:
                System.out.println("El producto "+ nombre+" con valor "+ precio + " no se le aplico un descuento");
                System.out.println("El total es: "+ (int)calculoTotal(precio, 0));
                break;
        }

    }

    static double calculoTotal(int precio, int descuento){
        double desc = (double)descuento / 100;
        return precio - (precio * desc);
    }
    
}
