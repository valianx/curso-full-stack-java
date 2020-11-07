package grupal;

import java.util.Scanner;

public class OptimusCar {
    static Scanner scan = new Scanner(System.in);
    static Owner cliente;
    static Vehiculo vehiculo;

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema Optimus Car\n");
        menu();
    }

    private static void menu() {
        int opt;
        boolean salir = false;

        while (!salir) {

            System.out.println("1.- Ingreso de un cliente");
            System.out.println("2.- Ingreso de un vehículo");
            System.out.println("3.- Ver");
            System.out.println("4.- salir");
            System.out.println("");
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    cliente();
                    break;
                case 2:
                    vehiculo();
                    break;
                case 3:
                    ver();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("opción no válida");
            }
        }
    }

    private static void ver() {
        if (cliente == null || vehiculo == null) {
            System.out.println("Debe ingresar los datos del cliente y/o vehículo\n");
        } else {
            float kilometros = vehiculo.tiempoRevision();
            System.out.println("Menú ver información relevante: \n");

            if (cliente.obtenerCodigo()) System.out.println("El cliente: " + cliente.getNombre() + " es de Santiago");
            else System.out.println("El cliente: " + cliente.getNombre() + " es de región");

            if (kilometros == 0) System.out.println("La revisión tecnica del cliente ya vencio");
            else System.out.println("Faltan " + kilometros + " kilometros para la próxima revisión del cliente");
            System.out.println("El vehículo actualmente posee un kilometraje de " + vehiculo.getKilometraje() + ", el kilometraje esperado es: " + vehiculo.kilometrajeEsperado());
            System.out.println("");
        }
    }

    private static void vehiculo() {
        boolean repetir = true;
        String patente;
        boolean ERevision;
        float kilometraje;
        float ultimaRevision;
        int year;
        if (cliente != null) {
            System.out.println("Ingreso de datos del vehículo\n");
            System.out.println("Ingrese la patente del vehículo:");
            patente = scan.next();
            if (patente.length() != 6) {
                while (repetir) {
                    System.out.println("Ingrese la patente del vehículo válida:");
                    patente = scan.next();
                    if (patente.length() == 6) repetir = false;
                }
            }
            System.out.println("Ingrese el estado de la revisión tecnica: (true o false)");
            ERevision = scan.nextBoolean();
            System.out.println("Ingrese el kilometraje actual del vehículo: ");
            kilometraje = scan.nextFloat();
            repetir = true;
            if (kilometraje < 0 || kilometraje > 500000) {
                while (repetir) {
                    System.out.println("Ingrese un kilometraje válido del vehículo: ");
                    kilometraje = scan.nextFloat();
                    if (kilometraje >= 0 && kilometraje <= 500000) repetir = false;
                }
            }
            //revision tecnica
            System.out.println("Ingrese el kilometraje de la última revisión técnica del vehículo: ");
            ultimaRevision = scan.nextFloat();
            repetir = true;
            if (ultimaRevision < 0 || ultimaRevision >= kilometraje) {
                while (repetir) {
                    System.out.println("Ingrese un kilometraje válido : ");
                    ultimaRevision = scan.nextFloat();
                    if (ultimaRevision >= 0 && ultimaRevision <= 500000 && ultimaRevision < kilometraje)
                        repetir = false;
                }
            }
            System.out.println("Ingrese el año del vehículo:");
            year = scan.nextInt();
            vehiculo = new Vehiculo(patente, ERevision, kilometraje, ultimaRevision, year, cliente);
            System.out.println("");
        } else {
            System.out.println("Debe Ingresar el cliente antes de ingresar un vehiculo\n");
        }
    }

    private static void cliente() {
        String nombre;
        int codigo, telefono;
        char tipo;
        boolean repetir = true;
        System.out.println("Ingreso de datos del cliente\n");
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = scan.next();
        System.out.println("Ingrese el código de área del teléfono: ");
        codigo = scan.nextInt();
        if (codigo <= 0 || codigo > 99) {
            while (repetir) {
                System.out.println("Ingrese el código de área válido: ");
                codigo = scan.nextInt();
                if (codigo <= 99 && codigo >= 0) repetir = false;
            }
        }
        repetir = true;
        System.out.println("Ingrese el teléfono del cliente: ");
        telefono = scan.nextInt();
        System.out.println("Ingrese tipo de cliente: (F o N)");
        tipo = scan.next().charAt(0);
        if (tipo != 'F' && tipo != 'N') {
            while (repetir) {
                System.out.println("Ingrese tipo de cliente válido: (F o N)");
                tipo = scan.next().charAt(0);
                if (tipo == 'F' || tipo == 'N') repetir = false;
            }
        }

        cliente = new Owner(nombre, codigo, telefono, tipo);
    }
}