/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmann.t01.p2;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lisdy Nadine Rohmann Martínez 513659
        //Carrera: IIS
        //Problema 2 
        
        double base, altu, per, sup;
        Scanner Sc= new Scanner(System.in);
        
        System.out.println("Escriba la base del rectángulo");
        base= Sc.nextDouble();
        System.out.println("Escriba la altura del rectángulo");
        altu= Sc.nextDouble();
        
        per= ((base*2) + (altu*2));
        sup= base*altu;
        
        System.out.println("El valor del perímetro es: " + per);
        System.out.println("El valor de la superficie es: " + sup);
        
    }
    
}
