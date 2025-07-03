/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celular.vista;

import Celular.controlador.GestionCelulares;
import Celular.modelo.Celular;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class VistaCelular {
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static void mostrarMenu() {
        System.out.println("1. Agregar celular");
        System.out.println("2. Listar celulares");
        System.out.println("3. Salir");
    }
    
    public static void ejecutarMenu() {
        GestionCelulares gc = new GestionCelulares();
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    lector.nextLine();
                    System.out.println("Ingrese la marca");
                    String marca = lector.nextLine();
                    System.out.println("Ingrese el modelo");
                    String modelo = lector.nextLine();
                    System.out.println("Ingrese el almacenamiento (GB)");
                    double almacenamiento = lector.nextDouble();
                    System.out.println("Ingrese el precio");
                    double precio = lector.nextDouble();

                    Celular celular = new Celular(marca, modelo, almacenamiento, precio);
                    gc.agregarCelular(celular);
                    
                    break;
                case 2:
                    // Lógica para listar celulares
                    System.out.println(GestionCelulares.imprimir(gc.getCelulares()));
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 3);

    }
}
