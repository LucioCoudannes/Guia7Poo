/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7objetos.entidades;

/**
 *
 * @author A288808
 */
public class Libro {
    
    /*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
    
    
    */
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int NumPag;

    // alt + insert crear constructor
    public Libro(String ISBN, String titulo, String autor, int NumPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NumPag = NumPag;
    }

    public Libro() {
    }

   

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

   
   
   
    
    
      
    
    
    
    
    
    
    
}
