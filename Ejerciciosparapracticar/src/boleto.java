
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class boleto {
    public static void main(String[] args) {
        
        String nombre,producto;
        int cantidad;
        double precio,preciototal,descuento=0,pagototal=0;
        Scanner lector=new Scanner (System.in);
        
        System.out.println("Ingrese su nombre");
        nombre=lector.nextLine();
        
        System.out.println("Ingrese el nombre del producto");
        producto=lector.nextLine();
        
        System.out.println("Ingrese el precio");
        precio=lector.nextDouble();
        
        System.out.println("Ingrese la cantidad");
        cantidad=lector.nextInt();
        
        if (nombre.equals("Ana") || nombre.equals("Juan")) {
            descuento=0.05;
        } else {
            descuento=0;
        }
        
        if (producto.contains("GAMER")) {
            descuento+=0.02; //descuento adicional
        }
        
        
        pagototal=(cantidad*precio)-((cantidad*precio)*descuento);
        
        String nombretienda="Tienda ABC";
        String ubi="AV. SAENZ PENA 376";
        String compras="COMPRAS";
        String departamento="Chiclayo";
        
        System.out.println("##########################");
        System.out.println(String.format("%19s",nombretienda));
        System.out.println("ID: 0000252145");
        System.out.println("##########################");
        System.out.println("");
        System.out.println(String.format("%17s",compras));
        System.out.println(String.format("%23s",ubi));
        System.out.println(String.format("%17s",departamento));
        System.out.println("##########################");
        System.out.println("Fecha:24MAR25  Hora: 15:35");
        System.out.println("Vend: Sebas" + "    Cli: "+nombre);
        System.out.println("##########################");
        System.out.printf("%-2d %-15s (%3.2f)%n",cantidad,producto,precio);
        
        //%-2d es para alinearlo a la izquierda reservando 2 espacios para numeros enteros
        //%-15s es para alinearlo a la izquierda reservando 15 espacios para el nombre
        //(%3.2f) 3 es para reservar los espacios y 2 para el espacio de los decimales
        

    }
}
