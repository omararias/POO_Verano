/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juan.ucan
 */
public class EmpleadoAsalariado implements PorPagar{
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String noSeguroSocial;
    private double salarioBase;
    
    //constructor
    public EmpleadoAsalariado(String nombre, String apellidoPaterno, String apellidoMaterno, String noSeguroSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.noSeguroSocial = noSeguroSocial;
        this.salarioBase = salarioBase;
    }
    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNoSeguroSocial(String noSeguroSocial) {
        this.noSeguroSocial = noSeguroSocial;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNoSeguroSocial() {
        return noSeguroSocial;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    //Código del método abstracto

    @Override
    public double obtenerMontoPago() {
        return getSalarioBase();
    }
    
    
    //Método toString

    @Override
    public String toString() {
        return "nombre=" + getNombre() + ", apellidoPaterno=" + getApellidoPaterno() + ", apellidoMaterno=" + getApellidoMaterno() + ", noSeguroSocial=" + getNoSeguroSocial() + ", salarioBase=" + getSalarioBase();
    }
    
    
    
}
