package Modelo;

/**
 *
 * @author omar
 */
public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(nombre, apellidoPaterno, apellidoMaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void establecerVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public void establecerTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    @Override
    public double ingresos() {
        return (obtenerTarifaComision() / 100) * obtenerVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("Empleado por comision: %s\nVentas brutas: %.2f\nTarifa de comision: %.2f%%", super.toString(), obtenerVentasBrutas(), obtenerTarifaComision());
    }
}
