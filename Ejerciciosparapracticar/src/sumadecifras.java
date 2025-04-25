
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class sumadecifras {
    public static void main(String[] args) {
        
        int numero,centena=0,decena=0,unidad=0,suma=0;
        Scanner lector=new Scanner (System.in);
        
        System.out.println("Ingrese el número");
        numero=lector.nextInt();
        
        if (numero>=100 && numero<=999){
            
            centena=numero/100;
            decena=(numero%100)/10;
            unidad=(numero%10);
            suma=centena+decena+unidad;
            
            System.out.printf("La suma es de: %1d+%1d+%1d ", centena,decena,unidad);
            
            System.out.println("= "+suma);
              
        } else {
            System.out.println("Error, ingrese un valor dentro de 100 y 999");
        }
        
        
        
    }
}
