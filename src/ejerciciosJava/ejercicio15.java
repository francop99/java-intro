/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. 
 */
package ejerciciosJava;

import java.util.Scanner;

/**
 *
 * @author ema
 */
public class ejercicio15 {
    public static void main(String[]args){
    Scanner leer = new Scanner (System.in);
    int [] vector = new int[100] ;
    
    for (int i = 0; i<100; i++){
    vector[i] = i;
    
    
    }
        System.out.println("numeros aleatorios en forma decreciente");
        
        for (int i= 99;i>=0; i--){
        vector[i] = i;
            System.out.println(vector[i]);
        }
       
       }
    
    
    
    }
    
    
    

