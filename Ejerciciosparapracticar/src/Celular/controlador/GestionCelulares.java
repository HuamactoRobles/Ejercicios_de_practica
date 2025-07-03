/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celular.controlador;

import Celular.modelo.Celular;

/**
 *
 * @author USER
 */
public class GestionCelulares {
    private Celular[] celulares;
    private int contador;
    private static final int FACTOR = 2;
    
    public GestionCelulares(){
        this.celulares = new Celular[FACTOR];
        this.contador = 0;
    }
    
    public void agregarCelular(Celular celular){
        if (contador < celulares.length){
            celulares[contador] = celular;
            contador++;
        } else {
            Celular[] nuevoArreglo = new Celular[FACTOR*celulares.length];
            System.arraycopy(celulares,0,nuevoArreglo,0,celulares.length);
            celulares = nuevoArreglo;
            celulares[contador] = celular;
            contador++;
        }
    }
    
    public Celular[] getCelulares() {
        Celular[] nuevoArreglo=new Celular[contador];
        System.arraycopy(celulares, 0, nuevoArreglo, 0, contador);
        return nuevoArreglo;
    }
    
    public static String imprimir(Celular[] celulares) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%-10s -10s -10s -10s", "Marca", "Modelo", "Almaenamiento", "Precio"));
        sb.append("=".repeat(20)).append("\n");
        for (Celular celular : celulares){
            sb.append(celular.toString()).append("\n");
        }
        sb.append("=".repeat(20)).append("\n");
        
        return sb.toString();
    }
    
}
