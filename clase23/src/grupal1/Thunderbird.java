package grupal1;

import java.util.Scanner;

public class Thunderbird {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la aerolinea Thunderbird\n");
        String nombre, password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario\n");
        nombre = scan.nextLine();
        System.out.println("Ingrese su contraseña\n");
        password = scan .nextLine();

        Pasaje pasaje = new Pasaje(1, 200, 'V', true, 10000, 70, new Usuario(nombre, password, "123123123-3", "Concepción"));
        boolean repetir = true;
        if(!pasaje.login(nombre, password)){
            while(repetir){
                System.out.println("Ingrese un nombre de usuario válido\n");
                nombre = scan.nextLine();
                System.out.println("Ingrese una contraseña válida\n");
                password = scan .nextLine();

                if(pasaje.login(nombre, password)) repetir = false;
            }
        }

        if (!pasaje.validarUsuario(pasaje.getUser().getNombre(), pasaje.getUser().getPassword()) || pasaje.getNumero() < 1 || (pasaje.getTipo() != 'N' & pasaje.getTipo() != 'V')) {
            System.out.println("Venta no válida");
        } else {
            String tipo;
            if (pasaje.getTipo() == 'V') tipo = "VIP";
            else tipo = "NORMAL";
            System.out.println(pasaje.getId() + " " + pasaje.getUser().getNombre() + ", asiento: " + pasaje.getNumero() + "- " + tipo + "- " + pasaje.getValor());
            float tasa = pasaje.aplicarTasa();
            pasaje.setValor(tasa);

            System.out.println(pasaje.getId() + " " + pasaje.getUser().getNombre() + ", asiento: " + pasaje.getNumero() + "- " + tipo + "- " + pasaje.getValor());

            float sobrepeso = pasaje.sobrepeso();
            pasaje.setValor(sobrepeso);

            System.out.println(pasaje.getId() + " " + pasaje.getUser().getNombre() + ", asiento: " + pasaje.getNumero() + "- " + tipo + "- " + pasaje.getValor());
        }
    }
}
