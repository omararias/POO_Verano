/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.CtrlCalculadora;
import Vista.FrmCalculadora;

/**
 *
 * @author omara
 */
public class Calculadora {
    private CtrlCalculadora unCtrlCalculadora;
    private FrmCalculadora unFrmCalculadora;


    

    public CtrlCalculadora getUnCtrlCalculadora() {
        return unCtrlCalculadora;
    }

    public void setUnCtrlCalculadora(CtrlCalculadora unCtrlCalculadora) {
        this.unCtrlCalculadora = unCtrlCalculadora;
    }
    
    public String dividir (String numero1, String numero2){
        int n1,n2=0;
        n1=Integer.valueOf(numero1);
        n2=Integer.valueOf(numero2);
        int division=n1/n2;
        String resultado=""+division;
        return resultado+"hello";
    }
    
}
