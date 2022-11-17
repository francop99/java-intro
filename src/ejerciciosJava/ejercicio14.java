
package ejerciciosJava;

import java.util.Scanner;


public class ejercicio14 {
    public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    externa:
    while(true){
        System.out.println("CONVERSOR MONETARIO DE EUROS");
        System.out.println("1. euros a libras");
        System.out.println("2. euros a yenes");
        System.out.println("3.euros a dolares");
        System.out.println("4. salir del sistema");
    
        System.out.println("ingrese una opcion");
       
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                conversor(0.86,"libras");
                break;
            case 2:
                conversor(129.85,"yenes");
                break;
            case 3:
                conversor(1.28,"dolares");
                break;
            case 4:
                System.out.println("CERRANDO SISTEMA");
                
                break externa ;
            default:
                System.out.println("LA OPCION NO EXISTE");
                
        }
    }
    
    }
    static void conversor(double valor, String pais){
    
    Scanner leer = new Scanner(System.in);
        System.out.println("ingresar la cantidad de euros");
        double cantidadeuros = leer.nextDouble();
        double dolar = cantidadeuros * valor;
        
        
        System.out.println("----------------------------");
        System.out.println("/   tienes "+ dolar + pais +  " /");
        System.out.println("----------------------------");
    }
    
}
