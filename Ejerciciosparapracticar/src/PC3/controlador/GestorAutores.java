/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC3.controlador;

import PC3.modelo.Autor;
import PC3.modelo.Publicacion;
/**
 *
 * @author USER
 */
public class GestorAutores {
    private Autor[] autores;
    private static final int CANTIDAD_MAXIMA_AUTORES = 10;
    private int contadorAutores;

    public GestorAutores() {
        this.autores = new Autor[CANTIDAD_MAXIMA_AUTORES];
        this.contadorAutores = 0;
    }

    // Método para crear autor
    public Autor crearAutor(String filiacion, String lineaInvestigacion,
            String nacionalidad, String nombre, Publicacion[] publicaciones) {
        if (contadorAutores >= CANTIDAD_MAXIMA_AUTORES) {
            System.out.println("No hay espacio para más autores.");
            return null;
        }
        Autor nuevoAutor = new Autor(filiacion, lineaInvestigacion, nacionalidad, nombre);
        nuevoAutor.setPublicaciones(publicaciones);
        autores[contadorAutores++] = nuevoAutor;
        return nuevoAutor;
    }

    // Método para imprimir autores
    public void imprimirAutores() {
        if (contadorAutores == 0) {
            System.out.println("No hay autores registrados.");
            return;
        }
        for (int i = 0; i < contadorAutores; i++) {
            System.out.println(autores[i].toString());
            System.out.println("----------------------");
        }
    }
}
