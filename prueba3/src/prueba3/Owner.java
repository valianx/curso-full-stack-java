/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

/**
 *
 * @author Valian
 */

public class Owner {
    private String nombre;
    private int codigo;
    private String telefono;
    private char tipo;

    public Owner(String nombre, int codigo, String telefono, char tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean obtenerCodigo(){
        return codigo == 22;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", telefono='" + telefono + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}


