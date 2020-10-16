package problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();
        char genero;
        int edad, hombres = 0, mujeres = 0, suma = 0, nino = 0, joven = 0, adulto = 0;
        boolean flag = false;

        //llenado del array
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el edad de la persona " + (i + 1));
            edad = scan.nextInt();
            if (edad < 10 || edad > 50) {
                flag = false;
                while (!flag) {
                    System.out.println("Ingrese una edad válido para la persona " + (i + 1));
                    edad = scan.nextInt();
                    if (edad >= 10 && edad <= 50) flag = true;
                }
            }

            System.out.println("Ingrese el género de la persona " + (i + 1));
            genero = scan.next().charAt(0);
            if (genero != 'M' && genero != 'F') {
                flag = false;
                while (!flag) {
                    System.out.println("Ingrese el género válido para la persona " + (i + 1));
                    genero = scan.next().charAt(0);
                    if (genero == 'M' || genero == 'F') flag = true;
                }
            }
            //agrega al array
            lista.add(new Persona(edad, genero));
        }

        for (Persona persona : lista) {
            suma += persona.getEdad();
            if (persona.getGenero() == 'M') hombres++;
            else mujeres++;

            if (persona.getEdad() < 18 && persona.getEdad() >= 10) nino++;
            else if (persona.getEdad() < 30 && persona.getEdad() >= 18) joven++;
            else if (persona.getEdad() < 51 && persona.getEdad() >= 30) adulto++;
        }

        System.out.println("El promedio de edad de las personas que asisten al gimnasio es: " + (suma / 3));
        System.out.println("La cantidad de hombres que asisten al gimnasio es: " + hombres + ", y la cantidad de mujeres es: " + mujeres);
        System.out.println("En el gimnasio hay: " + nino + " niño(s), " + joven + " jovene(s) y " + adulto + " adulto(s)");
    }
}
