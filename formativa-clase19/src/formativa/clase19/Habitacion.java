package formativa.clase19;
import java.util.Calendar;

public class Habitacion {
    private Paciente paciente;
    private int numero;
    private char tipo;
    private Calendar ingreso;
    private int dias;

    public Habitacion(Paciente paciente, int numero, char tipo, Calendar ingreso, int dias) {
        this.paciente = paciente;
        this.numero = numero;
        this.tipo = tipo;
        this.ingreso = ingreso;
        this.dias = dias;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Calendar getIngreso() {
        return ingreso;
    }

    public void setIngreso(Calendar ingreso) {
        this.ingreso = ingreso;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "paciente=" + paciente +
                ", numero=" + numero +
                ", tipo=" + tipo +
                ", ingreso=" + ingreso +
                ", dias=" + dias +
                '}';
    }

    public void imprimir(Habitacion hab) {
        String altamedica;
        if (hab.getPaciente().isAlta()) altamedica = "ALTA MÉDICA";
        else altamedica = "NO TIENE ALTA MÉDICA";
        System.out.println(hab.getNumero() + " " + hab.getPaciente().getRut() + " " + hab.getPaciente().getNombre() + " " + hab.getPaciente().getPeso() + " " + altamedica);
    }

    public boolean descuento(Habitacion habitacion) {
        return habitacion.getDias() > 5 && habitacion.getTipo() == 'A';
    }

    public boolean esHoy(Habitacion hab) {
        Calendar hoy = Calendar.getInstance();
        ingreso = hab.getIngreso();
        
        return hoy.get(Calendar.YEAR) == ingreso.get(Calendar.YEAR)
                && hoy.get(Calendar.MONTH) == ingreso.get(Calendar.MONTH)
                && hoy.get(Calendar.DAY_OF_MONTH) == ingreso.get(Calendar.DAY_OF_MONTH);
    }
}
