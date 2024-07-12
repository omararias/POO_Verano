/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Empleado {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String nSeguroSocial;

    public Empleado(String nombre, String apellidoP, String apellidoM, String nSeguroSocial) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nSeguroSocial = nSeguroSocial;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getnSeguroSocial() {
        return nSeguroSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setnSeguroSocial(String nSeguroSocial) {
        this.nSeguroSocial = nSeguroSocial;
    }
    
    
    
}
