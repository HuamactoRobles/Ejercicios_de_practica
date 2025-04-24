
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class marcaCelular {
    public static void main(String[] args) {
        
        String marcadeCelular;
        int plazo;
        double montoFinal,plan = 0,descuento=0;
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingrese la marca del celular");
        marcadeCelular=lector.nextLine().toUpperCase();
        
        System.out.println("Ingrese plazo: 6, 12 o 18");
        plazo=lector.nextInt();
        
        switch (marcadeCelular) {
            case ("MOTOROLA"):
                plan=29.90;
                System.out.println("El precio del plan es de: "+plan);
                break;
                
            case ("LG"):
                plan=36.00;
                System.out.println("El precio del plan es de: "+plan);
                break;
                
            case ("SAMSUNG"):
                plan=46.80;
                System.out.println("El precio del plan es de: "+plan);
                break;
                
            case ("HUAWEI"):
                plan=62.00;
                System.out.println("El precio del plan es de: "+plan);
                break;
                
            case ("IPHONE"):
                plan=71.00;
                System.out.println("El precio del plan es de: "+plan);
                break;
                
            default: System.out.println("Ingrese una marca valida. ERROR");
        }
        
        switch (plazo){
            
            case 6:
                descuento=0.132;
                System.out.println("El descuento para este plazo es del 13.2%");
                break;
                
            case 12:
                descuento=0.12;
                System.out.println("El descuento para este plazo es del 12.0%");
                break;
                
            case 18:
                descuento=0.112;
                System.out.println("El descuento para este plazo es del 11.2%");
                
            default: System.out.println("Ingrese un plazo valido. ERROR");
        }
        
        montoFinal=plan-(plan*descuento);
        
        System.out.println("El monto final a pagar es: "+montoFinal);
        
    }
}
