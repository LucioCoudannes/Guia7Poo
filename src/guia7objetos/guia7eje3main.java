/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7objetos;

import Servicios.OperacionService;
import guia7objetos.entidades.Operacion;

/**
 *
 * @author A288808
 */
public class guia7eje3main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionService os = new OperacionService();
        
        Operacion op1 = os.crearOperacion();
        
            
        os.sumar(op1);
        
        os.restar(op1);
        
        os.multiplicar(op1);
        
        os.dividir(op1);
        
        
        
        
        
        
        
        
        
        
        
        
        



    }
    
}
