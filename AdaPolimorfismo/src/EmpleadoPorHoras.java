/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class EmpleadoPorHoras extends Empleado{
    private double pagoPorHora;
    private int horasTrabajadas;
    
    //constructor

    public EmpleadoPorHoras(double pagoPorHora, int horasTrabajadas, String nombre, String apellidoP, String apellidoM, String nSeguroSocial) {
        super(nombre, apellidoP, apellidoM, nSeguroSocial);
        if (pagoPorHora>=0){
            this.pagoPorHora = pagoPorHora;
            
        }else {
            System.out.println("PAGO POR HORA INGRESADO DE VALOR NEGATIVO. SE REGISTRARA COMO 0$");
            this.pagoPorHora = 0;
        }
        if (horasTrabajadas>=0){
            this.horasTrabajadas=horasTrabajadas;
        }else{
            System.out.println("horas ingresadas invalidas, se registrará como 0");
            this.horasTrabajadas = 0;
        }
        
        
    }
    
    //setters y getters

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double ingresos(){
        double salario=0;
        if (getHorasTrabajadas()<=40&&getHorasTrabajadas()>=0){
            salario=(getHorasTrabajadas()*getPagoPorHora());
            
        } else if (getHorasTrabajadas()>40){
            salario=(40*getPagoPorHora()+((getHorasTrabajadas()-40)*getPagoPorHora()*1.5));
        }
        return salario;
    }

  
    
}
