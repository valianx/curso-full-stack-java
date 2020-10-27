package grupal1;

import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<>();
        System.out.println("Ingreso de productos al inventario\n");

        lista.add(new Producto("Grande", "Escritorio", "Oficina", 10, false, "Madera", 10000));
        lista.add(new Producto("pequeña", "Mesa", "casa", 10, true, "Transparente", 103999));


        Producto silla = new Producto();
        silla.setCategoria("Oficina");
        silla.setColor("Negro");
        silla.setNombre("Silla");
        silla.setOferta(true);
        silla.setTamaño("Mediana");
        if(!silla.setPrecio(-1)) System.out.println("El precio debe ser mayor que cero");
        if(!silla.setStock(-1)) System.out.println("El stock debe ser mayor que cero");

        lista.add(silla);
        System.out.println("");
        for(Producto producto:lista){
            System.out.println(producto);
        }
    }
}
