/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viope_ItseOpiskelu_harjoittelut;

/**
 *
 * @author vadimzubchenko
 */
public class A_Muuttujat_operaattorit {
    public static void main(String[] args) {
         // mitä eroa muuttujen tietotyyppeistä, esim byte = max100, short=max10 000,
        // int as a long =1000 000 000
        byte pieni_kokonaisluku = 100;
        short pieni_kokonaisluku2 = 10000;
        int pieni_kokonaisluku3  = 1000000000;
        long pieni_kokonaisluku4 = 1000000000;
        // desimaaliluvut max
        float desimaaliluku = 999999999;
        float desimaaliluku2 = 222222266;
        float jako = desimaaliluku / desimaaliluku2;// has max 7 numbers after desimal
        double jako2 = desimaaliluku / desimaaliluku2;// has max 15 numbers after desimal
        float tulos = desimaaliluku * jako;
        double tulos2 = desimaaliluku * jako;
        double pitka_desimaaliluku = 1000e305;
        
        System.out.println("float: "+ desimaaliluku+ "\n"
                            +"double: " +pitka_desimaaliluku+ "\n"
                            +"jako float: "+jako+"\n"
                            +"jako double: "+jako2+"\n"
                            +"tulos float: "+tulos+"\n"
                            +"tulos2 dble: "+tulos2+"\n");
        
        /* Operaattorin sijoittamisella on merkityksensä,
        jota havainnollistetaan seuraavassa: */
        
        int luku5 = 10;
        int luku6 = luku5++;
        // ja nyt ++ on edessä
        
        int luku7 = 10;
        int luku8 = ++luku7;
        
        System.out.println("Tässä ++ on lukun jälkeen\n"
                            +"luku5:"+luku5+ " luku6: "+luku6+"\n\n"
                            +"Ja nyt ++ on sen edessä\n"
                            +"luku7:"+luku7+ " luku8: "+luku8);
        
        int jaettava = 16, jakaja = 5, jakojaannos;
        jakojaannos = jaettava % jakaja;
        
        System.out.println("jakojaannos: "+jakojaannos);
    }
}
