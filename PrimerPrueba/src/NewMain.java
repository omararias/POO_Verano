/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author omara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto aveo = new Auto("rojo",8,4);
        System.out.println(aveo.acelerar(100));
        System.out.println(aveo.obtenerColor());
        System.out.println(aveo.obtenerCilindros());
        System.out.println(aveo.obtenerPuertas());        // TODO code application logic here
    }
    
}
