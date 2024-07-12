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
    
    public void ingreso(double cantidad){
        if (cantidad>=0){
            this.saldo=this.saldo+cantidad;
            
        }
        
    }
    
    public void retiro(double cantidad){
        if (cantidad>0&&this.saldo>=cantidad){
            this.saldo=this.saldo-cantidad;
            
            
        }else{
            System.out.println("Operacion no realizada por falta de saldo o monto invalido.");
        }
        
    }
    public void transferencia(Cuenta destino, double cantidad){
        if (this.obtenerSaldo()>=cantidad&&cantidad>0){
            this.retiro(cantidad);
            destino.ingreso(cantidad);
            System.out.println("La transferencia se ha realizado exitosamente");
            
        }else {
            System.out.println("La cuenta de origen no tiene suficientes fondos o el monto es invalido.");
        }
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
        if (saldo>=0){
            this.saldo = saldo;
            
        } else{
            this.saldo = 0.0;
            
        }
        this.numeroCuenta = numeroCuenta;
        this.tipo = tipo;
    }
    
}
