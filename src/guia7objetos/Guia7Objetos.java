/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7objetos;

import Servicios.LibroService;
import guia7objetos.entidades.Libro;
import guia7objetos.entidades.Mascota;
import guia7objetos.entidades.Usuario;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia7Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");

        LibroService ls = new LibroService();
        
        //Solicita datos del libro al usuario
        Libro Libro1 = ls.crearLibro();
        
        //Imprime los datos del libro
        ls.mostrarLibro(Libro1);

    }

}
