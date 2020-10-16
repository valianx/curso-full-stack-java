package tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //azul datos primitivos
        int num1;
        double nota;
        char letra;
        boolean flag;

        String nombre;

        ArrayList<String> lista_nombres = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre n° " + (i + 1));
            nombre = teclado.next();
            lista_nombres.add(nombre);
        }

        System.out.println("Los nombres ingresados son: ");

        for (String aux : lista_nombres) {
            System.out.println(aux.toString());
        }
    }
}
