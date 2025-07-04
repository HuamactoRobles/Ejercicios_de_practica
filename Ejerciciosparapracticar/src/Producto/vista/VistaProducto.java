/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto.vista;

import Producto.modelo.Producto;
import Producto.controlador.GestionProductos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class VistaProducto {
    public static void main(String[] args) {
        ejecutarMenu();
    }
    
    public static void mostrarMenu(){
        System.out.println("1. Agregar producto");
        System.out.println("2. Imprimir");
        System.out.println("3. Salir");
        System.out.println("Ingrese una opcion");
    }
    
    public static void ejecutarMenu(){
        GestionProductos gp = new GestionProductos();
        Scanner lector = new Scanner (System.in);
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = lector.nextInt();
            
            switch (opcion){
                case 1: {
                    lector.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = lector.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double precio = lector.nextDouble();
                    
                    Producto producto = new Producto(nombre, precio);
                    gp.agregarProductos(producto);
                    break;
                }
                
                case 2:{
                    System.out.println(GestionProductos.imprimir(gp.getProductos()));
                    break;
                }
                
                case 3: {
                    System.out.println("Saliendo...");
                    break;
                }
                
                default: {
                    System.out.println("Opcion invalida, intente de nuevo");
                }
            }
        
        
        } while(opcion != 3);
    }
}
