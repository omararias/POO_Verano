package Modelo;

/**
 *
 * @author omar
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(nombre, apellidoPaterno, apellidoMaterno, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public void establecerSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double ingresos() {
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\nSalario semanal: %.2f", super.toString(), obtenerSalarioSemanal());
    }
}
