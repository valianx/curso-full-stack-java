package grupal11;
import java.util.Scanner;
public class grupal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        System.out.println("Bienvenido al programa");
        System.out.println("Ingrese un número decimal");
        num = scan.nextDouble();

        System.out.println("La parte decimal es: " + (num - (int) num));
    }
}