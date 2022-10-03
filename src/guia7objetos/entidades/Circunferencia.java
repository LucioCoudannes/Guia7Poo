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
public class Circunferencia {
    
    private double Radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double area, double perimetro, double Radio) {
        this.area = area;
        this.perimetro = perimetro;
        this.Radio = Radio;
    }
    
    

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

      
    
    
    
}
