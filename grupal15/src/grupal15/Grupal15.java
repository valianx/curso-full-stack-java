/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal15;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Valian
 */
public class Grupal15 {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Nota> listaNotas = new ArrayList<>();
    static String nombre;

    public static void main(String[] args) {
        System.out.println("Bienvenido a la app de calculo de promedio\n");
        menu();
    }

    private static void menu() {
        boolean repetir = true;
        int opt;
        while (repetir) {
            System.out.println("1.- Ingresar nueva asignatura");
            System.out.println("2.- Añadir nota a la asignatura");
            System.out.println("3.- Ver promedio");
            System.out.println("4.- salir");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    ingresoAsignatura();
                    break;
                case 2:
                    ingresoNotas();
                    break;
                case 3:
                    promedio();
                    break;
                case 4:
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void promedio() {
        double suma = 0;
        double ponderacion;
        int sumaP = 0;
        //validar
        if (listaNotas.size() == 0) {
            System.out.println("Debe ingresar notas para ver el promedio");
        } else {
            //validar porcentajes
            for (Nota aux : listaNotas) {
                sumaP += aux.getPonderacion();
            }
            if (sumaP != 100) {
                System.out.println("No se puede calcular el promedio");
                System.out.println("Las ponderaciones no llegan al 100%\n");
            } else {
                for (Nota aux : listaNotas) {
                    ponderacion = (double) aux.getPonderacion() / 100;
                    suma += (aux.getNota() * ponderacion);
                }
                System.out.println("El promedio del alumno es: " + String.format("%.1f", suma) + " en la asignatura de " + nombre + "\n");
                if (suma >= 4)
                    System.out.println("El alumno aprobó la asignatura\n");
                else
                    System.out.println("El alumno reprobó la asignatura\n");
            }
        }
    }

    private static void ingresoAsignatura() {
        System.out.println("Ingrese el nombre de la nueva asignatura");
        nombre = scan.next();
        boolean repetir = true;
        //validacion
        if (nombre.length() == 0) {
            while (repetir) {
                System.out.println("Ingrese el nombre de la nueva asignatura");
                nombre = scan.next();
                if (nombre.length() > 0) repetir = false;
            }
        }
    }

    private static void ingresoNotas() {
        double nota;
        int ponderacion;
        Nota nuevaNota;
        boolean repetir;

        if (nombre != null) {
            System.out.println("Ingreso de notas\n");

            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese la nota " + (i + 1));
                nota = scan.nextDouble();
                //validar nota
                if (nota < 1 || nota > 7) {
                    repetir = true;
                    while (repetir) {
                        System.out.println("ingrese la nota " + (i + 1));
                        nota = scan.nextDouble();
                        if (nota >= 1 && nota <= 7) repetir = false;
                    }
                }
                System.out.println("ingrese la ponderación de la nota " + (i + 1));
                ponderacion = scan.nextInt();
                //validar ponderacion
                if (ponderacion <= 0 || ponderacion > 100) {
                    repetir = true;
                    while (repetir) {
                        System.out.println("ingrese la ponderación de la nota " + (i + 1));
                        ponderacion = scan.nextInt();
                        if (ponderacion > 0 && ponderacion <= 100) repetir = false;
                    }
                }
                nuevaNota = new Nota(nota, ponderacion);
                listaNotas.add(nuevaNota);
            }
        } else {
            System.out.println("Debe ingresar la asignatura antes de añadir notas\n");
        }
    }
}
