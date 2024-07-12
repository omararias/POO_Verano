
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author omara
 */
public class TestRevista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Revista revista1= new Revista("Revista FMAT 2024",12345678,2024,"UADY EDITORIAL");
        revista1.imprimir();
        Scanner scanner = new Scanner(System.in);
        Revista revista2=new Revista();
        
        System.out.println("ingrese el nombre de la revista");
        String name=scanner.nextLine();
        revista2.setNombre(name);
        System.out.println("ingrese el issn de su revista");
        int issn=scanner.nextInt();
        revista2.setIssn(issn);
        System.out.println("ingrese el año de su revista");
        int year=scanner.nextInt();
        scanner.nextLine();
        revista2.setYear(year);
        System.out.println("ingrese el nombre de su editorial");
        String editorialName=scanner.nextLine();
        revista2.setEditorial(editorialName);
        revista2.imprimir();
    }
    
}
