/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author omara
 */
public class FlujoCaracteres1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada;
        String nombreArchivo="prueba1.txt";
        
        
        try{
            FileWriter fr= new FileWriter(nombreArchivo);
            BufferedWriter br= new BufferedWriter(fr);
            entrada="Mario@Escamilla@Navarrete@12345SS";
            br.write(entrada);
            br.close();
           
            
         
            
            
        }
        catch (IOException excep1){
            System.out.println("Imposible abrir este archivo");
        }
        try{
            FileReader fr= new FileReader(nombreArchivo);
            BufferedReader br= new BufferedReader(fr);
            while ( (entrada=br.readLine()) != null   ){
                System.out.println(entrada);
            }
            
            
        }
        catch (IOException excep2) {
            System.out.println("error al leer el archivo");
        }
        
        
    }
    
}
