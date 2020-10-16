package grupal1;

public class Nota {
    private double nota;
    private int ponderacion;

    public Nota(double nota, int ponderacion) {
        this.nota = nota;
        this.ponderacion = ponderacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota=" + nota +
                ", ponderacion=" + ponderacion +
                '}';
    }
}
