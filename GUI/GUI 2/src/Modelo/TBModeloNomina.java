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
public class TBModeloNomina {

    private List<PorPagar> empleados = Inicio.porPagarLista;

    public void inicializaTabla(JTable tabla) {
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>(); //esta debe ser una matriz

        titulos.add("Nombre");
        titulos.add("Apellido paterno");
        titulos.add("Apellido materno");
        titulos.add("Seguro Social");
        titulos.add("Pago");

        for (PorPagar empleado : empleados) {
            if (empleado instanceof Empleado) {
                Vector<Object> row = new Vector<Object>();
                Empleado emp = (Empleado) empleado;

                row.add(emp.getNombre());
                row.add(emp.getApellidoPaterno());
                row.add(emp.getApellidoMaterno());
                row.add(emp.getNumeroSeguroSocial());
                row.add(emp.obtenerMontoPago());

                datos.add(row);
            } else {
                System.out.println("Objeto en porPagarLista no es de tipo Empleado: " + empleado.getClass().getSimpleName());
            }
        }
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
    }

    public void bonificaciones(String tipoEmpleado, double porcentaje) {
        for (PorPagar empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                if (tipoEmpleado.equals("PorHoras")) {
                    EmpleadoPorHoras empPorHoras = (EmpleadoPorHoras) empleado;
                    double horasActuales = empPorHoras.obtenerHoras();
                    double porcentajeDecimal = porcentaje / 100.0;
                    double horasNuevas = horasActuales * (1 + porcentajeDecimal);
                    empPorHoras.establecerHoras(horasNuevas);
                }
            } else if (empleado instanceof EmpleadoAsalariado) {
                if (tipoEmpleado.equals("Asalariado")) {
                    EmpleadoAsalariado empAsalariado = (EmpleadoAsalariado) empleado;
                    double salarioActual = empAsalariado.obtenerSalarioSemanal();
                    double porcentajeDecimal = porcentaje / 100.0;
                    double salarioNuevo = salarioActual * (1 + porcentajeDecimal);
                    empAsalariado.establecerSalarioSemanal(salarioNuevo);
                }
            } else if (empleado instanceof EmpleadoBaseMasComision) {
                if (tipoEmpleado.equals("BaseMasComision")) {
                    EmpleadoBaseMasComision empBaseMasComision = (EmpleadoBaseMasComision) empleado;
                    double salarioBaseActual = empBaseMasComision.obtenerSalarioBase();
                    double porcentajeDecimal = porcentaje / 100.0;
                    double salarioBaseNuevo = salarioBaseActual * (1 + porcentajeDecimal);
                    empBaseMasComision.establecerSalarioBase(salarioBaseNuevo);
                }
            }
            else if (empleado instanceof EmpleadoPorComision) {
                if (tipoEmpleado.equals("PorComision")) {
                    EmpleadoPorComision empPorComision = (EmpleadoPorComision) empleado;
                    double porcentajeDecimal = porcentaje / 100.0;
                    double nuevaComision = empPorComision.obtenerTarifaComision() * (1 + porcentajeDecimal);
                    empPorComision.establecerTarifaComision(nuevaComision);
                }
            } else {
                System.out.println("Tipo de empleado desconocido o no implementado: " + empleado.getClass().getSimpleName());
            }
        }
    }
}
