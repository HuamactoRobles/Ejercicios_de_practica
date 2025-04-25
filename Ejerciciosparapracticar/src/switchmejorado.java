
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class switchmejorado {
    public static void main(String[] Args){
        
        String dia;
        Scanner lector=new Scanner (System.in);
        
        System.out.println("Ingrese el dia");
        dia=lector.nextLine().toUpperCase();
        
        String mensaje = switch (dia){
            
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> "Dia laboral";
                
            case "SABADO", "DOMINGO" -> "Dia no laboral";
                
            default -> "Ingrese un dia valido";
        };
        System.out.println(mensaje);
    }
}
