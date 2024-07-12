/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Aguila extends Animal{
    private double velocidadVuelo;

    public Aguila(double velocidadVuelo, String nombre, int edad) {
        super(nombre, edad);
        this.velocidadVuelo = velocidadVuelo;
    }

    public double getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setVelocidadVuelo(double velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }

    @Override
    public String mover() {
        return "volando...";
    
    }

    @Override
    public double altura() {
        return 75;
    
    }
    
    
    
    
}
