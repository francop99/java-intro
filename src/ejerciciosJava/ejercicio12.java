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
public class ejercicio12 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    String frase,FDE="&&&&&";
    int correcto=0, incorrecto=0;
    do{
        System.out.println("ingrese el pedido");
        frase=leer.next();
        
        if (frase.length()==5){
            
              
            }if(frase.length()>5){
            System.out.println("pedido demasiado largo");
            incorrecto++;
            }
                    else if (frase.substring(0, 1).equals("X")&& frase.substring(frase.length()-1).equals("O")){
                System.out.println("pedido correcto");
                correcto++;
            }else{
            System.out.println("pedido incorrecto");
            incorrecto++;
            }
    
    
       
        
    }while(!(frase.equals(FDE)));
    
    
        System.out.println("los mensajes correctos son:"+correcto);
        System.out.println("los mensajes incorrectos son:"+incorrecto);
    
    
    
    }
}
    
    
  
     
    
    
            
    
    
    
    
    

