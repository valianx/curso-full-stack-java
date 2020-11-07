/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_3;

/**
 *
 * @author Valian
 */
public class Equipo {

    private String nombre;
    private String regionOrigen;
    private int costoFuncionamiento;
    private Sponsor sponsor;

    public Equipo() {
    }

    ;

    public Equipo(String nombre, String regionOrigen, int costoFuncionamiento, Sponsor sponsor) {
        this.nombre = nombre;
        this.regionOrigen = regionOrigen;
        this.costoFuncionamiento = costoFuncionamiento;
        this.sponsor = sponsor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegionOrigen() {
        return regionOrigen;
    }

    public void setRegionOrigen(String regionOrigen) {
        this.regionOrigen = regionOrigen;
    }

    public int getCostoFuncionamiento() {
        return costoFuncionamiento;
    }

    public void setCostoFuncionamiento(int costoFuncionamiento) {
        this.costoFuncionamiento = costoFuncionamiento;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public String getSolvencia(int montoAportado) {
        String solventado = "";
        if ((montoAportado - costoFuncionamiento) < 0) {
            solventado = "El aporte del sponsor NO CUBRE el costo de funcionamiento para el equipo";
        } else if ((montoAportado - costoFuncionamiento) > 0) {
            solventado = "El aporte del sponsor CUBRE el costo de funcionamiento para el equipo";
        }
        return solventado;
    }

    public String getHinchadaNumerosa(String region) {
        String hinchadaNumerosa = "";

        if (region.equals("4va") || region.equals("5va") || region.equals("8va") || region.equals("13va")) {
            hinchadaNumerosa = "El equipo SI TIENE una hinchada numerosa";
        } else {
            hinchadaNumerosa = "El equipo NO TIENE una hinchada numerosa";
        }
        return hinchadaNumerosa;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", regionOrigen=" + regionOrigen + ", costoFuncionamiento=" + costoFuncionamiento + ", sponsor=" + sponsor + '}';
    }

}
