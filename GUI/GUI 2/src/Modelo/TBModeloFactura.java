package Modelo;

import java.util.Vector;
import Vista.Inicio;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omar
 */
public class TBModeloFactura {

    private List<PorPagar> facturas = Inicio.porPagarLista;

    public void inicializaTabla(JTable tabla) {
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>(); //esta debe ser una matriz

        titulos.add("Número de pieza");
        titulos.add("Descripción");
        titulos.add("Cantidad");
        titulos.add("Precio por artículo");
        titulos.add("Pago");

        for (PorPagar porPagar : facturas) {
            if (porPagar instanceof Factura) {
                Factura factura = (Factura) porPagar;
                Vector<Object> row = new Vector<Object>();

                row.add(factura.obtenerNumeroPieza());
                row.add(factura.obtenerDescripcionPieza());
                row.add(factura.obtenerCantidad());
                row.add(factura.obtenerPrecioPorArticulo());
                row.add(factura.obtenerMontoPago());

                datos.add(row);
            } else {
                System.out.println("Objeto en porPagarLista no es de tipo Factura: " + porPagar.getClass().getSimpleName());
            }
        }
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
    }
}
