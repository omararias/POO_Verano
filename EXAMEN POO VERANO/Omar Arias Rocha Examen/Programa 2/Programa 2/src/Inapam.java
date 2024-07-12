/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Inapam extends Cliente {
    private int numeroCredencial;

    public Inapam(int numeroCliente, String nombre, String apellidoP, double importe, Fecha fechaVisita,int numeroCredencial) {
        super(numeroCliente, nombre, apellidoP, importe, fechaVisita);
        this.numeroCredencial = numeroCredencial;
    }

    public int getNumeroCredencial() {
        return numeroCredencial;
    }

    public void setNumeroCredencial(int numeroCredencial) {
        this.numeroCredencial = numeroCredencial;
    }

    @Override
    public double importePorPagar() {
        return super.getImporte()*.95;
    }

    @Override
    public String toString() {
        return super.toString()+ " Numero de credencial inapam: "+numeroCredencial;
    }
    
    
    
    
    
    
    
}
