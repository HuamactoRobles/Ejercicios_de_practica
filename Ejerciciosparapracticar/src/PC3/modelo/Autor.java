/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC3.modelo;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Autor {
    private int cantidadPublicaciones;
    private String filiacion;
    private String lineaInvestigacion;
    private String nacionalidad;
    private String nombre;
    private Publicacion[] publicaciones;

    public Autor(String filiacion, String lineaInvestigacion, String nacionalidad, String nombre) {
        this.filiacion = filiacion;
        this.lineaInvestigacion = lineaInvestigacion;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.publicaciones = new Publicacion[5]; 
        this.cantidadPublicaciones = 0;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        if (cantidadPublicaciones < 5) {
            publicaciones[cantidadPublicaciones++] = publicacion;
        } else {
            System.out.println("No se pueden agregar más publicaciones. Límite alcanzado.");
        }
    }

    public int getCantidadPublicaciones() {
        return cantidadPublicaciones;
    }

    public void setCantidadPublicaciones(int cantidadPublicaciones) {
        this.cantidadPublicaciones = cantidadPublicaciones;
    }

    public Publicacion[] getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicacion[] publicaciones) {
        this.publicaciones = publicaciones;
        this.cantidadPublicaciones = publicaciones.length;
    }

    @Override
    public String toString() {
        return "Autor: " + nombre + "\n" +
               "Filiacion: " + filiacion + "\n" +
               "Línea de investigacion: " + lineaInvestigacion + "\n" +
               "Publicaciones: " + Arrays.toString(publicaciones);
    }
}
