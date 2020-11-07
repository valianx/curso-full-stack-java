package prueba3;

public class Equipo {
    private String nombre;
    private String region;
    private int costo;
    private Sponsor sponsor;

    public Equipo(String nombre, String region, int costo, Sponsor sponsor) {
        this.nombre = nombre;
        this.region = region;
        this.costo = costo;
        this.sponsor = sponsor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", region='" + region + '\'' +
                ", costo=" + costo +
                ", sponsor=" + sponsor +
                '}';
    }
}
