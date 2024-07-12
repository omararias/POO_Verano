/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author omara
 */
public class FlujoCaracteres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String nombreArchivo="prueba2.txt";
        
        try{
            FileWriter escribir =new FileWriter(nombreArchivo);
            for (char c='a'; c<='z';c++){
                escribir.write(c);
            }
            escribir.close();
        }catch (IOException excep1){
            System.out.println("error al escribir en el archivo");
        }
        
        int c;
        try{
            FileReader leer= new FileReader(nombreArchivo);
            c=leer.read();
            while (c!=-1){
                System.out.println((char) c);
                c=leer.read();
            }
            leer.close();
        }catch (IOException excep2){
            System.out.println("error al leer archivo");
        }
        
        
        
    }
    
}
