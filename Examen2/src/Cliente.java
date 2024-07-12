/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public abstract class Cliente {
    private int numeroCliente;
    private String nombre;
    private String apellidoP;
    private double importe;
    private Fecha fechaVisita;
    
    //constructor

    public Cliente(int numeroCliente, String nombre, String apellidoP, double importe, Fecha fechaVisita) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.importe = importe;
        this.fechaVisita = fechaVisita;
    }
    
    
    
    //setters y getters

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Fecha getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Fecha fechaVisita) {
        this.fechaVisita = fechaVisita;
    }
    
    //metodo importePorPagar abstracto ya que hereda a las subclases
    
    public abstract double importePorPagar();

    @Override
    public String toString() {
        return "Numero de cliente: "+numeroCliente+" Nombre: "+nombre+" Apellido: "+apellidoP+" Importe de consumo: "+importe+" Fecha de visita: "+fechaVisita;
    }
    
    
    
    
    
    
    
}
