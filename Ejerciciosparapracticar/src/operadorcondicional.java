
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class operadorcondicional {
    public static void main(String[] args) {
        
        int edad;
        Scanner lector=new Scanner (System.in);
        
        System.out.println("Ingrese su edad");
        edad=lector.nextInt();
        
        String mensaje = edad>=19 ? "Es mayor de edad" : "Es menor de edad";
        
        System.out.println(mensaje);
        
    }
}
