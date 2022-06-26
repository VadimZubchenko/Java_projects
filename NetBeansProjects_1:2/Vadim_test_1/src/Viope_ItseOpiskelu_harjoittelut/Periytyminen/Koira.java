/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viope_ItseOpiskelu_harjoittelut.Periytyminen;

/**
 *
 * @author vadimzubchenko
 */
public class Koira extends Elain{

    String rotu;

    public Koira(String paikka, String nimi, int ika, String rotu) {
        super(paikka, nimi, ika);
        this.ika = ika;
        this.nimi = nimi;
        this.rotu = rotu;
    }

    public void setRotu(String rotu) {
        this.rotu = rotu;
    }
    
    void hauku(){
          System.out.println(this.nimi + " sanoi sulle Hau Hau!!!");
       }

    public void tulosta() {
        System.out.println(this.nimi + ": Ikä: " + ika + ", Rotu: " + rotu);

    }
}
