/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import guia7objetos.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class CircunferenciaService {
    
   Scanner leer = new Scanner(System.in);

    
    public void SetearRadio(Circunferencia Radio){
        
        
        
        System.out.println("Ingrese el tamaño del radio de la circunferencia");
        
        Radio.setRadio(leer.nextDouble());
        
               
    } 
    
    public void creararea(Circunferencia Area){

                        
        Area.setArea(Math.PI*Math.pow(Area.getRadio(), 2));
        
        
                        
    }
    public void crearperimetro(Circunferencia Perimetro){
        
               
        Perimetro.setPerimetro(2 * Math.PI*Perimetro.getRadio());
                
       
                        
    }
    
    
}
