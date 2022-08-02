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
public class Kissa extends Elain{
    
    String rotu;

    public Kissa(String paikka, String nimi, int ika, String rotu) {
        super(paikka, nimi, ika);
        this.rotu = rotu;
    }

    public void setRotu(String rotu) {
        this.rotu = rotu;
    }
    public void Miau(){
        System.out.println("\n"+ this.nimi + ": Miau, miau, miau!");
    }
    public void Tulosta(){
        System.out.println("Minun nimini on: "+ this.nimi);
        System.out.println("Olen täällä: "+ this.paikka);
        System.out.println("Ikäni on: "+ this.ika + " vuotta.");
        System.out.println("Rodultani olen : "+ this.rotu + "\n");
    }
}
