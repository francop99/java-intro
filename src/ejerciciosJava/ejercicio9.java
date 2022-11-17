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
public class ejercicio9 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    String frase = leer.nextLine();
    
    if(frase.substring(0, 1).equals("A")){
        System.out.println("correcto");
    }else{
        System.out.println("incorrecto");
    }
    
    
  }
}
