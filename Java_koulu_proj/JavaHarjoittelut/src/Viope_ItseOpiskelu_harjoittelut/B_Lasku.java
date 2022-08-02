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

public class B_Lasku {

    public static void main(String[] args) {
        int luku1, luku2, summa, erotus, jakojaannos, tulo;
        float osamaara;

        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Syötä ensimmäinen kokonaisluku:");
            luku1 = Integer.parseInt(lukija.readLine());
            System.out.println("Syötä toinen kokonaisluku: ");
            luku2 = Integer.parseInt(lukija.readLine());

			// lausekkeet +,-,*,/,%
            summa = luku1 + luku2;
            erotus = luku1 - luku2;
            tulo = luku1 * luku2;
            osamaara = (float) luku1 / luku2;
            jakojaannos = luku1 % luku2;

            System.out.println(luku1 + "+" + luku2 + "=" + summa);
            System.out.println(luku1 + "-" + luku2 + "=" + erotus);
            System.out.println(luku1 + "*" + luku2 + "=" + tulo);
            System.out.println(luku1 + "/" + luku2 + "=" + osamaara);
            System.out.println("Jakojäännös: " + jakojaannos);

        } catch (Exception e) {

            System.out.print("Syötteesi oli virhellinen");

        }

    }
}
