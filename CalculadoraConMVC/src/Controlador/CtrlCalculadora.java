/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Calculadora;
import Vista.FrmCalculadora;

/**
 *
 * @author omara
 */
public class CtrlCalculadora {
    private FrmCalculadora unFrmCalculadora;
    private Calculadora unaCalculadora;

    
    

    public FrmCalculadora getUnFrmCalculadora() {
        return unFrmCalculadora;
    }

    public void setUnFrmCalculadora(FrmCalculadora unFrmCalculadora) {
        this.unFrmCalculadora = unFrmCalculadora;
    }

    public Calculadora getUnaCalculadora() {
        return unaCalculadora;
    }

    public void setUnaCalculadora(Calculadora unaCalculadora) {
        this.unaCalculadora = unaCalculadora;
    }
    
    public String dividir (String numero1, String numero2){
        String resultado=unaCalculadora.dividir(numero1, numero2);
        return resultado;
        
    }
    
    
}
