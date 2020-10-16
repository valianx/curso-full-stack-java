package tareagrupal2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Programa calcula tu promedio");
        ArrayList<Ramo> listaRamos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        double nota, requerida;
        boolean flag = false;

        listaRamos.add(new Ramo(5.5, 4.0, 0));
        listaRamos.add(new Ramo(5.0, 3.0, 0));
        listaRamos.add(new Ramo(2.2, 6.0, 0));
        listaRamos.add(new Ramo(4.0, 1.0, 0));
        listaRamos.add(new Ramo(3.5, 4.0, 0));
        System.out.println("Ingrese la nota deseada");
        nota = scan.nextDouble();
        //vericar
        if (nota < 1 || nota > 7) {
            while (!flag) {
                System.out.println("Ingrese la nota válida");
                nota = scan.nextDouble();
                if (nota >= 1 && nota <= 7) flag = true;
            }
        }

        int i = 1;
        for (Ramo ramo : listaRamos) {
            requerida = (nota * 3) - ramo.getNota1() - ramo.getNota2();
            System.out.println("La nota requerida en el ramo " + i + " es: " + String.format("%.1f", requerida) + ", para alcanzar la nota: " + nota);
            if (requerida > 7) {
                System.out.println("No es posible alcanzar esta nota");
            }
            i++;
        }
    }
}
