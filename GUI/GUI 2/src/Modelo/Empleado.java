package Modelo;

import java.io.Serializable;

/**
 *
 * @author omar
 */
public abstract class Empleado implements PorPagar,Serializable{

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroSeguroSocial;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public abstract double ingresos(); // Método abstracto para calcular ingresos

    @Override
    public String toString() {
        return String.format("%s %s %s\nNúmero de seguro social: %s",
                getNombre(), getApellidoPaterno(), getApellidoMaterno(), getNumeroSeguroSocial());
    }

    @Override
    public double obtenerMontoPago() {
        return ingresos(); // Usamos el método ingresos como implementación de obtenerMontoPago
    }
}
