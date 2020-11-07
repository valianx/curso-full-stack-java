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
public class Profesor extends Persona {
    
    private double sueldo;

    public Profesor(double sueldo, String rut, int edad, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(rut, edad, nombre, apellidoPaterno, apellidoMaterno);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public String toString() {
        return "Profesor{" + "sueldo=" + sueldo + " " + super.toString() +'}';
    }
    
    

    /*@Override
    public int contar() {
       return 0;
    }*/

    /*@Override
    public boolean buscar(String apellido) {
        boolean resultado=false;
        if (super.getApellidoPaterno().equals(apellido)) {
            resultado = true;
        } 
        return resultado;
    }
*/
    public String imprimir(){
        return "El sueldo es " + sueldo;
    }


}
