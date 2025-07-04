/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto.controlador;

import Producto.modelo.Producto;
/**
 *
 * @author USER
 */
public class GestionProductos {
    private Producto[] productos;
    private int contador;
    private static final int FACTOR = 2;
    
    public GestionProductos(){
        this.contador = 0;
        this.productos = new Producto[FACTOR];
    }
    
    public void agregarProductos(Producto producto){
        if (contador < productos.length){
            productos[contador] = producto;
            contador++;
        } else {
            Producto[] nuevoArreglo = new Producto[FACTOR * productos.length];
            System.arraycopy(productos, 0, nuevoArreglo, 0, productos.length);
            productos = nuevoArreglo;
            productos[contador] = producto;
            contador++;
        }
    }
    
    public Producto[] getProductos(){
        Producto[] nuevoArreglo = new Producto[contador];
        System.arraycopy(productos, 0, nuevoArreglo, 0, contador);
        return nuevoArreglo;
    }
    
    public static String imprimir(Producto[] productos){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-10s\n", "Nombre", "Precio"));
        sb.append("=".repeat(30)).append("\n");
        for (Producto producto : productos){
            sb.append(producto.toString());
        }
        sb.append("=".repeat(30)).append("\n");
        
        return sb.toString();
    }
}
