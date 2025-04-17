
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Puntuacion {
    public static void main(String[] Args) {
        
        int puntuacion;
        Scanner lector=new Scanner (System.in);
        String menu="""
                    0-4  -> Descartado
                     5   -> En suspenso
                     6   -> Aceptable
                    7,8  -> Notable
                    9,10 -> Sobresaliente
                    """;
        
        System.out.println(menu);
        
        System.out.println("Ingrese su puntuacion");
        puntuacion=lector.nextInt();
        
        switch (puntuacion) {
            case 1,2,3,4:
                System.out.println("Descripcion: Descartado");
                break;
                
            case 5:
                System.out.println("Descripcion: En suspenso");
                break;
            
            case 6:
                System.out.println("Descripcion: Aceptable");
                break;
                
            case 7,8:
                System.out.println("Descripcion: Notable");
                break;
                
            case 9,10:
                System.out.println("Descripcion: Sobresaliente");
                break;
                
            default: System.out.println("Ingrese una puntuacion 0-10");
            
        }
        
    }
}
