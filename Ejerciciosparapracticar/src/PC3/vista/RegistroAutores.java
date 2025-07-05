/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC3.vista;

import PC3.controlador.GestorAutores;
import PC3.modelo.Autor;
import PC3.modelo.Publicacion;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RegistroAutores {
    public static void main(String[] args) {
        GestorAutores gestor = new GestorAutores();
        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu de Gestion de Autores ---");
            System.out.println("1. Crear autor");
            System.out.println("2. Imprimir lista de autores");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del autor: ");
                    String nombre = lector.nextLine();
                    System.out.print("Filiacion: ");
                    String filiacion = lector.nextLine();
                    System.out.print("Linea de investigacion: ");
                    String linea = lector.nextLine();
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = lector.nextLine();

                    // Crear publicaciones (ejemplo simplificado)
                    Publicacion[] publicaciones = new Publicacion[1];
                    System.out.print("Titulo de la publicacion: ");
                    String titulo = lector.nextLine();
                    System.out.print("Anio de publicacion: ");
                    int anio = lector.nextInt();
                    lector.nextLine();
                    System.out.print("Nombre de la revista: ");
                    String revista = lector.nextLine();
                    publicaciones[0] = new Publicacion(anio, revista, titulo);

                    gestor.crearAutor(filiacion, linea, nacionalidad, nombre, publicaciones);
                    break;

                case 2:
                    gestor.imprimirAutores();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
