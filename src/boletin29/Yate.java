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
public class Yate extends Deportiva{
   private Integer camarotes;

    public Yate(  String Matricula, Float eslora,float CV, Integer camarotes) {
        super( Matricula, eslora,CV);
        this.camarotes = camarotes;
    }

    @Override
    public float calcularAluguer(Integer dias) {
        return super.calcularAluguer(dias) + 25*camarotes*dias; //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
