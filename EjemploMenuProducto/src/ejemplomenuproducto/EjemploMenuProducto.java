/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomenuproducto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class EjemploMenuProducto {
static Scanner teclado = new Scanner(System.in);
static Producto p;
static ArrayList<Producto> listadoProducto = new ArrayList<>();
 
    private static void listar() {
        for(Producto tmp : listadoProducto){
            System.out.println(tmp);
        }
    }
    
    private static void buscar() {
        int codBusqueda;
        boolean encontrado = false;
        System.out.println("Ingrese el código de búsqueda");
        codBusqueda = teclado.nextInt();
        
        for(Producto aux : listadoProducto){
            if(aux.getCodigo()==codBusqueda){
                System.out.println(aux);
                encontrado = true;
            }
        }
        
        if(!encontrado)  //encontrado == false
            System.out.println("No existe ese codigo de producto");
    }

    private static void agregar() {
        int codigo, precio;
        String nombre;
        System.out.println("Ingrese el codigo del producto");
        codigo = teclado.nextInt();
        System.out.println("Ingrese el nombre del producto");
        nombre = teclado.next();
        System.out.println("Ingrese el precio del producto");
        precio = teclado.nextInt();
        p = new Producto(codigo, nombre, precio);
        listadoProducto.add(p);
    }

    private static boolean Menu() {
        boolean repetir = true;
        int opcion;
        
        System.out.println("Menu");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar por codigo");
        System.out.println("3. Listar todos");
        System.out.println("4. Salir");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1: agregar();
                    break;
            case 2: buscar();
                    break;
            case 3: listar();
                    break;
            case 4: repetir=false;
        }
        return repetir;
    }
    
    public static void main(String[] args) {
           while(Menu());
    }

    
    

 

  
    
}
