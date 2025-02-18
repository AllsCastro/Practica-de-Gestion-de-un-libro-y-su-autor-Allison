/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.de.un.libro.y.su.autor;
import javax.swing.JOptionPane;

/**
 *
 * @author allis
 */
public class GestionDeUnLibroYSuAutor {
public static void main(String[] args) {
        // datos del autor
        
        String nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor:");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del autor :");
        String emailAutor = JOptionPane.showInputDialog("Ingrese el email del autor:");

        // objeto Autor
        Autor autor = new Autor(nombreAutor, fechaNacimiento, emailAutor);

        // datos del libro
        String tituloLibro = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String generoLibro = JOptionPane.showInputDialog("Ingrese el género del libro:");
        int anioPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del libro:"));

       
        libro libro = new libro(tituloLibro, generoLibro, anioPublicacion, autor);

        // información del libro y el autor
        libro.mostrarInfo();
   
}
}