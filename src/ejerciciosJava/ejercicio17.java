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
public class ejercicio17 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector= new int[n];
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        System.out.println("ingrese los numeros");
        
        for (int i=0; i<vector.length;i++){
        vector[i]= leer.nextInt();
           
        }
        
       
      for(int i =0; i < vector.length;i++){
      if (vector[i]<10){
           //System.out.println("el numero tiene 1 digito");
           cont1++;
       
       }  else 
       if (vector[i]<100)  {
           //System.out.println("el numero tiene 2 digitos");
       cont2++;
       }else 
           if(vector[i]<1000){
              // System.out.println("el numero tiene 3 digitos");
           cont3++;
           }else
               if(vector[i]< 10000){
                   //System.out.println("el numero tiene 4 digitos");
                   cont4++;
               }else 
                   if(vector[i]< 100000){
                       //System.out.println("el numero tiene 5 digitos");
                       cont5++;
                   
                   }
      
      }
      
        System.out.println("numeros con 1 digito: "+cont1);
        System.out.println("numeros con 2 digitos: "+cont2);
        System.out.println("numeros con 3 digitos: "+cont3);
        System.out.println("numeros con 4 digitos: "+cont4);
        System.out.println("numeros con 5 digitos: "+cont5);
       
       
        
        
        
       
       
    }
    
}
