package Modelo;

/**
 *
 * @author omar
 */
public class EmpleadoPorHoras extends Empleado {

    private double sueldo;
    private double horas;

    public EmpleadoPorHoras(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroSeguroSocial, double sueldo, double horas) {
        super(nombre, apellidoPaterno, apellidoMaterno, numeroSeguroSocial);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerHoras(double horas) {
        this.horas = horas;
    }

    public double obtenerHoras() {
        return horas;
    }

    @Override
    public double ingresos() {
        if (horas <= 40) {
            return sueldo * horas;
        } else {
            return 40 * sueldo + (horas - 40) * sueldo * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\nSueldo por hora: %.2f\nHoras trabajadas: %.2f", super.toString(), obtenerSueldo(), obtenerHoras());
    }
}
