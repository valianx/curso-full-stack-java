package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("Programa calculadora\n");

        System.out.println("Ingrese 1 para sumar");
        System.out.println("Ingrese 2 para restar");
        System.out.println("Ingrese 3 para multiplicar");
        System.out.println("Ingrese 4 para dividir");
        int option, n1, n2;
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();

        System.out.println("Ingrese el primer número");
        n1 = scan.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = scan.nextInt();

        switch (option) {
            case 1:
                System.out.println("La suma de " + n1 + " con " + n2 + " es: " + (n1 + n2));
                break;
            case 2:
                System.out.println("La resta de " + n1 + " con " + n2 + " es: " + (n1 - n2));
                break;
            case 3:
                System.out.println("La multiplicación de " + n1 + " con " + n2 + " es: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) System.out.println("El segundo número debe ser distinto de 0");
                else System.out.println("La división de " + n1 + " con " + n2 + " es: " + (double) n1 / n2);
                break;
            default:
                System.out.println("la opción ingresada no es válida");
        }
    }
    
}
