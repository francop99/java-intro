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
public class ejercicio16 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
        System.out.println("ingresar el tamaño del vector");
        int n = leer.nextInt();
   int [] vector = new int[n] ;
   for(int i=0; i<n;i++){
   vector[i]= (int)(Math.random()*n);
       System.out.println(vector[i]);
   }
        System.out.println("ingrese el numero que desea buscar");
        int num = leer.nextInt();
   
         int pos = 0;
         for (int i=0; i< vector.length;i++){
         if (vector[i]==num){
               pos=i;
         
         }
         
         
         }
   
   if (pos==0){
       System.out.println("el numero no se encontro");
   }else{
       System.out.println("la posicion de "+num+"es: "+pos);
   }
   
   
    
    
    }
    
}
