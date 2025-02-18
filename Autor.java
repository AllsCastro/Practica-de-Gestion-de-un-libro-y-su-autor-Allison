/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.un.libro.y.su.autor;

/**
 *
 * @author allis
 */
public class Autor {
    String nombreCompleto;
    String fechaNacimiento;
    String email;

 
    Autor(String nombreCompleto, String fechaNacimiento, String email) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    //  obtener información del autor
    String obtenerInfo() {
        return "Autor: " + nombreCompleto + "\n" +
               "Fecha de nacimiento: " + fechaNacimiento + "\n" +
               "Email: " + email;
    }
}

