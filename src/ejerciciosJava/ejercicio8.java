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
public class ejercicio8 {
    public static void main(String []args){
    Scanner leer = new Scanner(System.in);
    String frase =leer.nextLine();
    
    if (frase.length()==8){
    
        System.out.println("frase correcta");
    }else {
        System.out.println("frase incorrecta");
    }
    
    
   
}
}