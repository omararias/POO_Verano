/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Radio implements Botones {
    private int anio;
    private String modelo;

    public Radio(int anio, String modelo) {
        this.anio = anio;
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String volumen() {
        return "SUBIR VOLUMEN GIRANDO LA PERILLA";
    
    }
    


    @Override
    public String toString() {
        return "Radio{" + "anio=" + anio + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
}
