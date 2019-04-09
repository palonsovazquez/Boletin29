/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco> al_barco = new ArrayList<Barco>();
        al_barco.add(new Velero("1165456",12f, 5));
        al_barco.add(new Deportiva("56165", 10f, 300));
        al_barco.add(new Yate("165156", 15f, 205,3));
        
        
        for(Barco auxBarco : al_barco){
            System.out.println(auxBarco.Factura(2)); // factura para 2 dias
            System.out.println("__________________________________________________");
        
        
        }
        
        
        
    }
    
}
