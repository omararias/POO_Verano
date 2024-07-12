
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
public class PruebaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACIÓN VARIABLES
        Scanner numScanner = new Scanner(System.in);
        Scanner StrScanner=new Scanner(System.in);
        String nombre,apellidoPaterno,apellidoMaterno,facultad,carrera;
        int matricula, diaN,mesN,anioN,diaI,mesI,anioI;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        
        
        // TODO code application logic here
        System.out.println("BIENVENIDO AL SISTEMA DE ALUMNOS UADY");
        boolean menu= true;
        while (menu==true){
        System.out.println("INGRESE 1 PARA CAPTURAR ALUMNO");
        System.out.println("INGRESE 2 PARA IMPRIMIR LISTA DE ALUMNOS");
        System.out.println("INGRESE 3 PARA TERMINAR LA EJECUCIÓN DEL PROGRAMA");
        int opcion=numScanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ha seleccionado capturar un nuevo alumno.");
                System.out.println("");
                System.out.println("Ingrese por favor la matricula que desea ocupar. EN NUMEROS ENTEROS");
                matricula=numScanner.nextInt();
                System.out.println("Ingrese por favor su/sus nombres *SIN APELLIDOS*");
                nombre=StrScanner.nextLine();
                System.out.println("Ingrese su apellido PATERNO");
                apellidoPaterno=StrScanner.nextLine();
                System.out.println("Ingrese su apellido MATERNO");
                apellidoMaterno=StrScanner.nextLine();
                System.out.println("A CONTINUACIÓN, PROPORCIONE SU FECHA DE NACIMIENTO");
                System.out.println("DIA DE NACIMIENTO: ");
                diaN=numScanner.nextInt();
                System.out.println("MES DE NACIMIENTO **EN NUMEROS**: ");
                mesN=numScanner.nextInt();
                System.out.println("ANIO DE NACIMIENTO: ");
                anioN=numScanner.nextInt();
                System.out.println("A CONTINUACIÓN, INGRESE SU FECHA DE INSCRIPCION (HOY)");
                System.out.println("DIA DE INGRESO");
                diaI=numScanner.nextInt();
                System.out.println("MES DE INGRESO **EN NUMEROS**");
                mesI=numScanner.nextInt();
                System.out.println("ANIO DE INGRESO");
                anioI=numScanner.nextInt();
                System.out.println("-------------------------");
                System.out.println("Ingrese por favor la facultad a la que ingresará");
                facultad=StrScanner.nextLine();
                System.out.println("Ingrese la carrera que desea cursar");
                carrera=StrScanner.nextLine();
                Licenciatura nuevaLicenciatura= new Licenciatura(facultad,carrera);
                Fecha fechaNacimiento= new Fecha(diaN,mesN,anioN);
                Fecha fechaIngreso= new Fecha(diaI,mesI,anioI);
                Alumno nuevoAlumno=new Alumno(matricula,nombre,apellidoPaterno,apellidoMaterno, fechaNacimiento, fechaIngreso, nuevaLicenciatura);
                alumnos.add(nuevoAlumno);
                System.out.println("El siguiente alumno se ha agregado exitosamente a la lista de alumnos matriculados:");
                System.out.println(nuevoAlumno);
                
                
                
                
                break;
            case 2:
                System.out.println("Ha elegido imprimir la lista de todos los alumnos matriculados");
                System.out.println("");
                if (alumnos.isEmpty()) {
                    System.out.println("----------------");
                    System.out.println("No hay ningun alumno inscrito todavia.");
                    System.out.println("----------------");
                    System.out.println("");
                } else {
                    System.out.println("");
                    for (Alumno alumno : alumnos) {
                    System.out.println(alumno);
                    }
                }
                break;
            case 3:
                System.out.println("Ha elegido salir del programa, gracias por utilizarnos");
                menu=false;
                break;
            default:
                System.out.println("INGRESE UNA OPCIÓN VALIDA POR FAVOR");
            
        }
           
        }
        
    }
    
}
