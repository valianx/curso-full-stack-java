public class array {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        String[] palabras = new String[5];

        palabras[0] = "yo";
        palabras[1] = "soy";
        palabras[2] = "un";
        palabras[3] = "arreglo";
        palabras[4] = "en java";

        for (int i = 0; i < 5; i++) {
            System.out.print(palabras[i] + ' ');
        }
    }
}
