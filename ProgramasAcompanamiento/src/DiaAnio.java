/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class DiaAnio {
    private int dia;
    private int mes;
    private int anio;
//constructor
    public DiaAnio(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
//getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
//setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //toString

    @Override
    public String toString() {
        return getDia()+"/"+getMes()+"/"+getAnio();
    }
    
    
    
    
    
    
    
    public void visualizar(){
        
    }
    
    public int esIgual(){
        return 0;
    }
        
           
            
    
}
