/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Ruben
 */
public class Coleccion implements IColeccion{

    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    public String agregarVehiculo(Vehiculo v) {

        listaVehiculos.add(v);
        String msg = "Se agregó el vehiculo";
        return msg;
    }

    public String agregarPersona(Persona p) {
        listaPersonas.add(p);
        String msg = "Se agregó el Persona";
        return msg;
    }

    public boolean eliminarVehiculo(int codigo) {
        boolean result = false;
        int posicion = -1;
        int indice = 0;
        for (Vehiculo aux : listaVehiculos) {
            if (aux.getCodigo() == codigo) {
                posicion = indice;
            }
            indice++;
        }
        if (posicion != - 1) {
            listaVehiculos.remove(posicion);
            result = true;
        }
        return result;

    }

    public boolean eliminarPersona(String rut) {
        boolean result = false;

        int posicion = -1;
        int indice = 0;
        for (Persona aux : listaPersonas) {
            if (aux.getRut().equals(rut)) {
                posicion = indice;
            }
            indice++;
        }
        if (posicion != - 1) {
            listaPersonas.remove(posicion);
            result = true;
        }
        return result;

    }

    public String listarVehiculos() {
        String salida = "";
        for (Vehiculo aux : listaVehiculos) {
            salida += aux.toString() + "\n";
        }
        return salida;
    }

    public String listarPersonas() {
        String salida = "";
        for (Persona aux : listaPersonas) {
            salida += aux.toString() + "\n";
        }
        return salida;
    }

    public String buscarPersona(String s) {
        String msg = "";
        for (Persona aux : listaPersonas) {
            if (aux instanceof Profesor) {
                
               //if( ((Profesor) aux).getSueldo()==2344  )
                
                if (aux.getRut().equals(s)) {
                    msg = "Se encontró el Profesor";
                }
            }

            if (aux instanceof Estudiante) {
                if (aux.getRut().equals(s)) {
                    msg = "Se encontró el Estudiante";
                }
            }

        }
        return msg;
    }

    public String contarPorTipoVehiculo() {
        int contCoche = 0;
        int contBici = 0;
        String msg = "";
        for (Vehiculo aux : listaVehiculos) {
            if (aux instanceof Coche) {
                contCoche++;
            }

            if (aux instanceof Bicicleta) {
                contBici++;
            }
        }
        msg = "Se encontraron: " + contCoche + " Coches y se encontraron " + contBici + " bicicletas";
        return msg;
    }
    
    public String contarPorTipoPersona() {
        int contProfe = 0;
        int contEstu = 0;
        String msg = "";
        for (Persona aux : listaPersonas) {
            if (aux instanceof Profesor) {
                contProfe++;
            }

            if (aux instanceof Estudiante) {
                contEstu++;
            }
        }
        msg = "Se encontraron: " + contProfe + " profesores y " + contEstu + " estudiantes";
        return msg;
    }

}
