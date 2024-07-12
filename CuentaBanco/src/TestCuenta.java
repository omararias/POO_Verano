
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author omara
 */
public class TestCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        Scanner numScanner = new Scanner(System.in);
        Cuenta cuenta= new Cuenta();
        System.out.println("Ingrese el numero de su cuenta a crear: ");
        cuenta.setNumeroCuenta(numScanner.nextInt());
        System.out.println("Ingrese el tipo de su cuenta a crear: ");
        cuenta.setTipo(textScanner.nextLine());
        System.out.println("Ingrese el saldo de su cuenta a crear: ");
        cuenta.setSaldo(numScanner.nextDouble());
        System.out.println("Su cuenta ha sido creada exitosamente!");
        boolean menu= true;
        while (menu==true){
            System.out.println("");
            System.out.println("Bienvenido al banco Arias, elija una opción del menú");
            System.out.println("1= abonar, 2= consultar saldo, -1= salir");
            int opcion= numScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción de abonar");
                    System.out.println("Ingrese la cantidad a abonar:");
                    cuenta.abonar(numScanner.nextDouble());
                // código a ejecutar si expresion == valor1
                    break;
                case 2:
                    System.out.println("Ha elegido consultar su saldo!");
                    System.out.println("Su saldo es el siguiente: "+cuenta.obtenerSaldo()+" pesos mexicanos.");
                    break;
                case -1:
                    System.out.println("Ha elegido salir del sistema, gracias por la confianza");
                    menu=false;
                    break;
                default:
                    System.out.println("Ingrese una opción valida por favor!");
                    break;
}
            
        
            
        }
        
        /*
        while (true){
        
        }
        
        
        
        */

    }
    
}
