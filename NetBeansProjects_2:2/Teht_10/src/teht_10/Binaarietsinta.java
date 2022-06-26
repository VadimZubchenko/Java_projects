/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_10;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vadimzubchenko
 */
public class Binaarietsinta {
    
    public static void main(String[] args) {
        
    }

    ArrayList<Integer> taulukko;
    int taulukko_koko;
    
    public Binaarietsinta() {
        taulukko = new ArrayList();
        taulukko_koko = 0;
    }
    
    //Lisäys operaatio
    public void insert(int arvo) {
        taulukko.add(arvo);
        taulukko_koko++;
        //Järjestä taulukko
        Collections.sort(taulukko);
    }
    
    public boolean searchMiddle(int T) {
        //Vasen on taulukon ensimmäinen arvo
        int L = 0;
        //Oikea on taulukon viimeinen arvo
        int R = taulukko_koko - 1;
        //Looppaa niin kauan että vasen ja oikea eivät ole samoja
        while (L <= R) {
            //Tarkista vasemman ja oikean välinen positio
            int m = (L + R) / 2;
            System.out.println(m);
            //Onko keskikohdan arvo pienempi kuin haluttu arvo
            if (taulukko.get(m) < T) {
                //Etsi oikealta
                L = m + 1;
            //Onko keskikohdan arvo suurempi kuin haluttu arvo
            } else if (taulukko.get(m) > T) {
                //Etsi vasemmalta
                R = m - 1;
            } else {
                //Arvo löytyi
                return true;
            }
        }
        //Loopista poistuttiin koska arvoa ei löytynyt
        return false;
    }
    
    public void print() {
        System.out.println(taulukko);
    }

}

    

