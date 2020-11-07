package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class ventaSalas {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Sala> listaSalas = new ArrayList<>();
    static boolean ingresado = false;
    static int cantidadV = 0, total = 0, gig = 0, trad = 0, td = 0;


    public static void main(String[] args) {
        //ingreso de salas a la lista (sin precio)
        ingresoSalas();
        menuPrincipal();
    }

    private static void ingresoSalas() {
        listaSalas.add(new Sala("Gigante"));
        listaSalas.add(new Sala("3D"));
        listaSalas.add(new Sala("Tradicional"));
    }

    public static void menuPrincipal() {
        boolean repetir = true;
        int opt;
        System.out.println("Bienvenido al sistema Fan’s Levi\n");
        System.out.println("Menu principal");
        while (repetir) {
            System.out.println("1.- Ingreso de precios de las salas ");
            System.out.println("2.- Ingreso al área de ventas ");
            System.out.println("3.- Cierre de caja");
            System.out.println("4.- salir");
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    ingresoPrecios();
                    break;
                case 2:
                    ventas();
                    break;
                case 3:
                    cierreCaja();
                    break;
                case 4:
                    //salir
                    repetir = false;
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("La opción no es válida");
            }
        }
    }

    private static void cierreCaja() {
        int cant = 0;
        System.out.println("Cierre de caja\n");
        if (cantidadV == 0) {
            System.out.println("No se han realizado ventas\n");
        } else {
            System.out.println("En esta sesión se vendieron " + cantidadV + " entradas por un total de $" + total + "\n");
            System.out.println("Desglose ventas\n");
            for(Sala sala:listaSalas){
                if(sala.getNombre().equals("Gigante")) cant = gig;
                if(sala.getNombre().equals("3D")) cant = td;
                if(sala.getNombre().equals("Tradicional")) cant = trad;
                System.out.println("sala "+ sala.getNombre()+": "+cant+ " entrada(s) vendida(s) por un total de "+ sala.getPrecio() * cant);
            }
            System.out.println("\n");
        }
    }

    private static void ventas() {
        boolean flag = false;
        int opt;
        System.out.println("Submenú ventas\n");

        if (!ingresado) {
            System.out.println("Debe ingresar los precios de las salas antes de realizar una vender\n");
        } else {
            while (!flag) {
                System.out.println("Seleccione una opción");

                System.out.println("1.- Ver salas");
                System.out.println("2.- Vender");
                System.out.println("3.- Salir al menú principal");
                opt = scan.nextInt();
                switch (opt) {
                    case 1:
                        mostrarPrecios();
                        break;
                    case 2:
                        vender();
                        break;
                    case 3:
                        flag = true;
                        break;
                    default:
                }
            }
        }
    }

    private static void vender() {
        int num, cantidad, i = 1;

        System.out.println("Nueva venta\n");
        System.out.println("Ingrese el número de la sala");
        num = scan.nextInt();
        while (num < 1 || num > 3) {
            System.out.println("la sala no existe, intente nuevamente");
            num = scan.nextInt();
        }
        System.out.println("Ingrese la cantidad de entradas que desea llevar");
        cantidad = scan.nextInt();
        while (cantidad < 0) {
            System.out.println("Ingrese la cantidad de entradas válida");
            cantidad = scan.nextInt();
        }

        for (Sala sala : listaSalas) {
            if (i == num) {
                System.out.println("El total de la venta es: " + sala.getPrecio() * cantidad);
                total += sala.getPrecio() * cantidad;
                cantidadV += cantidad;
                if (sala.getNombre() == "Gigante") gig += cantidad;
                if (sala.getNombre() == "3D") td += cantidad;
                if (sala.getNombre() == "Tradicional") trad += cantidad;
            }
            i++;
        }
    }

    private static void mostrarPrecios() {
        int i = 1;
        System.out.println("\n");
        for (Sala sala : listaSalas) {
            System.out.println(i + " .- sala " + sala.getNombre() + " - $" + sala.getPrecio());
            i++;
        }
        System.out.println("\n");
    }

    private static void ingresoPrecios() {
        int precio;
        boolean flag = false;
        System.out.println("Submenú ingreso precios\n");
        for (Sala sala : listaSalas) {
            System.out.println("Ingrese el precio de la sala " + sala.getNombre());
            precio = scan.nextInt();
            //validación
            if (precio <= 0) {
                while (!flag) {
                    System.out.println("Ingrese un precio válido para la sala " + sala.getNombre());
                    precio = scan.nextInt();
                    if (precio > 0) flag = true;
                }
            }
            sala.setPrecio(precio);
        }
        ingresado = true;
    }
}
    /*menu principal
        ingreso precios
        venta
        cierre de caja
        salir
     */

    /*submenu
        venta
        atras
     */
