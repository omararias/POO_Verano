/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import static Vista.FrmErrores.main;
import Vista.main;
import static Vista.main.erroresLista;
import java.util.Vector;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class TBModeloErrores {
    

    public void inicializaTabla(JTable tabla) {
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>(); //esta debe ser una matriz

        titulos.add("Clase");
        titulos.add("Archivo");
        titulos.add("Metodo");
        titulos.add("Linea");

        for (Errores error : erroresLista) {

                Vector<Object> row = new Vector<Object>();

                row.add(error.getClase());
                row.add(error.getArchivo());
                row.add(error.getMetodo());
                row.add(error.getLinea());
                datos.add(row);
            
        }
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
    }
    
}
