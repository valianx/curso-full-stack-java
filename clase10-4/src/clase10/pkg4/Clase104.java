/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.pkg4;

import java.util.Scanner;

/**
 * @author Valian
 */
public class Clase104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int i = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la tabla a imprimir");
        num = scan.nextInt();

        while (i <= 12) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }

}
