
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Conversiondolar {
    public static void main(String [] args) {
        
        Scanner lector=new Scanner (System.in);
        double cantidad,resultado;
        int opcion;
        String menu="""
                    Ingrese una opcion de conversion:
                    1. Soles a dolares
                    2. Dolares a soles
                    3. Soles a euros
                    4. Euros a soles
                    5. Dolares a euros
                    6. Euros a dolares
                    
                    Ingrese una opcion""";
        
        System.out.println(menu);
        opcion=lector.nextInt();
        
        if (opcion>=0 && opcion<=6) {
        
            System.out.println("Ingrese la cantidad a convertir");
            cantidad=lector.nextDouble();
        
            switch (opcion) {
                case 1:
                    resultado=cantidad/3.82;
                    System.out.println("La cantidad en dolares es: $"+resultado);
                    break;
                
                case 2:
                    resultado=cantidad*3.82;
                    System.out.println("La cantidad en soles es: S/"+resultado);
                    break;
                
                case 3: 
                    resultado=cantidad/4.17;
                    System.out.println("La cantidad en euros es: €"+resultado);
                    break;

                case 4:
                    resultado=cantidad*4.17;
                    System.out.println("La cantidad en soles es: S/"+resultado);
                    break;

                case 5:
                    resultado=cantidad*(0.88);
                    System.out.println("La cantidad en euros es: €"+resultado);
                    break;

                case 6: 
                    resultado=cantidad/0.88;
                    System.out.println("La cantidad en dolares es: $"+resultado);
                    break;

                default: 
                    System.out.println("Error");      
        
            }        
        } else System.out.println("Elija del 1 al 6");
    }
    
}
