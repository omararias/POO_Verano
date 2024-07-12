/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Auto {
    private String color;
    private int cilindros;
    private int puertas;

    public Auto(String color, int cilindros, int puertas) {
        this.color = color;
        this.cilindros = cilindros;
        this.puertas = puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String acelerar(int speed){
        return ("Acelerando a "+ speed +"km por hora!!!");
    }
    public String obtenerColor(){
        return color;
    }
    public int obtenerCilindros(){
        return cilindros;
    }
    
    public int obtenerPuertas(){
        return puertas;
    }
}
