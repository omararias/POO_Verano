/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adainterfaces;

/**
 *
 * @author omara
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision implements PorPagar{
    private double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, double tarifaComision, double ventasBrutas, String nombre, String apellidoP, String apellidoM, String nSeguroSocial) {
        super(tarifaComision, ventasBrutas, nombre, apellidoP, apellidoM, nSeguroSocial);
        this.salarioBase=salarioBase;
        
    }

    
    



    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    @Override
    public double generarPago(){
        return (super.generarPago())+(salarioBase);
    }
    
    
    
    
}
