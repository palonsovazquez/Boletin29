/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Deportiva extends Barco{
    private float CV;

    public Deportiva( String Matricula, Float eslora,float CV) {
        super(Matricula, eslora);
        this.CV = CV;
    }

    @Override
    public float calcularAluguer(Integer dias) {
        return super.calcularAluguer(dias)+ CV*2*dias; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
