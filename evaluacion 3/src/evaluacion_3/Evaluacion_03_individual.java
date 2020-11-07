/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Valian
 */
public class Evaluacion_03_individual {
    static Scanner teclado = new Scanner(System.in);

    static ArrayList<Sponsor> sponsor = new ArrayList<>();
    static ArrayList<Equipo> equipo = new ArrayList<>();
    static Sponsor sponsor1 = new Sponsor("12.345.678-9", "Nike", 70000000, 'I');
    static Sponsor sponsor2 = new Sponsor("98.765.432-1", "RedBull", 3000000, 'N');

    static Equipo equipo1 = new Equipo("Colo Colo", "13va", 100000000, sponsor1);
    static Equipo equipo2 = new Equipo("Huachipato", "8va", 50000000, sponsor2);
    static Equipo equipo3 = new Equipo("Deportes Iquique", "1ra", 50000000, sponsor2);

    public static void main(String[] args) {
        boolean mostrarMenu = true;
        int opcionMenu;

        String[] menuPrincipal = {"", "Menú principal", "", "1. Añadir Sponsors", "2. Añadir equipos",
                "3. Mostrar Aporte Mínimo por Sponsor", "4. Mostrar Solvencia Equipo", "5. Consultar Hinchada",
                "6. Salir", ""};

        while (mostrarMenu) {
            for (String menuPrincipal1 : menuPrincipal) {
                System.out.println(menuPrincipal1);
            }

            System.out.print("Ingrese una opción: ");
            opcionMenu = teclado.nextInt();

            switch (opcionMenu) {
                case 1:
                    sponsors();
                    break;
                case 2:
                    equipos();
                    break;
                case 3:
                    aportes();
                    break;
                case 4:
                    solvencia();
                    break;
                case 5:
                    hinchada();
                    break;
                case 6:
                    System.out.println("Cerraste tu sesión correctamente");
                    mostrarMenu = false;
                    break;
                default:
                    break;
            }
        }
    }

    private static void sponsors() {
        if (sponsor1.getMontoAporte() < 1000000 || sponsor2.getMontoAporte() < 1000000) {
            System.out.println(
                    "El monto mínimo aportado por cada sponsors debe ser superior a $ 1.000.000 (existe uno o más sponsors que no cumple esta condición)");
        } else if (sponsor1.getNombre().length() > 30 || sponsor2.getNombre().length() > 30) {
            System.out.println(
                    "El número de carácteres en el nombre de cada sponsor no puede superar los 30 carácteres (existe uno o más sponsors que no cumple esta condición)");
        } else if (sponsor1.getMontoAporte() > 1000000 && sponsor2.getMontoAporte() > 1000000) {
            sponsor.add(sponsor1);
            sponsor.add(sponsor2);

            System.out.println("Se añadieron los siguientes sponsors");
            sponsor.forEach(value -> {
                System.out.println(value.getNombre());
            });
        }
    }

    private static void equipos() {
        if (equipo1.getCostoFuncionamiento() > 100000000 || equipo2.getCostoFuncionamiento() > 100000000
                || equipo3.getCostoFuncionamiento() > 100000000) {
            System.out.println(
                    "El costo máximo de funcionamiento de cada equipo no puede set mayor a $ 100.000.000 (existe uno o más equipos que no cumple esta condición)");
        } else if (equipo1.getNombre().length() > 30 || equipo2.getNombre().length() > 30
                || equipo3.getNombre().length() > 30) {
            System.out.println(
                    "El numero de carácteres en el nombre de cada equipo no puede superar los 30 carácteres (existe uno o más equipos que no cumple esta condición)");
        } else if (equipo1.getCostoFuncionamiento() < 100000000 && equipo2.getCostoFuncionamiento() < 100000000
                && equipo3.getCostoFuncionamiento() < 100000000) {
            equipo.add(equipo1);
            equipo.add(equipo2);
            equipo.add(equipo3);
            System.out.println("Se añadieron los siguientes equipos");
            equipo.forEach(value -> {
                System.out.println(value.getNombre());
            });
        }
    }

    private static void aportes() {
        int opcionConsulta;
        int tamanioArrSponsor = sponsor.size();
        if (tamanioArrSponsor == 0) {
            System.out.println("Primero debe añadir sponsors al sistema");
        } else {
            System.out.println("¿Que Sponsor desea consultar?");
            for (int i = 0; i < tamanioArrSponsor; i++) {
                System.out.println((i + 1) + ". " + sponsor.get(i).getNombre());
            }
            System.out.print("Ingrese una opción: ");
            opcionConsulta = teclado.nextInt() - 1;
            char nacionalInternacional = sponsor.get(opcionConsulta).getNacionalsetNacional();
            System.out.println(sponsor.get(opcionConsulta).getMontoMinimoAporte());
        }
    }

    private static void solvencia() {
        int opcionConsulta;
        int tamanioArrEquipo = equipo.size();
        int tamanioArrSponsor = sponsor.size();
        if (tamanioArrEquipo == 0 || tamanioArrSponsor == 0) {
            System.out.println("Primero debe añadir sponsors y equipos al sistema.");
        } else {
            System.out.println("¿Que equipo desea consultar?");

            for (int i = 0; i < tamanioArrEquipo; i++) {
                System.out.println((i + 1) + ". " + equipo.get(i).getNombre());
            }
            System.out.print("Ingrese una opción: ");
            opcionConsulta = teclado.nextInt() - 1;
            int montoAportado = equipo.get(opcionConsulta).getSponsor().getMontoAporte();
            System.out.println(equipo.get(opcionConsulta).getSolvencia(montoAportado));
        }
    }

    private static void hinchada() {
        int opcionConsulta;
        int tamanioArrEquipo = equipo.size();
        int tamanioArrSponsor = sponsor.size();
        if (tamanioArrEquipo == 0 || tamanioArrSponsor == 0) {
            System.out.println("Primero debe añadir sponsors y equipos al sistema.");
        } else{
            System.out.println("¿Que equipo desea consultar?");
            for (int i = 0; i < tamanioArrEquipo; i++) {
                System.out.println((i + 1) + ". " + equipo.get(i).getNombre());
            }
            System.out.print("Ingrese una opción: ");
            opcionConsulta = teclado.nextInt() - 1;
            String region = equipo.get(opcionConsulta).getRegionOrigen();
            System.out.println(equipo.get(opcionConsulta).getHinchadaNumerosa(region));
        }
    }
}
