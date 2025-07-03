/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celular.modelo;

/**
 *
 * @author USER
 */
public class Celular {
    
    //marca modelo almacenamiento precio
    private String marca;
    private String modelo;
    private double almacenamiento;
    private double precio;
    
    public Celular(String marca, String modelo, double almacenamiento, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the almacenamiento
     */
    public double getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * @param almacenamiento the almacenamiento to set
     */
    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        
        return String.format("%-15s %-15s %-4.2f %-5.2f", marca, modelo, almacenamiento, precio);
    }
    
}
