/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ema
 */
public class Ej1gJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       int num1= leer.nextInt();
       int num2= leer.nextInt();
       int resultado = num1 + num2;
       
        System.out.println("el resultado de la suma es " + resultado);
       
    }
    
}
