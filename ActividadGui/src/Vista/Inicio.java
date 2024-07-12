/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.PorPagar;
import java.util.ArrayList;

/**
 *
 * @author juan.ucan
 */
public class Inicio {
    public static ArrayList<PorPagar> listaEmpleados = new ArrayList<PorPagar>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         new FrmInicio().setVisible(true);
    }
    
}
