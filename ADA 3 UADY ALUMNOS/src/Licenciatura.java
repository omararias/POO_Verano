/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Licenciatura {
    private String facultad;
    private String carrera;

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "FACULTAD: "+getFacultad()+"\n CARRERA: "+getCarrera();
    }

    public Licenciatura(String facultad, String carrera) {
        this.facultad = facultad;
        this.carrera = carrera;
    }
}
