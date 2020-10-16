package formativa;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void mostrarMenu() {

        System.out.println("Seleccione una opción \n");
        System.out.println("1.- Crear nuevo producto");
        System.out.println("2.- Listar productos");
        System.out.println("3.- busca producto por codigo");
        System.out.println("4.- salir");
    }

    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        int opt, precio;
        String nombre, codigo;
        lista.add(new Producto("CHLT", "chocolate", 1000));
        lista.add(new Producto("PANH", "pan", 1200));
        lista.add(new Producto("PPSK", "papas", 700));

        System.out.println("Menú del sistema\n");

        while (!flag) {
            mostrarMenu();
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Ingresar nuevo producto\n");
                    System.out.println("Ingrese el nombre del producto");
                    nombre = scan.next();
                    System.out.println("Ingrese el código del producto");
                    codigo = scan.next();
                    System.out.println("Ingrese el precio del producto");
                    precio = scan.nextInt();

                    lista.add(new Producto(nombre, codigo, precio));
                    break;
                case 2:
                    System.out.println("Listado de productos\n");
                    for (Producto producto : lista) {
                        System.out.println(producto);
                    }
                    break;
                case 3:
                    Producto prod;
                    System.out.println("Ingresar código del producto\n");
                    codigo = scan.next();
                    for(Producto producto: lista){
                        if(producto.getCodigo().equals(codigo)){
                            System.out.println(producto);
                        }
                    }
                    break;
                case 4:
                    System.out.println("terminando el programa");
                    flag = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }
    }
}
