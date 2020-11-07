/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_3;

import java.util.Scanner;

/**
 *
 * @author Valian
 */
public class Sponsor {

    private String rut;
    private String nombre;
    private int montoAporte;
    private char nacionalInternacional;

    public Sponsor() {
    }
    ;
    
    Scanner teclado = new Scanner(System.in);

    public Sponsor(String rut, String nombre, int montoAporte, char nacionalInternacional) {
        this.rut = rut;
        this.nombre = nombre;
        this.montoAporte = montoAporte;
        this.nacionalInternacional = nacionalInternacional;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoAporte() {
        return montoAporte;
    }

    public void setMontoAporte(int montoAporte) {
        this.montoAporte = montoAporte;
    }

    public char getNacionalsetNacional() {
        return nacionalInternacional;
    }

    public void setNacionalInternacional(char nacionalInternacinal) {
        this.nacionalInternacional = nacionalInternacinal;
    }

    public String getMontoMinimoAporte() {
        String textoAporteMinimo = "";

        if (nacionalInternacional == 'N') {
            textoAporteMinimo = "El monto mínimo es de $10.000.000";
        } else if (nacionalInternacional == 'I') {
            textoAporteMinimo = "El monto mínimo es de $25.000.000";
        }
        return textoAporteMinimo;
    }

    @Override
    public String toString() {
        return "Sponsor{" + "rut=" + rut + ", nombre=" + nombre + ", montoAporte=" + montoAporte + ", nacionalInternacinal=" + nacionalInternacional + '}';
    }

}
