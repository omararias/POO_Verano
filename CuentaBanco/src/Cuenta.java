/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Cuenta {
    private double saldo;
    private int numeroCuenta;
    private String tipo;
    
    public Cuenta(){
        
    }
    
    public void abonar(double cantidad){
        this.saldo=this.saldo+cantidad;
    }
    

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", tipo=" + tipo + '}';
    }

    public Cuenta(double saldo, int numeroCuenta, String tipo) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
    }
    
}
