/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

import Modelo.Calculadora;
import Vista.FrmCalculadora;

/**
 *
 * @author omara
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Calculadora unaCalculadora= new Calculadora();
    CtrlCalculadora unCtrlCalculadora= new CtrlCalculadora();
    FrmCalculadora unFrmCalculadora= new FrmCalculadora();
    
    //ESTABLECEMOS RELACIONES ENTRE CLASES EN EL MAIN
    
    unFrmCalculadora.setUnCtrlCalculadora(unCtrlCalculadora);
    unaCalculadora.setUnCtrlCalculadora(unCtrlCalculadora);
    
    //enviamos una instancia de cada clase al controlador
    unCtrlCalculadora.setUnFrmCalculadora(unFrmCalculadora);
    unCtrlCalculadora.setUnaCalculadora(unaCalculadora);
    
    //iniciar la ejecucion del programa
    unFrmCalculadora.setVisible(true);
    
    }
    
}
