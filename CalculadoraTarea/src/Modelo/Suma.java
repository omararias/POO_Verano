/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author omara
 */
public class Suma extends Operacion{

    public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }
    
    


    

    @Override
    public double operar() {
        double resultado=this.getNumero1()+this.getNumero2();
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
