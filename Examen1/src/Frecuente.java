/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Frecuente extends Cliente{
    
    private Fecha fechaNacimiento;

    public Frecuente(int numeroCliente, String nombre, String apellidoP, double importe, Fecha fechaVisita, Fecha fechaNacimiento) {
        super(numeroCliente, nombre, apellidoP, importe, fechaVisita);
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //setters y getters

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //metodos de la clase

    @Override
    public double importePorPagar() {
    return super.getImporte()*.9;
    }
    
    
    
    
    
    //to string

    @Override
    public String toString() {
        return super.toString()+ " Fecha de nacimiento: "+fechaNacimiento;
    }
    

    
    
    
    
    
    
}
