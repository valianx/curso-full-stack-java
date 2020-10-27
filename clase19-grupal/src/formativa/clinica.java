package formativa;

import java.util.ArrayList;
import java.util.Calendar;

public class clinica {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema clinica la SANITA\n");
        ArrayList<Habitacion> lista = new ArrayList<>();
        Calendar ingreso = Calendar.getInstance();
        ingreso.set(Calendar.MONTH, 9);
        ingreso.set(Calendar.YEAR, 2020);
        ingreso.set(Calendar.DAY_OF_MONTH, 21);
        lista.add(new Habitacion(new Paciente("17987123-7", "Juan Pérez", 'M', 72, false), 1, 'A', ingreso, 10));


        for (Habitacion habitacion : lista) {
            habitacion.imprimir(habitacion);
            System.out.println("");

            Paciente alta = habitacion.getPaciente().darAlta(habitacion.getPaciente());
            if (alta.isAlta()) System.out.println("Paciente " + alta.getNombre() + " esta de alta\n");
            else System.out.println("Paciente " + alta.getNombre() + "NO esta de alta\n");
            if (habitacion.descuento(habitacion))
                System.out.println("El paciente ha recibido un descuento del 15%\n");
            else System.out.println("El paciente no puede optar a descuento\n");
            if (habitacion.esHoy(habitacion))
                System.out.println("El paciente ingreso hoy");
            else
                System.out.println("El paciente no ingreso hoy");
        }
    }
}
