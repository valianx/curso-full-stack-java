/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupal11;
import java.util.Scanner;
/**
 *
 * @author Valian
 */
public class Grupal11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora, add, resultado, dias;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        System.out.println("Ingrese la hora");
        hora = scan.nextInt();
        System.out.println("Ingrese la cantidad de horas a adicionar");
        add = scan.nextInt();

        if(hora + add <= 12){
            resultado = hora + add ;
        }else{
            dias = (hora + add) / 12;
            resultado = (hora + add) - dias * 12;
        }
        System.out.println("En "+add+" horas, el reloj marcará las "+resultado+":00 horas");
    }
}
