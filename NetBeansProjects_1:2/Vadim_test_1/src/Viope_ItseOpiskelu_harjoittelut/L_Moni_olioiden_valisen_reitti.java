/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viope_ItseOpiskelu_harjoittelut;

/**
 * Huom!!! Että ratkaistaa tämän luokan vastauksen olen käyttätänyt paperia ja kynää
 * Ensin yritä arvata vastauksen ja tarkistaa vastauksen suorittaen.
 * @author vadimzubchenko
 */
public class L_Moni_olioiden_valisen_reitti 
{ 
     public static void main(String args[]){ 
         // Ota huomioon että merkkijonon sisältö aina muuttuu
         // eli se saa sen mitä metodi palauttaa returnilla
         String merkkijono = "Moi vaan kaikille"; 

         LuokkaYksi olio = new LuokkaYksi(); 
         merkkijono = olio.Tulosta(merkkijono); //ensin se tulosta mitä metodissa ja sit merkkijono muuttuu

         Tulosta(merkkijono); 

         merkkijono = olio.olio2.Tulosta("Suoraan LuokkaKaksi. "); 
         Tulosta(merkkijono); 
     } 

     static void Tulosta(String teksti){ 
         System.out.println("Luokasta LuokkaJavaa: " + teksti); 
     } 
} 

class LuokkaYksi 
{ 
     LuokkaKaksi olio2 = new LuokkaKaksi(); 
     String palautus; 

     String Tulosta(String teksti){ 
         palautus = olio2.Tulosta(teksti); 
         return palautus; 
     } 
} 

class LuokkaKaksi 
{ 
     String Tulosta(String teksti){ 
         System.out.println("Luokasta LuokkaKaksi: " + teksti); 
         return "Tulostus onnistui... kuten huomasit"; 
     } 
} 
