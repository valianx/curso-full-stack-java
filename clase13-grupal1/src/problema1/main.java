package problema1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Paciente> lista = new ArrayList<>();
        lista.add(new Paciente("Juan", "Perez Contreras", 21, 'M', 'S', "+56123445345"));
        lista.add(new Paciente("Camila", "Gonzales Salgado", 23, 'F', 'C', "+56234234234"));
        lista.add(new Paciente("Fernanda", "Jara Martinez", 50, 'F', 'C', "+56234523442"));
        int hombres = 0;
        int mujeres = 0;

        for (Paciente paciente : lista) {
            if (paciente.getGenero() == 'M') {
                hombres++;
            } else {
                mujeres++;
            }

            if (paciente.getGenero() == 'F' && paciente.getEstadoCivil() == 'C') {
                System.out.println(paciente.getNombre() + " " + paciente.getApellidos() + " " + paciente.getTelefono());
            } else if (paciente.getGenero() == 'M' && paciente.getEstadoCivil() == 'S' && paciente.getEdad() > 20) {
                System.out.println(paciente.getApellidos() + " " + paciente.getTelefono());
            }
        }
        System.out.println("El total de hombres en la consulta fueron: " + hombres);
        System.out.println("El total de mujeres en la consulta fueron: " + mujeres);
    }
}
