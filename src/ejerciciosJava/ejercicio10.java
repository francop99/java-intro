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
public class ejercicio10 {
    public static void main (String[]args){
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el limite positivo");  
        int limite= leer.nextInt();
    
        int numero, suma=0;
        
      do
      {
          System.out.println("ingrese un numero");
      numero=leer.nextInt();
          suma=suma+numero;
      }while(suma<=limite);
      
        System.out.println("la suma de todos los numero es: "+ suma);
    
        
    
            
    
}
}