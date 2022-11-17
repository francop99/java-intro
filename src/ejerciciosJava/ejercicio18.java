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
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos la matriz
      int [][]matriz = new int[3][3];
      int numeros;
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los numeros de la matriz");
      // llenamos la matriz
      for (int i = 0; i<3; i++){
      for (int j = 0;j<3 ; j++){
      matriz[i][j]= leer.nextInt();
          
      
      }
     } 
    // mostramos la matriz
    for (int i = 0; i<3; i++){
      for (int j = 0;j<3 ; j++){
          System.out.print("/"+matriz[i][j]+"/");
          
      
      }
        System.out.println("");
     } 
    
    //-----------------mostramos la matriz transpuesta------------------------------------------------
        System.out.println("la transpuesta de la matriz es: ");
      for (int j = 0; j<3; j++){
            for (int i = 0;i<3 ; i++){
          System.out.print("/"+matriz[i][j]+"/");
          
      
      }
        System.out.println("");
     } 
    }
    
}
//nota: cambiar a numeros aleatorios en el proceso de llenar matriz.