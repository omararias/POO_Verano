/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class EmpleadoBaseMasComisionSub extends EmpleadosPorComision{
    private double SalarioBase;

    public EmpleadoBaseMasComisionSub(double SalarioBase, String nombre, String apellidoP, String apellidoM, String noSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(nombre, apellidoP, apellidoM, noSeguroSocial, ventasBrutas, tarifaComision);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
    
    public double ingresos(){
        return getSalarioBase()+(getVentasBrutas()*getTarifaComision());
    }
    
    
}
