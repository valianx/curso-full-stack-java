package formativa;

public class Paciente {
    private String rut;
    private String nombre;
    private char sexo;
    private int peso;
    private boolean alta;

    public Paciente(String rut, String nombre, char sexo, int peso, boolean alta) {
        this.rut = rut;
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.alta = alta;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", alta=" + alta +
                '}';
    }
    public Paciente darAlta(Paciente paciente) {
        if(!paciente.isAlta()){
            paciente.setAlta(true);
        }
        return paciente;
    }
}
