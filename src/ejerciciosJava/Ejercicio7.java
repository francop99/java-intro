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
public class Ejercicio7 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la contraseña correcta");
    String password = "eureka";
    String ingresar = leer.nextLine();
    
    if (ingresar.equals(password)){
        System.out.println("la contraseña ingreada es correcta");
    
    }else{
        System.out.println("la contraseña ingresada es incorrrecta");
    }
    
    
    
    }
}
