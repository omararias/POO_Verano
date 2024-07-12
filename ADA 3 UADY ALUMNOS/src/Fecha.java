/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    return true; // Es divisible por 400, es bisiesto
                } else {
                    return false; // Es divisible por 100 pero no por 400, no es bisiesto
                }
            } else {
                return true; // Es divisible por 4 pero no por 100, es bisiesto
            }
        } else {
            return false; // No es divisible por 4, no es bisiesto
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    @Override
    public String toString() {
        return "(d/m/a): "+getDia()+"/"+getMes()+"/"+getAnio()+"\n";
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public Fecha(int dia, int mes, int anio) {
        if (this.esBisiesto(anio)==true){
            switch(mes){
                case 1,3,5,7,8,10,12:
                    if(dia>=1&&dia<=31){
                        this.dia = dia;
                        this.mes = mes;
                        this.anio = anio;
                    }else{
                        System.out.println("EL DIA INGRESADO ES INVALIDO. SE ESTABLECERA LA FECHA COMO 1/1/1");
                        this.dia = 1;
                        this.mes = 1;
                        this.anio = 1;
                        
                    }
                    break;
                case 4,6,9,11:
                    if(dia>=1&&dia<=30){
                        this.dia = dia;
                        this.mes = mes;
                        this.anio = anio;
                    }else{
                        System.out.println("EL DIA INGRESADO ES INVALIDO. SE ESTABLECERA LA FECHA COMO 1/1/1");
                        this.dia = 1;
                        this.mes = 1;
                        this.anio = 1;
                        
                    }
                    break;
                case 2:
                    if(dia>=1&&dia<=29){
                        this.dia = dia;
                        this.mes = mes;
                        this.anio = anio;
                    }else{
                        System.out.println("EL DIA INGRESADO ES INVALIDO. SE ESTABLECERA LA FECHA COMO 1/1/1");
                        this.dia = 1;
                        this.mes = 1;
                        this.anio = 1;
                        
                    }
                    break;
                default:
                    System.out.println("Mes ingresado no válido. Se registrará la fecha como 1/1/1");
                    this.dia = 1;
                    this.mes = 1;
                    this.anio = 1;
                    break;
                    
                    
                    
            }
            
        }else {
            switch(mes){
                case 1,3,5,7,8,10,12:
                    if(dia>=1&&dia<=31){
                        this.dia = dia;
                        this.mes = mes;
                        this.anio = anio;
                    }else{
                        System.out.println("EL DIA INGRESADO ES INVALIDO. SE ESTABLECERA LA FECHA COMO 1/1/1");
                        this.dia = 1;
                        this.mes = 1;
                        this.anio = 1;
                        
                    }
                    break;
                case 4,6,9,11:
                    if(dia>=1&&dia<=30){
                        this.dia = dia;
                        this.mes = mes;
                        this.anio = anio;
                    }else{
                        System.out.println("EL DIA INGRESADO ES INVALIDO. SE ESTABLECERA LA FECHA COMO 1/1/1");
                        this.dia = 1;
                        this.mes = 1;
                        this.anio = 1;
                        
                    }
                    break;
                case 2:
                    if(dia>=1&&dia<=28){
                        this.dia = dia;
                        this.mes = mes;
                        this.anio = anio;
                    }else{
                        System.out.println("EL DIA INGRESADO ES INVALIDO. SE ESTABLECERA LA FECHA COMO 1/1/1");
                        this.dia = 1;
                        this.mes = 1;
                        this.anio = 1;
                        
                    }
                    break;
                default:
                    System.out.println("Mes ingresado no válido. Se registrará la fecha como 1/1/1");
                    this.dia = 1;
                    this.mes = 1;
                    this.anio = 1;
                    break;
            
        }
    }
    
    
}
}
