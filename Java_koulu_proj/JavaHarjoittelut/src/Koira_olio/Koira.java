/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koira_olio;

/**
 *
 * @author vadimzubchenko
 */
public class Koira {

    String rotu;
    String nimi;
    int ika;

    //luodaan parametriton konstructori 
    public Koira() {
        nimi = null;
        rotu = null;
        ika = 0;
    }
    // luodann konstruktori kolmella parametrilla
    public Koira(String uusi_nimi, String uusi_rotu, int uusi_ika) {
        nimi = uusi_nimi;
        rotu = uusi_rotu;
        ika = uusi_ika;
    }
    //luodaan luokan staatinen metodi, joten se on saatavilla muille oliolle 
    public static void hauku() {
        System.out.println("Hau hau!!!");
    }

    public void asetaNimi(String uusi_nimi) {
        // kannata lisätä this 
        this.nimi = uusi_nimi;
    }

    public void asetaRotu(String uusi_rotu) {
        rotu = uusi_rotu;
    }

    public void asetaIka(int uusi_ika) {
        this.ika = uusi_ika;
    }

    public void tulostaTiedot() {
        System.out.println("nimi: " + nimi + ", ikä: "
                + "" + ika + ", vuotias " + ", rotu: " + rotu);
    }

}
