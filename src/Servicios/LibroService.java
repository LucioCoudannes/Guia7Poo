/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import guia7objetos.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class LibroService {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {
        
        
        
        Libro NuevoLibro = new Libro();

        System.out.println("Ingrese el ISBN del libro");

        NuevoLibro.setISBN(leer.nextLine());

        System.out.println("Ingrese el Titulo del libro");

        NuevoLibro.setTitulo(leer.nextLine());

        System.out.println("Ingrese el Autor del libro");

        NuevoLibro.setAutor(leer.nextLine());

        System.out.println("Ingrese cantidad de paginas del libro");

        NuevoLibro.setNumPag(leer.nextInt());
        
        return NuevoLibro;

    }
    
    public void mostrarLibro(Libro N){
        
        System.out.println("\nEl titulo del libro es " + N.getTitulo());
                 
        System.out.println("\nEl Autor del Libro es " + N.getAutor());
                
        System.out.println("\nEl ISBN del libro es " + N.getISBN());
                 
        System.out.println("\nEl libro tiene " + N.getNumPag() + " paginas");
        
        
    }

}
