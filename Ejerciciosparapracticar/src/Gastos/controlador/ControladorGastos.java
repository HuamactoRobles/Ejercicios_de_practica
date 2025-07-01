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
public class ControladorGastos {
    private final int FACTOR_CREIMIENTO = 2;
    private int contador=0;
    private Gastos[] gastos = new Gastos[10];
    
    public void agregarGasto(Gastos gasto){
        if (contador < gastos.length){
            gastos[contador] = gasto;
            contador++;
        } else {
            Gastos[] nuevoGastos = new Gastos[gastos.length * FACTOR_CREIMIENTO];
            System.arraycopy(gastos, 0, nuevoGastos, 0, gastos.length);
            nuevoGastos[contador] = gasto;
            gastos = nuevoGastos;
            contador++;
        }
    }

    /**
     * @return the gastos
     */
    public Gastos[] getGastos() {
        Gastos[] gastosActuales = new Gastos[contador];
        System.arraycopy(gastos, 0, gastosActuales, 0, contador);
        return gastosActuales;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }
    
    
}

