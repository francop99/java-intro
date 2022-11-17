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
public class Ejercicio13 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del cuadrado");
        int n = leer.nextInt();
        
        if(n>=0 && n<=50){
            //linea superior
        for (int i=0; i<n;i++){
            System.out.print("*");
        }
            System.out.println("");
            for(int i=0;i<n-2;i++){
                System.out.print("*");
                for(int j = 0; j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        
            //linea inferior
            for(int i =0;i<n;i++){
            System.out.print("*");
        }
     }
        
    
    }
    
}
