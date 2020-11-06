/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28ejercicio;

/**
 *
 * @author Ruben
 */
public class Clase28Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona prof1 = new Profesor(1_000_000, "1-7", 30, "Carlos", "Pinto", "Perez");
        Persona prof2 = new Profesor(5_000_000, "2-5", 26, "Jose", "Maccinni", "Contador");
        Persona  est1 = new Estudiante("Paramedico", "5-6", 19, "Agustin", "Mella", "Pineda");
        Persona  est2 = new Estudiante("Administracion y FInanazas", "4-2", 23, "Carla", "Leal", "Rojas");
        
        Coche c1 = new Coche("XX-YY-20", 3, 2020, 4, "Verde", 600000);
        Coche c2 = new Coche("XX-YY-20", 3, 2020, 4, "Verde",800000);
        Bicicleta b1 = new Bicicleta(true, 1515, 2, "Rosado",300000);
        
        Coleccion col = new Coleccion();
        col.agregarPersona(prof1);
        col.agregarPersona(prof2);
        col.agregarPersona(est1);
        col.agregarPersona(est2);
        col.agregarVehiculo(c1);
        col.agregarVehiculo(c2);
        col.agregarVehiculo(b1);
        
        System.out.println(col.listarPersonas());
        System.out.println(col.listarVehiculos());
        
        System.out.println(col.eliminarPersona("2-5"));
        System.out.println(col.buscarPersona("1-7"));
        System.out.println(col.buscarPersona("5-6"));
        
        System.out.println(col.listarPersonas());
        System.out.println(col.listarVehiculos());
        
        System.out.println(col.contarPorTipoVehiculo());
        System.out.println(col.contarPorTipoPersona());
    }
    
}
