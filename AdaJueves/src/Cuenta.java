/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Cuenta {
    private int numeroCuenta;
    private int nip;
    private double saldoDisponible;
    private double saldoTotal;

    public Cuenta(int numeroCuenta, int nip, double saldoDisponible, double saldoTotal) {
        this.numeroCuenta = numeroCuenta;
        this.nip = nip;
        this.saldoDisponible = saldoDisponible;
        this.saldoTotal = saldoTotal;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    
    
    // metodos de la clase
    
    public boolean validarNip(){
        return true;
    }
    
    public double obtenerSaldoDisponible(){
        return 0;
        
    }
    
    public double obtenerSaldoTotal(){
        return 0;
        
    }
    
    public double abonar(){
        return 0;
    }
    
    public double cargar(){
        return 0;
    }
    
    
    
    
    
    
}
