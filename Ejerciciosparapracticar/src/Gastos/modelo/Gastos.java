/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gastos.modelo;

/**
 *
 * @author USER
 */
public class Gastos {
    private String fecha;
    private double monto;
    private String descripcion;
    private int idGasto;
    
    public Gastos(int idGasto, String descripcion, double monto, String fecha){
        this.idGasto = idGasto;
        this.descripcion = descripcion;
        this.monto = monto;
        this.fecha = fecha;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the idGasto
     */
    public int getIdGasto() {
        return idGasto;
    }

    /**
     * @param idGasto the idGasto to set
     */
    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }
    
    @Override
    public String toString(){
        return String.format("%3d %10s %8.2f %15s\n", idGasto, descripcion, monto, fecha);
    }
}
