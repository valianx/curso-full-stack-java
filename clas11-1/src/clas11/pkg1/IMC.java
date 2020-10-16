package clas11.pkg1;
import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        double peso, estatura, imc;

        System.out.println("Bienvenido al programa");
        System.out.println("Ingrese su edad");
        edad = scan.nextInt();
        System.out.println("Ingrese su peso");
        peso = scan.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura = scan.nextDouble();

        imc= peso/(Math.pow(estatura,2));

        if(imc < 22 && edad <45) System.out.println("El riesgo de una enfermedad coronaria es bajo");
        if(imc < 22 && edad >=45) System.out.println("El riesgo de una enfermedad coronaria es alto");
        if(imc >= 22 && edad <45) System.out.println("El riesgo de una enfermedad coronaria es medio");
        if(imc >= 22 && edad >=45) System.out.println("El riesgo de una enfermedad coronaria es alto");
    }
}
