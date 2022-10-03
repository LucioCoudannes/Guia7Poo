/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import guia7objetos.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class OperacionService {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {

        Operacion nuevaOperacion = new Operacion();

        System.out.println("Ingrese el primer numero");

        nuevaOperacion.setNumero1(leer.nextFloat());

        System.out.println("Ingrese el segundo numero");

        nuevaOperacion.setNumero2(leer.nextFloat());

        return nuevaOperacion;
    }  

    public void sumar(Operacion S) {

        float resultadoSuma;

        resultadoSuma = S.getNumero1() + S.getNumero2();
        
        System.out.println("El resultado de la suma es " + resultadoSuma);
        System.out.println("");

      
    }

    public void restar(Operacion R) {

        float resultadoResta;

        resultadoResta = R.getNumero1() - R.getNumero2();

         System.out.println("El resultado de la resta es " + resultadoResta);
         System.out.println("");

    }

    public void multiplicar(Operacion M) {

        float resultadoMulti = 0;

        if (M.getNumero1() == 0 || M.getNumero2() == 0) {

            System.out.println("La cuenta da 0");

        } else {
            resultadoMulti = M.getNumero1() * M.getNumero2();
            
             System.out.println("El resultado de multiplicar los dos numeros es " + resultadoMulti);
        }
           
    }

    public void dividir(Operacion D) {

        float resultadoDiv = 0;

        if (D.getNumero1() == 0 || D.getNumero2() == 0) {

            System.out.println("La cuenta da 0");

        } else {
            
            resultadoDiv = D.getNumero1() / D.getNumero2();
            
             System.out.println("El resultado de dividir los dos numeros es " + resultadoDiv);
        }
          
    }
    
    
}
