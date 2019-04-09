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
public abstract class Barco {
    private String Matricula;

    public Barco(String Matricula, Float eslora) {
        this.Matricula = Matricula;
        this.eslora = eslora;
    }
    
    private Float eslora;

   

    public float calcularAluguer(Integer dias) {
        float auxPrecio = (eslora + 10)*dias;

        return auxPrecio;
    }

    
    public String Factura(Integer dias) {
        return "\nBarco:\n" + "Matricula= " + Matricula + "\n eslora= " + eslora + "\n Aluguer= "+ calcularAluguer(dias)+"€\n";
    }

}
