
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class impresion_arreglos {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        String[] producto = {"lapiz","lapicero","borrador","corrector"};
        int[] cantidad = {12, 30, 40, 50};
        double[] precio = {1.5, 1, 1.6, 4};
        double totalgeneral=0;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("########################################\n");
        sb.append(String.format("%-12s %12s %12s\n", "Producto", "Cantidad", "Precio"));
        sb.append("########################################\n");

        
        for (int i=0; i<producto.length; i++){
            
            sb.append(String.format("%-10s %11d %14.2f\n", producto[i],cantidad[i],precio[i]));
            double totalProducto=cantidad[i]*precio[i];
            totalgeneral += totalProducto;
            
        }
        
        sb.append("########################################\n");
        sb.append(String.format("Total general: %-10.2f\n",totalgeneral));
        sb.append("########################################\n");
        System.out.println(sb.toString());
        
    }
}
