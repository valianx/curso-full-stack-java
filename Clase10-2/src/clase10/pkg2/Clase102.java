/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.pkg2;

import java.util.Scanner;

/**
 * @author Valian
 */
public class Clase102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
        double suma = 0;

        int i = 0;
        Scanner scan = new Scanner(System.in);

        while (i < 4) {
            System.out.println("Ingrese el numero " + (i + 1));
            numero = scan.nextDouble();
            suma += numero;
            i++;
        }
        System.out.println("El promedio es: " + suma / 4);
    }
}