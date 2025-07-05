/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC3.modelo;

/**
 *
 * @author USER
 */
public class Publicacion {
    private int anio;
    private String nombreRevista;
    private String titulo;

    public Publicacion(int anio, String nombreRevista, String titulo) {
        this.anio = anio;
        this.nombreRevista = nombreRevista;
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Publicacion: " + titulo + " (" + nombreRevista + ", " + anio + ")";
    }
}
