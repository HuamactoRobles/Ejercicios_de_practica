/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gastos.vista;

import Gastos.modelo.Gastos;
import Gastos.controlador.ControladorGastos;
import Gastos.controlador.ReporteGastos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class VistaGastos {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void mostrarMenu(){
        System.out.println("===========================");
        System.out.println("      Registro Gastos      ");
        System.out.println("===========================");
        System.out.println("1. Agregar gasto");
        System.out.println("2. Ver reporte de gastos");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion");
    }
    
    public static void menu(){
        ControladorGastos controlador = new ControladorGastos();
        int opcion = 0;
        Scanner lector = new Scanner (System.in);
        
        while (opcion != 3) {
            mostrarMenu();
            try {
                opcion = lector.nextInt();
                switch (opcion) {
                    case 1:
                        agregarGastos(controlador); // Pasa el controlador
                        break;
                    case 2:
                        verReporteGastos(controlador.getGastos());
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                lector.next(); // Limpiar el buffer del scanner
            }
        }
    }
    
    public static void agregarGastos(ControladorGastos controlador) {
        System.out.println("===================================");
        System.out.println("          Agregar Gasto           ");
        System.out.println("===================================");
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la descripción del gasto: ");
        String descripcion = lector.nextLine();

        System.out.print("Ingrese el monto del gasto: ");
        double monto = lector.nextDouble();

        System.out.print("Ingrese la fecha del gasto (dd/mm/yyyy): ");
        String fecha = lector.next();

        int id = controlador.getContador() + 1;
        Gastos gasto = new Gastos(id, descripcion, monto, fecha);
        controlador.agregarGasto(gasto); // Agrega el gasto al controlador

        System.out.println("Gasto agregado correctamente.");
    }
    
    public static void verReporteGastos(Gastos[] gastos) {
        String reporte = ReporteGastos.generarReporte(gastos);
        ReporteGastos.imprimirPantalla(reporte);
    }

}
