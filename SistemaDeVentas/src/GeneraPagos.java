/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author omara
 */
public class GeneraPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadosPorComision nuevoEmpleado= new EmpleadosPorComision("Omar","Arias","Rocha","999",1000,.10);
        System.out.println(nuevoEmpleado.ingreso());
        EmpleadoBaseMasComision empleado2= new EmpleadoBaseMasComision ("luis","lopez","tovia","888",1000,.05,1000);
        System.out.println(empleado2.ingreso());
        EmpleadoBaseMasComisionSub empleado3= new EmpleadoBaseMasComisionSub(1000,"luis","lopez","tovia","888",1000,.05);
        System.out.println(empleado3.ingresos());
    }
    
}
