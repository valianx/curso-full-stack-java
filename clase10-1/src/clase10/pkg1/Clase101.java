/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.pkg1;

/**
 * @author Valian
 */
public class Clase101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1, suma = 0;

        while (i <= 20) {
            if (i % 2 == 0) suma += i;
            i++;
        }
        System.out.println("La suma de los 10 primeros numeros pares es: " + suma);
    }
}