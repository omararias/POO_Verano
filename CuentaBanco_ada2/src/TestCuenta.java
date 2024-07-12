
import java.util.ArrayList;
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
    private static Cuenta buscarCuentaPorNumero(ArrayList<Cuenta> cuentas, int numeroDeCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta()==(numeroDeCuenta)) {
                return cuenta;
            }
        }
        return null; // Si no se encuentra la cuenta
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        Scanner numScanner = new Scanner(System.in);
        int numCuenta,tipoCuenta;
        double saldoCuenta;
        String tipoCuentaStr;
        int numeroBusqueda;
        Cuenta cuentaBusqueda;
        boolean menu= true;
        while (menu==true){
            System.out.println("");
            System.out.println("Bienvenido al banco Arias, elija una opcion del menu");
            System.out.println("1= CREAR CUENTA 2=RETIRO 3=PAGO (CUENTA DE CREDITO UNICAMENTE) 4= INGRESO O ABONO (CUENTAS DE DEBITO)");
            System.out.println("5= TRANSFERENCIA 6= CONSULTAR SALDO 7=CERRAR TERMINAL");
            int opcion= numScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opcion de crear cuenta");
                    System.out.println("--------------------------");
                    System.out.println("Ingrese el numero de su cuenta a crear: ");
                    numCuenta=numScanner.nextInt();
                    System.out.println("Ingrese el tipo de su cuenta a crear: ");
                    System.out.println("Presione 1 para cuenta de debito o 2 para cuenta de credito");
                    tipoCuenta=numScanner.nextInt();
                    if (tipoCuenta==1){
                        tipoCuentaStr="Debito";
                    }else{
                        tipoCuentaStr="Credito";                                
                    }
                    System.out.println("Ingrese el saldo de su cuenta a crear: ");
                    saldoCuenta=numScanner.nextDouble();
                    Cuenta nuevaCuenta= new Cuenta(saldoCuenta,numCuenta,tipoCuentaStr);
                    cuentas.add(nuevaCuenta);
                    System.out.println("Su cuenta ha sido creada exitosamente!");
                    break;
                case 2:
                    System.out.println("Ha elegido la opcion de RETIRO DE EFECTIVO");
                    System.out.println("Ingrese la cuenta de la que desea retirar:");
                    numeroBusqueda=numScanner.nextInt();
                    cuentaBusqueda=buscarCuentaPorNumero(cuentas,numeroBusqueda);
                    System.out.println("Ingrese la cantidad a retirar");
                    cuentaBusqueda.retiro(numScanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Ha elegido la opcion de pago (PARA TARJETAS DE CREDITO");
                    System.out.println("Ingrese su numero de cuenta");
                    numeroBusqueda=numScanner.nextInt();
                    cuentaBusqueda=buscarCuentaPorNumero(cuentas,numeroBusqueda);
                    if((cuentaBusqueda.getTipo()).equals("Credito")){
                        System.out.println("Ingrese el monto a pagar");
                        cuentaBusqueda.ingreso(numScanner.nextDouble());
                        break;
                        
                    }else{
                        System.out.println("Esta operacion solo esta disponible para cuentas de credito");
                        break;
                    }
                    
                   
                case 4:
                    System.out.println("Ha elegido la opcion de INGRESO/ABONO");
                    System.out.println("Ingrese su numero de cuenta");
                    numeroBusqueda=numScanner.nextInt();
                    cuentaBusqueda=buscarCuentaPorNumero(cuentas,numeroBusqueda);
                    if((cuentaBusqueda.getTipo()).equals("Debito")){
                        System.out.println("Ingrese el monto a pagar");
                        cuentaBusqueda.ingreso(numScanner.nextDouble());
                        break;
                        
                    }else{
                        System.out.println("Esta operacion solo esta disponible para cuentas de debito");
                        break;
                    }
                    
                case 5:
                    System.out.println("Ha seleccionado la opcion de TRANSFERENCIA");
                    System.out.println("Ingrese su numero de cuenta");
                    numeroBusqueda=numScanner.nextInt();
                    cuentaBusqueda=buscarCuentaPorNumero(cuentas,numeroBusqueda);
                    System.out.println("Ingrese el numero de cuenta al que desea transferir su dinero");
                    int numCuentaDestino=numScanner.nextInt();
                    Cuenta cuentaDestino=buscarCuentaPorNumero(cuentas,numCuentaDestino);
                    System.out.println("Ingrese la cantidad a transferir por favor: ");
                    double cantidadTransferencia=numScanner.nextDouble();
                    cuentaBusqueda.transferencia(cuentaDestino, cantidadTransferencia);
                    break;
                case 6:
                    System.out.println("Ha elegido la opcion de consultar saldo");
                    System.out.println("Ingrese su numero de cuenta");
                    numeroBusqueda=numScanner.nextInt();
                    cuentaBusqueda=buscarCuentaPorNumero(cuentas,numeroBusqueda);
                    System.out.println("Su saldo es: "+cuentaBusqueda.toString());
                    break;
                    
                case 7:
                    System.out.println("Ha elegido salir del sistema, gracias por la confianza");
                    menu=false;
                    break;
                default:
                    System.out.println("Ingrese una opción valida por favor!");
                    break;
        
       
        
        
        /*
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
            System.out.println("1= abonar, 2= retirar dinero, 3=consultar saldo -1= salir");
            int opcion= numScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción de abonar");
                    System.out.println("Ingrese la cantidad a abonar:");
                    cuenta.ingreso(numScanner.nextDouble());
                // código a ejecutar si expresion == valor1
                    break;
                case 2:
                    System.out.println("Ha elegido la opción de retirar");
                    System.out.println("Ingrese la cantidad a retirar:");
                    cuenta.retiro(numScanner.nextDouble());
                    
                case 3:
                    System.out.println("Ha elegido consultar su saldo!");
                    System.out.println(cuenta);
                    break;
                    
                case -1:
                    System.out.println("Ha elegido salir del sistema, gracias por la confianza");
                    menu=false;
                    break;
                default:
                    System.out.println("Ingrese una opción valida por favor!");
                    break;
}
            */
        
            
            }
        
        /*
        while (true){
        
        }
        
        
        
        */

        }
    
    }
}