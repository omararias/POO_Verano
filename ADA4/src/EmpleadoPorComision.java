/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class EmpleadoPorComision extends Empleado{
    private double tarifaComision;
    private double ventasBrutas;

    public EmpleadoPorComision(double tarifaComision, double ventasBrutas, String nombre, String apellidoP, String apellidoM, String nSeguroSocial) {
        super(nombre, apellidoP, apellidoM, nSeguroSocial);
        if(tarifaComision>=0&&tarifaComision<=1.0){
            this.tarifaComision = tarifaComision;
        } else {
            System.out.println("TARIFA INGRESADA NO VALIDA. SE ESPECIFICARÁ COMO 0.0");
            this.tarifaComision = 0;
        }
        if (ventasBrutas>=0){
            this.ventasBrutas = ventasBrutas;
            
        }else{
            this.ventasBrutas = 0;
        }
        
        
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
    
    public double ingreso(){
        return (getTarifaComision()*getVentasBrutas());
    }

    @Override
    public String toString() {
        return "Nombre completo del empleado: "+super.getNombre()+" "+super.getApellidoP()+" "+super.getApellidoM()+"  Numero del SS: "+super.getnSeguroSocial()+"\n Ganancias/pago: "+ingreso();
    }
    
    
    
    
}
