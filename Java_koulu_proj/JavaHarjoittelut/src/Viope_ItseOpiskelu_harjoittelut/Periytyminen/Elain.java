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

/*
Abstraktista luokasta ei voida muodostaa suoraan olioita, 
vaan oliot muodostetaan perimällä. 
Kyllä, voidaankin laitaa 'public', sitten siitä saa muodostaa
olion
*/
abstract class Elain {

    String paikka, nimi;
    int ika;
    /*
     Protected-määrellä suojatut muuttujat ja metodit näkyvät
     luokalle itselleen ja siitä perityille aliluokille.
     */

    protected Elain(String paikka, String nimi, int ika) {
        this.paikka = paikka;
        this.nimi = nimi;
        this.ika = ika;

    }

    protected void setPaikka(String paikka) {
        this.paikka = paikka;
    }

    protected void setNimi(String nimi) {
        this.nimi = nimi;
    }

    protected void setIka(int ika) {
        this.ika = ika;
    }

    protected void kasvaa() {
        this.ika++;
    }

}
