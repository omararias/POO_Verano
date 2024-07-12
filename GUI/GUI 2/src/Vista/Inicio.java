package Vista;

import Modelo.PorPagar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class Inicio {

    public static ArrayList<PorPagar> porPagarLista = new ArrayList<PorPagar>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lecturaBD();
        new FrmInicio().setVisible(true);
    }
    
    public static void escrituraBD() {
        String nombreArchivo = "bd.dat";
        try {
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            ObjectOutputStream salida = new ObjectOutputStream(archivo); //1.Abrir flujo de datos
            salida.writeObject(porPagarLista);

            salida.close(); //3.Cerrando flojo de datos
        } catch (IOException excep1) {
            System.out.println("Imposible abrir el archivo para escribir");
        }
    }

    
    public static void lecturaBD() {
        String nombreArchivo = "bd.dat";
        try {
            FileInputStream archivo2 = new FileInputStream(nombreArchivo);
            ObjectInputStream entrada = new ObjectInputStream(archivo2); //1.Abriendo flujo de datos

            porPagarLista = (ArrayList<PorPagar>) entrada.readObject();
            //String dato = (String) entrada.readObject(); //2.Lectura de datos
            //Date fecha = (Date) entrada.readObject();
            entrada.close(); //3.Cerrar el flujo de datos

            //System.out.println(dato + " " + fecha);
        } catch (IOException excep2) {
            System.out.println("Imposible abrir el archivo para leer");
        } catch (ClassNotFoundException excep3) {
            System.out.println("El tipo de dato a convertir no es el correspondiente");
        }
    }


}
