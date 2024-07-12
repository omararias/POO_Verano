/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adainterfaces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author omara
 */
public class AdaInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PorPagar> porPagar = new ArrayList<>();
        Scanner numScanner = new Scanner(System.in);
        Scanner StrScanner=new Scanner(System.in);
        double ventas,salario,comision,bono,precioTotal=0;
        String nombre,apellidoP,apellidoM, numSeguro,rfc="";
        int horas,numProveedor=0;
        
        boolean menu= true;
        while (menu==true){
            System.out.println("INGRESE NUMERICAMENTE SU OPCION DE PREFERENCIA");
            System.out.println("1= REGISTRAR EMPLEADO ASALARIADO 2= REGISTRAR EMPLEADO POR HORAS");
            System.out.println("3=REGISTRAR EMPLEADO POR COMISION 4= REGISTRAR EMPLEADO BASE MAS COMISION");
            System.out.println("5=REGISTRAR FACTURA   6=IMPRIMIR LISTA DE PAGOS ");
            System.out.println("--------------------------");
            System.out.println("7= SALIR!!!");
            int opcion=numScanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO ASALARIADO");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido paterno");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido materno");
                    apellidoM=StrScanner.nextLine();
                    System.out.println("Ingrese su numero de seguro social");
                    numSeguro=StrScanner.nextLine();
                    System.out.println("Ingrese el salario semanal de este empleado");
                    salario=numScanner.nextDouble();
                    EmpleadoAsalariado asalariado= new EmpleadoAsalariado(salario,nombre,apellidoP,apellidoM,numSeguro);
                    porPagar.add(asalariado);
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(asalariado);
                    break;
                case 2:System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO POR HORAS");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido paterno");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido materno");
                    apellidoM=StrScanner.nextLine();
                    System.out.println("Ingrese su numero de seguro social");
                    numSeguro=StrScanner.nextLine();
                    System.out.println("Ingrese el sueldo por hora de este empleado");
                    salario=numScanner.nextDouble();
                    System.out.println("Ingrese la cantidad de horas laboradas:");
                    horas=numScanner.nextInt();
                    EmpleadoPorHoras empleadoNuevoHoras= new EmpleadoPorHoras(salario,horas,nombre,apellidoP,apellidoM,numSeguro);
                    porPagar.add(empleadoNuevoHoras);
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(empleadoNuevoHoras);
                    break;
                case 3:
                    System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO POR COMISION");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido paterno");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido materno");
                    apellidoM=StrScanner.nextLine();
                    System.out.println("Ingrese su numero de seguro social");
                    numSeguro=StrScanner.nextLine();
                    System.out.println("Ingrese la tarifa de comision de este empleado (10% -> .10  20%-> .20)");
                    comision=numScanner.nextDouble();
                    System.out.println("Ingrese el monto de ventas brutas de este empleado:");
                    ventas=numScanner.nextInt();
                    EmpleadoPorComision comisionNew= new EmpleadoPorComision(comision,ventas,nombre,apellidoP,apellidoM,numSeguro); 
                    porPagar.add(comisionNew);
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(comisionNew);
                    
                    break;
                    
                case 4:
                    System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO CON SALARIO BASE MAS COMISION");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido paterno");
                    apellidoP=StrScanner.nextLine();
                    System.out.println("Ingrese el apellido materno");
                    apellidoM=StrScanner.nextLine();
                    System.out.println("Ingrese su numero de seguro social");
                    numSeguro=StrScanner.nextLine();
                    System.out.println("Ingrese la tarifa de comision de este empleado (10% -> .10  20%-> .20");
                    comision=numScanner.nextDouble();
                    System.out.println("Ingrese el monto de ventas brutas de este empleado:");
                    ventas=numScanner.nextInt();
                    System.out.println("Ingrese el salario base de este empleado: ");
                    salario=numScanner.nextDouble();
                    
                    EmpleadoBaseMasComision comisionBaseNew= new EmpleadoBaseMasComision(salario,comision,ventas,nombre,apellidoP,apellidoM,numSeguro);
                    porPagar.add(comisionBaseNew); 
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(comisionBaseNew);
                    break;
                case 5: 
                    System.out.println("HA ELEGIDO REGISTRAR UNA FACTURA DE PROVEEDOR");
                    System.out.println("--------------");
                    System.out.println("INGRESE EL NUM DE PROVEEDOR");
                    numProveedor=numScanner.nextInt();
                    System.out.println("INGRESE EL RFC DEL PROVEEDOR");
                    rfc=StrScanner.nextLine();
                    System.out.println("ingrese el monto de la factura");
                    precioTotal=numScanner.nextDouble();
                    Factura factura=new Factura(numProveedor,precioTotal,rfc);
                    porPagar.add(factura);
                    System.out.println(factura);
                    
                    
                case 6:
                    System.out.println("HA ELEGIDO IMPRIMIR TODA LA NOMINA DE *PAGOS* REGISTRADOS A NOMBRE DE LA EMPRESA");
                    System.out.println("");
                if (porPagar.isEmpty()) {
                    System.out.println("----------------");
                    System.out.println("No hay ningun empleado dado de alta todavia.");
                    System.out.println("----------------");
                    System.out.println("");
                } else {
                    System.out.println("");
                    for (PorPagar pago : porPagar) {
                        if (pago instanceof Factura){
                            System.out.println("--------------------");
                            System.out.println("FACTURA A PAGAR");
                            System.out.println("Proveedor: "+((Factura) pago).getRfc()+"  Monto: "+pago.generarPago());
                            System.out.println("");
                        } else if (pago instanceof Empleado){
                            System.out.println("--------------------");
                            System.out.println("EMPLEADO A PAGAR");
                            System.out.println("EMPLEADO: "+((Empleado) pago).getNombre()+" "+((Empleado) pago).getApellidoP()+"  Monto: "+pago.generarPago());
                            System.out.println("");
                            
                        }
                        
                               
                    }
                        
                    
                    }
                    
                   
                    
                    
                    
                    
                    
                    
                    break;
                case 7:
                    menu=false;
                    break;
                default:
                    System.out.println("opcion ingresada no valida, favor de ingresar una opcion valida");
                    break;
                    
                
            }
        
        
        
        
        // TODO code application logic here
        
      
        }
                
                
    
    
    }
   
    
}
