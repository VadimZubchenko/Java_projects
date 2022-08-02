/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viope_ItseOpiskelu_harjoittelut.Periytyminen;

import Viope_ItseOpiskelu_harjoittelut.Periytyminen.Kissa;

/**
 *
 * @author vadimzubchenko
 */
public class ElainTehdas {
    
    public static void main(String[] args) {
        
        Koira uusiKoira = new Koira("Nadym","Jerry", 1, "Saksanpaimenkoira");
        System.out.print("Koiran tiedot alussa: ");
        uusiKoira.tulosta();
        uusiKoira.hauku();
        System.out.print("\nKoira vuoden päästä:");
        uusiKoira.kasvaa();
        uusiKoira.tulosta();
        System.out.println("\n");
        
        
        
        Kissa kissa = new Kissa("Lattialla", "Mirka", 2, "Siberiankissa");
        
        System.out.println("Kissan tiedot alussa:");
        kissa.Miau();
        kissa.Tulosta();
        
        kissa.setIka(4);
        kissa.setPaikka("Sohvalla");
        kissa.setNimi("Mikki");
        kissa.setRotu("Persialainen");
        
        System.out.println("Kissan tiedot lopussa:");
        kissa.Miau();
        kissa.Tulosta();
        
        System.out.println("Kissa vuoden päästä");
        kissa.kasvaa();
        kissa.Tulosta();
        
    }
    
}
