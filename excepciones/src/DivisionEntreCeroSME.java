
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juan.ucan
 */
public class DivisionEntreCeroSME {

    /**
     * @param args the command line arguments
     */
    
    public static double  dividir (int numerador, int denominador)
    throws ArithmeticException{
        double division = numerador/denominador; // punto de lanzamiento
        return division;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double resultado;
        boolean continuar = true;
        
        System.out.println("**** Programa para dividir dos número enteros ****");
        
        do{
            try{
                System.out.println("Escriba un numerador: ");
                int numerador = entrada.nextInt(); //punto de lanzamiento

                System.out.println("Escriba un denominador: ");
                int denominador = entrada.nextInt();  //punto de lanzamiento
                
                if(denominador < 0 ){  //punto de lanzamiento
                    throw new RangoException("El denominador debe ser mayor a cero");
                }
                
                resultado = dividir(numerador, denominador);  // punto de lanzamiento

                System.out.println("El resultado de la división es: " + resultado);
                continuar = false;
            }
            catch(ArithmeticException excep1){
                //System.out.println(excep1.getMessage());
                //excep1.printStackTrace();
                System.out.println("Clase\t\t\tArchivo\t\t\t\tMétodo\tlínea");
                 StackTraceElement listaErrores[] = excep1.getStackTrace();
                 for(int i=0; i< listaErrores.length; i++){
                     System.out.println(listaErrores[i].getClassName() + "\t" + listaErrores[i].getFileName() + "\t" + listaErrores[i].getMethodName() + "\t" + listaErrores[i].getLineNumber());
                 }
                System.out.println("El denominador debe ser diferente a cero");
            }
            catch(InputMismatchException excep2){
                System.out.println("El dato debe ser un número entero");
                //System.out.println(excep2.getMessage());
                entrada.nextLine();
            }
            catch(RangoException excep3){
                System.out.println(excep3.getMessage());
            }
        }
        while(continuar);
        
    }
    
}
