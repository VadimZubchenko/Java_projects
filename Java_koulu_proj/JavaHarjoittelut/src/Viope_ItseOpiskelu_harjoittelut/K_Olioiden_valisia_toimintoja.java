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
import java.io.*;

public class K_Olioiden_valisia_toimintoja {

    public static void main(String args[]) {
        Tulostaja olio = new Tulostaja();
        /* kutsutaan olion metodia Tulosta(), joka omansa 
           vuoronsa kutsuu laskurin metodia 'Summa()'*/
        olio.Tulosta();
    }
}

class Tulostaja {

    int luku_1, luku_2, summa;
    Laskin laskuri;
    
    public void Tulosta() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Syötä ensimmäinen kokonaisluku: ");
            luku_1 = Integer.parseInt(in.readLine());

            System.out.print("Syötä toinen kokonaisluku: ");
            luku_2 = Integer.parseInt(in.readLine());
            // luodaan luokan Laskin olion 'laskuri'
            laskuri = new Laskin();

            summa = laskuri.Summa(luku_1, luku_2);
            System.out.println("Lukujen summa: " + summa);

        } catch (Exception e) {
            System.out.println("virhe");
            System.exit(0);
        }
    }
}

class Laskin {

    static int Summa(int eka, int toka) {
        int summa = eka + toka;
        return summa;
    }
}
