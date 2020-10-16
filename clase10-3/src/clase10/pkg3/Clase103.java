/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.pkg3;

import java.util.Scanner;

/**
 * @author Valian
 */
public class Clase103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero");
        num = scan.nextInt();
        if (num > 0) System.out.println("El número " + num + " es positivo");
        if (num == 0) System.out.println("El número " + num + " es cero");
        if (num < 0) System.out.println("El número " + num + " es negativo");
    }
}
