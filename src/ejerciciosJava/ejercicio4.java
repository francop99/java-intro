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
public class ejercicio4 {
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los grados centrigrados");
        
        int gradoscent = leer.nextInt();
        int conver = 32+(9* gradoscent/5);
        int fin =  conver;
        
        System.out.println("los grados en F son: " + fin);
}
}
