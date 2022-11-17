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
public class ejercicio3 {
    public static void main(String [] args){
        Scanner leer  = new Scanner(System.in);
        String frase1 = leer.nextLine();
        String frase2 = frase1.toLowerCase();
        String frase3= frase1.toUpperCase();
        
        System.out.println(frase2);
        System.out.println(frase3);
    
}
}