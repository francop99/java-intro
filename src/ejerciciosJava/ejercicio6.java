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
public class ejercicio6 {
    public static void main(String[]args ){
    Scanner leer = new Scanner(System.in);
    int numero = leer.nextInt();
   
    
    if (numero % 2 ==0){
        System.out.println("el numero ingresado es par");
    
    }else{
        System.out.println("el numero ingresado es impar");
    
    }
    
    
    }
    
}
