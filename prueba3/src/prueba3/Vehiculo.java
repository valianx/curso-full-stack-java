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
public class Vehiculo {
    private String patente;
    private boolean ERevision;
    private float kilometraje;
    private float ultimaRevision;
    private int year;
    private Owner owner;

    public Vehiculo(String patente, boolean ERevision, float kilometraje, float ultimaRevision, int year, Owner owner) {
        this.patente = patente;
        this.ERevision = ERevision;
        this.kilometraje = kilometraje;
        this.ultimaRevision = ultimaRevision;
        this.year = year;
        this.owner = owner;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isERevision() {
        return ERevision;
    }

    public void setERevision(boolean ERevision) {
        this.ERevision = ERevision;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public float getUltimaRevision() {
        return ultimaRevision;
    }

    public void setUltimaRevision(float ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public float tiempoRevision() {
        if ((kilometraje - ultimaRevision) <= 10000 && (kilometraje - ultimaRevision) > 0)
            return 10000 - kilometraje - ultimaRevision;
        return 0;
    }

    public int kilometrajeEsperado() {
        return (2020 - year) * 40000;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", ERevision=" + ERevision +
                ", kilometraje=" + kilometraje +
                ", ultimaRevision=" + ultimaRevision +
                ", year=" + year +
                ", owner=" + owner +
                '}';
    }
}
