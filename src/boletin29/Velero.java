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
public class Velero extends Barco{
    private Integer numMastiles;

    public Velero( String Matricula, Float eslora,Integer numMastiles) {
        super(Matricula, eslora);
        this.numMastiles = numMastiles;
    }

    
   

    @Override
    public float calcularAluguer(Integer dias) {
        return super.calcularAluguer(dias) +(8* numMastiles*dias); //To change body of generated methods, choose Tools | Templates.
    }
   
}
