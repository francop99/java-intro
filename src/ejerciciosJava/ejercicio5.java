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
public class ejercicio5 {
    public static void main(String [] args){
    Scanner leer = new Scanner(System.in);
    int numingresado = leer.nextInt();
    int op1 = numingresado*2;
        System.out.println("el doble es: " + op1 );
    int op2 = numingresado*3;
        System.out.println("el triple es: " + op2);
    int op3 = (int)Math.sqrt(numingresado);
        System.out.println("la raiz cuadrada es: " + op3);
    
       
     
    
    }
    
    
}
