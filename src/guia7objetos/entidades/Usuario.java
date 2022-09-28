/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7objetos.entidades;

import java.util.Date;



/**
 *
 * @author A288808
 */
public class Usuario {
    
    public String nombre;
    public String apellido;
    public String pais;
    public int dni;
    public Date nacimiento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPais() {
        return pais;
    }

    public int getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

//    @Override
//    public String toString() {
//        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais + ", dni=" + dni + ", nacimiento=" + nacimiento + '}';
//    }

   
    
   
    
    
     
}
