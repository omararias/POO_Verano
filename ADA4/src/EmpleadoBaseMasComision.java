/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, double tarifaComision, double ventasBrutas, String nombre, String apellidoP, String apellidoM, String nSeguroSocial) {
        super(tarifaComision, ventasBrutas, nombre, apellidoP, apellidoM, nSeguroSocial);
        if(salarioBase>=0){
            this.salarioBase = salarioBase;
            
        }else{
            System.out.println("VALOR NEGATIVO EN SALARIO BASE. SE REGISTRARA COMO 0$");
            this.salarioBase = 0;
        }
        
    }



    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    public double ingresos(){
        return ((super.ingreso())+salarioBase);
    }
    @Override
    public String toString() {
        return "Nombre completo del empleado: "+super.getNombre()+" "+super.getApellidoP()+" "+super.getApellidoM()+"  Numero del SS: "+super.getnSeguroSocial()+"\n Ganancias/pago total: "+ingresos()+"\n Salario: "+getSalarioBase()+" Comisiones: "+super.ingreso();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
