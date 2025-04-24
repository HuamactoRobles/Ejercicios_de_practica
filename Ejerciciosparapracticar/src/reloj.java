
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class reloj {
    public static void main(String[] args) {
        
        int horas,minutos,segundos;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingrese las horas (0-23)");
        horas=lector.nextInt();
        
        System.out.println("Ingrese los minutos(0-59)");
        minutos=lector.nextInt();
        
        System.out.println("Ingrese los segundos (0-59)");
        segundos=lector.nextInt();
        
        if (horas<0 || horas>23) {
            System.out.println("Invalido");
            
            if (minutos<0 || minutos>59) {
                System.out.println("Invalido");
            
                if (segundos<0 || segundos>59) {
                    System.out.println("Invalido");
            
                }
            }
        }
        
        segundos++;
        if (segundos==60) {
            segundos=0;
            
            minutos++;
            if (minutos==60) {
                minutos=0;
                
                horas++; 
                if (horas==24); {
                    horas=0;  
                }
            }
        }
        
        System.out.printf("La hora en el siguiente segundo sera: %02d:%02d:%02d%n", horas, minutos, segundos);
        
    }
}
