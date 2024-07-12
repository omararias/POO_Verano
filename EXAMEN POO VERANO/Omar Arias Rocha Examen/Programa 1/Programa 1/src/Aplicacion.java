
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
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion de variables
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner numScanner = new Scanner(System.in);
        Scanner StrScanner=new Scanner(System.in);
        double importe=0;
        String nombre,apellidoP="";
        int numeroCliente,numeroCredencial,numeroVisita,diaN,mesN,anioN,diaV,mesV,anioV=0;
        
        
        
        
        
        System.out.println("BIENVENIDO AL RESTAURANTE PMIs");
        boolean menu= true;
        while (menu==true){
            System.out.println("INGRESE NUMERICAMENTE SU OPCION DE PREFERENCIA");
            System.out.println("1= COBRO A CLIENTE FRECUENTE 2= COBRO A CLIENTE INAPAM");
            System.out.println("3= COBRO A CLIENTE NORMAL 4= IMPRIMIR TODOS LOS COBROS");
            System.out.println("--------------------------");
            System.out.println("5= SALIR!!!");
            int opcion=numScanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("HA ELEGIDO COBRAR A CLIENTE FRECUENTE");
                    System.out.println("INGRESE EL NUMERO DEL CLIENTE");
                    numeroCliente=numScanner.nextInt();
                    System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido del cliente");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("INGRESE EL IMPORTE DE CONSUMO");
                    importe=numScanner.nextDouble();
                    System.out.println("A CONTINUACIÓN INGRESE LA FECHA DE CONSUMO POR FAVOR:");
                    System.out.println("----------------");
                    System.out.println("INGRESE EL DIA DE CONSUMO");
                    diaV=numScanner.nextInt();
                    System.out.println("INGRESE EL MES DE CONSUMO");
                    mesV=numScanner.nextInt();
                    System.out.println("INGRESE EL ANIO DE CONSUMO");
                    anioV=numScanner.nextInt();
                    System.out.println("A CONTINUACIÓN INGRESE SU FECHA DE NACIMIENTO POR FAVOR:");
                    System.out.println("----------------");
                    System.out.println("INGRESE SU DIA DE NACIMIENTO");
                    diaN=numScanner.nextInt();
                    System.out.println("INGRESE EL MES DE SU NACIMIENTO");
                    mesN=numScanner.nextInt();
                    System.out.println("INGRESE EL ANIO DE SU NACIMIENTO");
                    anioN=numScanner.nextInt();
                    Fecha fechaV= new Fecha(diaV,mesV,anioV);
                    Fecha fechaN=new Fecha(diaN,mesN,anioN);
                    Frecuente frecuente= new Frecuente(numeroCliente,nombre,apellidoP,importe,fechaV,fechaN);
                    clientes.add(frecuente);
                    System.out.println("Se ha registrado exitosamente el siguiente cobro:");
                    System.out.println(frecuente);
                    
                    
                    break;
                case 2:
                    System.out.println("HA ELEGIDO COBRAR A CLIENTE INAPAM");
                    System.out.println("INGRESE EL NUMERO DEL CLIENTE");
                    numeroCliente=numScanner.nextInt();
                    System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido del cliente");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("INGRESE EL IMPORTE DE CONSUMO");
                    importe=numScanner.nextDouble();
                    System.out.println("A CONTINUACIÓN INGRESE LA FECHA DE CONSUMO POR FAVOR:");
                    System.out.println("----------------");
                    System.out.println("INGRESE EL DIA DE CONSUMO");
                    diaV=numScanner.nextInt();
                    System.out.println("INGRESE EL MES DE CONSUMO");
                    mesV=numScanner.nextInt();
                    System.out.println("INGRESE EL ANIO DE CONSUMO");
                    anioV=numScanner.nextInt();
                    System.out.println("INGRESE EL NUMERO DE SU CREDENCIAL INAPAM");
                    numeroCredencial=numScanner.nextInt();
                    Fecha fechaVisita= new Fecha(diaV,mesV,anioV);
                    Inapam inapam= new Inapam(numeroCliente,nombre,apellidoP,importe,fechaVisita,numeroCredencial);
                    clientes.add(inapam);
                    System.out.println("Se ha registrado exitosamente el siguiente cobro:");
                    System.out.println(inapam);
                    break;
                case 3:
                    System.out.println("HA ELEGIDO COBRAR A CLIENTE NORMAL");
                    System.out.println("INGRESE EL NUMERO DEL CLIENTE");
                    numeroCliente=numScanner.nextInt();
                    System.out.println("INGRESE EL NOMBRE DEL CLIENTE");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido del cliente");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("INGRESE EL IMPORTE DE CONSUMO");
                    importe=numScanner.nextDouble();
                    System.out.println("A CONTINUACIÓN INGRESE LA FECHA DE CONSUMO POR FAVOR:");
                    System.out.println("----------------");
                    System.out.println("INGRESE EL DIA DE CONSUMO");
                    diaV=numScanner.nextInt();
                    System.out.println("INGRESE EL MES DE CONSUMO");
                    mesV=numScanner.nextInt();
                    System.out.println("INGRESE EL ANIO DE CONSUMO");
                    anioV=numScanner.nextInt();
                    System.out.println("INGRESE EL NUMERO DE SU VISITA");
                    numeroVisita=numScanner.nextInt();
                    Fecha fechaVisit= new Fecha(diaV,mesV,anioV);
                    Normal normal= new Normal(numeroCliente,nombre,apellidoP,importe,fechaVisit,numeroVisita);
                    clientes.add(normal);
                    System.out.println("Se ha registrado exitosamente el siguiente cobro:");
                    System.out.println(normal);
                    break;
                case 4:
                    System.out.println("HA ELEGIDO IMPRIMIR TODOS LOS COBROS");
                    System.out.println("");
                if (clientes.isEmpty()) {
                    System.out.println("----------------");
                    System.out.println("No hay ninguna compra/cobro registrado todavia.");
                    System.out.println("----------------");
                    System.out.println("");
                } else {
                    System.out.println("");
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                        
                        if (cliente instanceof Frecuente){
                            System.out.println("CUENTA CON 10% DE DESCUENTO POR SER CLIENTE FRECUENTE");
                        } else if (cliente instanceof Inapam){
                            System.out.println("CUENTA CON 5% DE DESCUENTO POR SER CLIENTE INAPAM");
                        } else if (cliente instanceof Normal){
                            if (((Normal) cliente).getNumeroVisita()>=10){
                                System.out.println("CUENTA CON 5% DE DESCUENTO POR TENER MAS DE 10 VISITAS ACUMULADAS");
                            } else{
                                System.out.println("NO CUENTA CON NINGUN BENEFICIO");
                            }
                        }
                    
                    System.out.println("-----");
                    System.out.println("IMPORTE FINAL A PAGAR CON LOS DESCUENTOS APLICABLES (EN CASO DE)");
                    System.out.println(cliente.importePorPagar());
                    System.out.println("---------------------");
                    }
                }
                    break;
                case 5:
                    System.out.println("HA ELEGIDO SALIR DEL PROGRAMA. HASTA PRONTO");
                    menu=false;
                    break;
                default:
                    System.out.println("OPCION INGRESADA NO VALIDA, FAVOR DE INGRESAR UN VALOR CORRECTO");
                    break;
                    
            }
                
            }
        
    }
    
}
