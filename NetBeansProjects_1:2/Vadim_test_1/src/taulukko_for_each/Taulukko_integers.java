/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taulukko_for_each;

/**
 *
 * @author vadimzubchenko
 */
public class Taulukko_integers {
    public static void main(String[] args) {
        
        // esittelen kokonaislukutaulukon
        int [] luvut;
        
        // luodaan taulukko, koko = 3.
        luvut = new int[3];
        
        // sijoitetaan taulukkoon arvot 3, 8 ja 5.
        luvut[0] = 3; 
        luvut[1] = 8;
        luvut[2] = 5; 
        
        // tulostetaan taulukon alkiot yksitellen
        System.out.println("Taulukon alkiot ovat: ");
        System.out.println(luvut[0]);
        System.out.println(luvut[1]);
        System.out.println(luvut[2]);       
        
        System.out.println("Taulukon tulostus for-toistolla");
       
        for (int i = 0; i < luvut.length; i++) {
           System.out.println( luvut[i] ); 
        }
         
            
        } 

}
