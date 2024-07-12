/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String nombre, String apellidoP, String apellidoM, String nSeguroSocial) {
        super(nombre, apellidoP, apellidoM, nSeguroSocial);
        if (salarioSemanal>=0){
            this.salarioSemanal = salarioSemanal;
            
        }else{
            System.out.println("SALARIO INGRESADO INVALIDO POR SER NEGATIVO. SE REGISTRARÁ SALARIO COMO $0.");
            this.salarioSemanal=0;
        }
        
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

   
    
    @Override
    public double ingresos(){
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return super.toString()+" semanalmente";
    }
    
    
    
}
