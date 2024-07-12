
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author omara
 */
public class DivisionEntreCeroSME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.println("Programa para dividir dos numeros enteros");
        System.out.println("INGRESE EL NUMERADOR");
        int numerador= entrada.nextInt();
        System.out.println("Escriba el denominador");
        int denominador= entrada.nextInt();
        
        System.out.println("El resultado es: ");
        System.out.println(numerador/denominador);
    }
    
}
