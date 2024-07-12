/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class Revista {
    private String nombre;
    private int issn;
    private int year;
    private String editorial;
    
    

    public Revista(String nombre, int issn, int year, String editorial) {
        this.nombre = nombre;
        this.issn = issn;
        this.year = year;
        this.editorial = editorial;
    }

    public Revista(){
        
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getIssn() {
        return issn;
    }

    public int getYear() {
        return year;
    }

    public String getEditorial() {
        return editorial;
    }
    
    
    
    public void imprimir(){
        System.out.println("Nombre:"+getNombre()+" ISSN: "+getIssn()+" Año de lanzamiento: "+getYear()+" Editorial: "+getEditorial());
    }
    
}
