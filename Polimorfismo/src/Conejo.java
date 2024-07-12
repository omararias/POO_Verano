/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Conejo extends Animal {
    private double largoOrejas;

    public Conejo(String nombre, int edad,double largoOrejas) {
        super(nombre, edad);
        this.largoOrejas = largoOrejas;
    }

    public double getLargoOrejas() {
        return largoOrejas;
    }

    public void setLargoOrejas(double largoOrejas) {
        this.largoOrejas = largoOrejas;
    }

    @Override
    public String mover() {
        return "Saltando...";
    
    }

    @Override
    public double altura() {
        return 50;
        
    }
    
    
    
    
    
}
