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
public class ejercicio11 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    int num1, num2;
       do{
       System.out.println("ingrese dos numeros positivos");
       num1= leer.nextInt();
           System.out.println("ingrese el segundo valor");
           num2=leer.nextInt();
           if (num1>0 || num2>0){
        System.out.println("los numero ingresados son "+ num1 +"y"+ num2 +"esta seguro");
           System.out.println("(s/n)");
           String confirma= leer.next();
           if(confirma.equals("s")){
          break;
           }
           }
           }while(num1<0 || num2<0 );
       
    
        System.out.println("MENU "+"1.Sumar "+"2.Restar "+"3.Multiplicar "+"4.dividir "+"5.salir");
        System.out.println("Elija una opcion: ");
    
    int opcion= leer.nextInt();
    boolean salir= false;
    while(!salir){
    switch (opcion){
        case 1:
            int suma = num1 + num2;
            System.out.println("el resultado de la suma es: "+ suma);
            break;
        case 2:
            int resta = num1 - num2;
            System.out.println("el resultado de la resta es: "+ resta);
            break;
        case 3: 
            int mult= num1 * num2;
            System.out.println("el resultado de la multiplicacion es: "+ mult);
            break;
        case 4: 
            int div = num1 / num2;
            System.out.println("el resultado de la division es: " + div);
            break;
        case 5:
           
                salir= true;
                break;
        default :
            System.out.println("por favor ingresa un numero entre 1 y 5 ");
            
           //ejercicio sin terminar el bucle queda infinito.
    }
    
    }
    }
    
    } 
    
        
    
    
    
    


