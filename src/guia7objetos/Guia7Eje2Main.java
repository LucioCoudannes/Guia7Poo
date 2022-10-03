/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7objetos;

import Servicios.CircunferenciaService;
import guia7objetos.entidades.Circunferencia;

/**
 *
 * @author A288808
 */
public class Guia7Eje2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaService cs = new CircunferenciaService();
        
        Circunferencia Circulo1 = new Circunferencia();
        
        Circunferencia Circulo2 = new Circunferencia();
        
        cs.SetearRadio(Circulo1);
        cs.SetearRadio(Circulo2);
        
        cs.creararea(Circulo1);
        cs.creararea(Circulo2);
        
        cs.crearperimetro(Circulo1);
        cs.crearperimetro(Circulo2);
        
        System.out.println(Circulo1.getRadio() + " " + Circulo1.getArea() + " " + Circulo1.getPerimetro());
        System.out.println("");
        System.out.println("");
        System.out.println(Circulo2.getRadio() + " " + Circulo2.getArea() + " " + Circulo2.getPerimetro());
        
        
        
        
        
        
        
        
        
    }
    
}
