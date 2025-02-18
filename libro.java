/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.un.libro.y.su.autor;

import javax.swing.JOptionPane;

/**
 *
 * @author allis
 */
public class libro {
String titulo;
String genero;
int anioPublicacion;
String autor;

 
    libro(String titulo, String genero, int anioPublicacion, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    //  información del libro y del autor
    void mostrarInfo() {
        String info = "Título: " + titulo + "\n" +
                      "Género: " + genero + "\n" +
                      "Año de publicación: " + anioPublicacion + "\n" +
                      "----------------------------\n" +
                      autor.obtenerInfo();

    }
    
}
