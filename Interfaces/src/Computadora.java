/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Computadora implements Botones {
    private int nSerie;
    private int memoria;

    public Computadora(int nSerie, int memoria) {
        this.nSerie = nSerie;
        this.memoria = memoria;
    }

    public int getnSerie() {
        return nSerie;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String volumen() {
    return "SUBIR VOLUMEN HACIENDO CLICK CON EL RATON";
    }
    
    
    
    
}
