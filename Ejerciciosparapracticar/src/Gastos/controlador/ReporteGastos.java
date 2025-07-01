/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gastos.controlador;
import Gastos.modelo.Gastos;
/**
 *
 * @author USER
 */
public class ReporteGastos {
    public static String generarReporte(Gastos[] gastos){
        String reporte;
        StringBuilder sb = new StringBuilder();
        double totalGastos = 0.0;
        
        sb.append(String.format("%-2s %-15s %-10s %-15s\n", "ID", "Descripcion", "Monto", "Fecha"));
        sb.append("---------------------------------------------\n");
        for (Gastos gasto : gastos){
            if(gasto != null){
                sb.append(gasto.toString());
                totalGastos += gasto.getMonto();
            }
        }
        sb.append("---------------------------------------------\n");
        sb.append(String.format("Total Gastos: %.2f\n", totalGastos));
        sb.append("---------------------------------------------\n");
        
        reporte = sb.toString();
        return reporte;
    }
    
    public static void imprimirPantalla(String reporte){
        System.out.println(reporte);
    }
}
