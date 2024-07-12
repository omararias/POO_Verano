/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Normal extends Cliente {
    
    private int numeroVisita;

    public Normal(int numeroCliente, String nombre, String apellidoP, double importe, Fecha fechaVisita,int numeroVisita) {
        super(numeroCliente, nombre, apellidoP, importe, fechaVisita);
        this.numeroVisita = numeroVisita;
    }

    public int getNumeroVisita() {
        return numeroVisita;
    }

    public void setNumeroVisita(int numeroVisita) {
        this.numeroVisita = numeroVisita;
    }
    
    

    @Override
    public double importePorPagar() {
        if (this.numeroVisita>=10){
            return super.getImporte()*.95;
        }else{
            return super.getImporte();
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Numero de visita: "+numeroVisita;
    }
    
    
}
