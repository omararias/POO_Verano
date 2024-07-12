
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
public class ClasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner numScanner = new Scanner(System.in);
        Scanner StrScanner=new Scanner(System.in);
        double ventas,salario,comision=0;
        String nombre,apellidoP,apellidoM, numSeguro="";
        int horas=0;
        
        boolean menu= true;
        while (menu==true){
            System.out.println("INGRESE NUMERICAMENTE SU OPCION DE PREFERENCIA");
            System.out.println("1= REGISTRAR EMPLEADO ASALARIADO 2= REGISTRAR EMPLEADO POR HORAS");
            System.out.println("3=REGISTRAR EMPLEADO POR COMISION 4= REGISTRAR EMPLEADO BASE MAS COMISION");
            System.out.println("5 IMPRIMIR TODOS LOS EMPLEADOS EN NOMINA");
            System.out.println("--------------------------");
            System.out.println("6= SALIR!!!");
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
                    empleados.add(asalariado);
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(asalariado);
                    break;
                case 2:System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO POR HORAS");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println(" Ingrese el apellido paterno");
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
                    empleados.add(empleadoNuevoHoras);
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(empleadoNuevoHoras);
                    break;
                case 3:
                    System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO POR COMISION");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println(" Ingrese el apellido paterno");
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
                    empleados.add(comisionNew);
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(comisionNew);
                    
                    break;
                    
                case 4:
                    System.out.println("ELIGIO LA OPCION DE DAR DE ALTA EMPLEADO CON SALARIO BASE MAS COMISION");
                    System.out.println("Ingrese el nombre del empleado *SIN APELLIDOS*");
                    nombre=StrScanner.nextLine();
                    System.out.println(" Ingrese el apellido paterno");
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
                    empleados.add(comisionBaseNew); 
                    System.out.println("SE HA DADO DE ALTA EXITOSAMENTE AL SIGUIENTE EMPLEADO");
                    System.out.println("------------------------");
                    System.out.println(comisionBaseNew);
                    break;
                case 5:
                    System.out.println("HA ELEGIDO IMPRIMIR TODA LA NOMINA DE EMPLEADOS REGISTRADOS A NOMBRE DE LA EMPRESA");
                    System.out.println("");
                if (empleados.isEmpty()) {
                    System.out.println("----------------");
                    System.out.println("No hay ningun empleado dado de alta todavia.");
                    System.out.println("----------------");
                    System.out.println("");
                } else {
                    System.out.println("");
                    for (Empleado empleado : empleados) {
                    System.out.println(empleado);
                    }
                }
                    break;
                case 6:
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
