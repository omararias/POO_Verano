/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Serpiente extends Animal{
    private double longitud;

    public Serpiente(double longitud, String nombre, int edad) {
        super(nombre, edad);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String mover() {
        return "arrastrando...";
    }
    
    public double altura(){
        return 25;
    }
    
    

    
    
    

    


    
    
    
}
