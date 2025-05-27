
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class login2 {
    public static void main(String[] args) {
        
        final String usuario_si="admin";
        final String contraseña_si="admin";
        
        String usuario;
        String contraseña;
        
        boolean autenticador=false;
        
        Scanner lector=new Scanner (System.in);
        int intentos=0;
        
        do {
        
            System.out.println("Ingrese el usuario");
            usuario=lector.nextLine();
            
            System.out.println("Ingrese la contraseña");
            contraseña=lector.nextLine();
            
            if (usuario.equals(usuario_si) && contraseña.equals(contraseña_si)){
                
                autenticador=true;
                break;
                
            } else {
                
                intentos++;
                System.out.println("Vuelva a intentar");
                
            }
        
        } while (intentos < 5);
        
        if (autenticador==true){
            
            System.out.println("Bienvenido al sistema");
            
        } else {
            System.out.println("Cuenta bloqueada");
        }
        
    }
}
