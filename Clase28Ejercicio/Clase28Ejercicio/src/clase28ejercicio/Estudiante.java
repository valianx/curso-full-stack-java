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
public class Estudiante extends Persona {
    
    private String carrera;

    public Estudiante(String carrera, String rut, int edad, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(rut, edad, nombre, apellidoPaterno, apellidoMaterno);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + " " + super.toString() +'}';
    }

    /*@Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /*@Override
    public boolean buscar(String rut) {
        boolean result = false;
        if (super.getRut().equals(rut)) {
            result = true;
        } 
        return result;
    }
    */
     public String imprimir(){
        return "La carrera es  " + carrera;
    }
    
}
