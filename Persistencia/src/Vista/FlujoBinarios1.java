/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author omara
 */
public class FlujoBinarios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreArchivo="Datos.dat";
        
        
        
        try{
            FileOutputStream archivo= new FileOutputStream (nombreArchivo);
            ObjectOutputStream salida= new ObjectOutputStream (archivo);
            salida.writeObject("Hoy es");
            salida.writeObject(new Date());
            salida.close();
            
         
        }
        catch (IOException excep1){
            System.out.println("error escribiendo el archivo");
        } 
        
        try{
            FileInputStream archivo2= new FileInputStream (nombreArchivo);
            ObjectInputStream entrada= new ObjectInputStream (archivo2);
            
            String dato= (String) entrada.readObject();
            Date date1= (Date) entrada.readObject();
            System.out.println(dato+": "+date1);
            
            
            
         
        }
        catch (IOException excep2){
            System.out.println("error al leer el archivo");
        }
        catch (ClassNotFoundException excep3){
            System.out.println("clase no encontrada");
        }
    }
    
}
