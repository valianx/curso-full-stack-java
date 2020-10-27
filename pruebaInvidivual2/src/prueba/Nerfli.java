package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Nerfli {
    static ArrayList<Plan> lista = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static boolean ingresado = false;
    static int p1 = 0, p2 = 0, p3 = 0, total = 0;

    public static void main(String[] args) {
        lista.add(new Plan("2 pantallas HD"));
        lista.add(new Plan("5 pantallas Full HD"));
        lista.add(new Plan("Ilimitado Full HD"));

        menu();
    }

    private static void menu() {
        System.out.println("Bienvenido al sistema Nesfli\n");
        mostrarMenu();
    }

    private static void mostrarMenu() {
        int opt;
        boolean repetir = true;
        while (repetir) {
            System.out.println("Menú principal\n");
            System.out.println("1.- Ingresar precios de los planes");
            System.out.println("2.- Area de ventas");
            System.out.println("3.- Cierre turno");
            System.out.println("4.- Salir");
            opt = scan.nextInt();
            switch (opt) {
                case 1:
                    ingresoPrecios();
                    break;
                case 2:
                    ventas();
                    break;
                case 3:
                    cierre();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void cierre() {
        if (p1 == 0 && p2 == 0 && p3 == 0) {
            System.out.println("No hay ventas registradas\n");
        } else {
            int i = 1, cantidad = 0;
            System.out.println("Resumen del turno:\n");
            System.out.println("En este turno se vendieron " + (p1 + p2 + p3) + " plan(es)");

            for (Plan plan : lista) {
                if (i == 1) cantidad = p1;
                if (i == 2) cantidad = p2;
                if (i == 3) cantidad = p3;
                System.out.println("Se vendio " + cantidad + " plan(es) por un total de $" + plan.getPrecio() * cantidad);
                i++;
            }
            System.out.println("\nEl total de ventas en este turno es: $" + total + "\n");
        }
    }

    private static void ventas() {
        int opt;
        boolean repetir = true;
        if (!ingresado) {
            System.out.println("Debe ingresar los precios de los planes antes de vender\n");
        } else {
            while (repetir) {
                System.out.println("Menú ventas\n");

                System.out.println("1.- Mostrar precios");
                System.out.println("2.- Vender planes");
                System.out.println("3.- Atrás");
                opt = scan.nextInt();

                switch (opt) {
                    case 1:
                        precios();
                        break;
                    case 2:
                        vender();
                        break;
                    case 3:
                        repetir = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            }
        }
    }

    private static void vender() {
        int num, cantidad, i = 1, subtotal;
        boolean repetir = true;
        System.out.println("Ingrese el número del plan");
        num = scan.nextInt();
        if (num < 1 || num > 3) {
            System.out.println("Ingrese un número válido de plan");
            num = scan.nextInt();
            if (num > 0 && num <= 3) repetir = false;
        }
        System.out.println("Ingrese la cantidad");
        cantidad = scan.nextInt();
        for (Plan plan : lista) {
            if (num == i) {
                subtotal = plan.getPrecio() * cantidad;
                total += subtotal;
                System.out.println("El cliente contrató " + cantidad + " plan(es).\n " + plan.getNombre() + " , de $" + plan.getPrecio() + ", total: " + plan.getPrecio() * cantidad);
            }
            i++;
        }
        if (num == 1) p1 += cantidad;
        if (num == 2) p2 += cantidad;
        if (num == 3) p3 += cantidad;


    }

    private static void precios() {
        System.out.println("Planes disponibles\n");
        int i = 1;
        for (Plan plan : lista) {
            System.out.println(i + ".- Plan: " + plan.getNombre() + " - " + plan.getPrecio());
            i++;
        }
    }

    private static void ingresoPrecios() {
        int precio;
        boolean repetir = true;
        for (Plan plan : lista) {
            System.out.println("Ingrese el precio para el plan " + plan.getNombre());
            precio = scan.nextInt();

            if (precio <= 0 || precio >= 20000) {
                while (repetir) {
                    System.out.println("Ingrese el precio válido para el plan " + plan.getNombre());
                    precio = scan.nextInt();
                    if (precio > 0 && precio < 20000) repetir = false;
                }
            }

            plan.setPrecio(precio);
        }
        ingresado = true;
    }
}
