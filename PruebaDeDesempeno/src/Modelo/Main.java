/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import Vista.FrmInicio;
import java.util.ArrayList;

/**
 *
 * @author omara
 */
public class Main {
    public static int [] arregloDatos = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
    public static ArrayList<Errores> erroresLista = new ArrayList<Errores>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        new FrmInicio().setVisible(true);
        
    }
    
    public static void actualizarArreglo(int indice, int elemento){
        //modifica el elemento deseado del arreglo con el valor deseado
        System.out.println(arregloDatos[indice]);
        arregloDatos[indice]= elemento;
        System.out.println("Actualizado:");
        System.out.println(arregloDatos[indice]);
        
        
    }
    public static String obtenerArreglo(){
        String arregloString="";
        for (int i = 0; i < arregloDatos.length; i++){
            arregloString=arregloString+arregloDatos[i]+"\n";
            
        } 
        return arregloString;
    }
    
    
    public static String obtenerErrores(){
        String lista="";
        for (Errores error: erroresLista){
            lista=lista+error+"\n----------------\n";
            
        }
        
                
      return lista;         
    }
}
