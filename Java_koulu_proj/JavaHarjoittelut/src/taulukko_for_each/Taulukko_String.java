/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taulukko_for_each;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vadimzubchenko
 */
public class Taulukko_String {
    static Scanner lukija = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nimi;        // käyttäjän antama nimi
        // esitellään taulukko merkkijonoja varten
        String [] nimet;
        
        // luodaan merkkojonotaulukko, koko = 5.
        nimet = new String [5];
        
        // kysytään käyttäjältä nimet ja 
        //sijoitetaan ne taulukkoon.
        System.out.println("Anna nimi ");
        nimi = lukija.nextLine();
        nimet[0] = nimi;
        
        System.out.println("Anna nimi ");
        nimi = lukija.nextLine();
        nimet[1] = nimi;
        
        // luen loput (paikasta 2 eteenpäin) for-toistolla 
        for (int i = 2; i < nimet.length; i++) {
            
        System.out.println("Anna nimi: ");
            nimi = lukija.nextLine();
            nimet[i] = nimi;
        }
        
        // laijitellaan nimet 
        Arrays.sort(nimet);
        
         // laijetellaan nimet käänteisessä järjestyksessä
         //System.out.println(nimet[4] );
         //System.out.println(nimet [3] );
         
         System.out.println("Tuolostus for-toistolla");
         for (int i = 4; i >= 0; i--) {
             System.out.println(nimet[i]);
            
        }
         
         System.out.println("Tulostetaan for-each rakenteella");
         for (String solunNimi : nimet) {
             System.out.println(solunNimi);
         }

    }
    
    
}
