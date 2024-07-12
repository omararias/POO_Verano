/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adainterfaces;

/**
 *
 * @author omara
 */
public class Factura implements PorPagar {
    private int numProveedor;
    private double precioTotal;
    private String rfc;

    public Factura(int numProveedor, double precioTotal, String rfc) {
        this.numProveedor = numProveedor;
        this.precioTotal = precioTotal;
        this.rfc = rfc;
    }

    public int getNumProveedor() {
        return numProveedor;
    }

    public void setNumProveedor(int numProveedor) {
        this.numProveedor = numProveedor;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public double generarPago() {
        return getPrecioTotal();
        }
    
    
    
    
    

    @Override
    public String toString() {
        return "Factura{" + "numProveedor=" + numProveedor + ", precioTotal=" + precioTotal + ", rfc=" + rfc + '}';
    }
    
    
    
    
}
