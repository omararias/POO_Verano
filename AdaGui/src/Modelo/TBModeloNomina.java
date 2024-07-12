/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Vector;
import Vista.Inicio;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.ucan
 */
public class TBModeloNomina {
    
    
    public void inicializaTabla(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>(); //esta debe ser una matriz
        
        titulos.add("Nombre");
        titulos.add("Apellido paterno");
        titulos.add("Apellido materno");
        titulos.add("Seguro social");
        titulos.add("Pago");
        
        for(int i=0; i< Inicio.listaEmpleados.size(); i++){
            Vector<Object> row = new Vector<Object>();
            
            row.add(  ((EmpleadoAsalariado) Inicio.listaEmpleados.get(i)).getNombre() );
            row.add(  ((EmpleadoAsalariado) Inicio.listaEmpleados.get(i)).getApellidoPaterno() );
            row.add(  ((EmpleadoAsalariado) Inicio.listaEmpleados.get(i)).getApellidoMaterno() );
            row.add(  ((EmpleadoAsalariado) Inicio.listaEmpleados.get(i)).getNoSeguroSocial() );
            row.add(  ((EmpleadoAsalariado) Inicio.listaEmpleados.get(i)).obtenerMontoPago() );
            
            datos.add(row); //Aquí se va armando la matriz de datos            
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
    }
    
    public void bonificaciones(){
        String porcentaje = JOptionPane.showInputDialog("Porcentaje a incrementar en su salario (1 a 40 porciento): ");
        for(int i=0; i<Inicio.listaEmpleados.size(); i++){
            
            EmpleadoAsalariado unEmpleado = (EmpleadoAsalariado) Inicio.listaEmpleados.get(i);
            
            unEmpleado.setSalarioBase(unEmpleado.getSalarioBase()* (1 + Double.parseDouble(porcentaje))  );
            
        }
              
     
    }
    

}
