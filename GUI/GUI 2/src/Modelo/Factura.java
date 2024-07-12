package Modelo;

import java.io.Serializable;



/**
 *
 * @author omar
 */
public class Factura implements PorPagar,Serializable {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor con cuatro argumentos
    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        establecerCantidad(cuenta); // valida y almacena la cantidad
        establecerPrecioPorArticulo(precio); // valida y almacena el precio por artículo
    }

    // Establece el número de pieza
    public void establecerNumeroPieza(String pieza) {
        numeroPieza = pieza;
    }

    // Devuelve el número de pieza
    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    // Establece la descripción de la pieza
    public void establecerDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    }

    // Devuelve la descripción de la pieza
    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    // Establece la cantidad
    public void establecerCantidad(int cuenta) {
        if (cuenta >= 0) {
            cantidad = cuenta;
        } else {
            throw new IllegalArgumentException("La cantidad debe ser >= 0");
        }
    }

    // Devuelve la cantidad
    public int obtenerCantidad() {
        return cantidad;
    }

    // Establece el precio por artículo
    public void establecerPrecioPorArticulo(double precio) {
        if (precio >= 0.0) {
            precioPorArticulo = precio;
        } else {
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0");
        }
    }

    // Devuelve el precio por artículo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Calcula el monto del pago
    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }

    // Devuelve representación String del objeto Factura
    @Override
    public String toString() {
        return String.format("Factura:\nNumero de pieza: %s (%s)\nCantidad: %d\nPrecio por articulo: %.2f",
                obtenerNumeroPieza(), obtenerDescripcionPieza(), obtenerCantidad(), obtenerPrecioPorArticulo());
    }
}
