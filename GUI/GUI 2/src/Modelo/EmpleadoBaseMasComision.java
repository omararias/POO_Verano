package Modelo;

/**
 *
 * @author omar
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(nombre, apellidoPaterno, apellidoMaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;

    }

    public void establecerSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        return (obtenerSalarioBase()) + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("Empleado base mas comision: %s\nSalario base: %.2f", super.toString(), obtenerSalarioBase());
    }
}
