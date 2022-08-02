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

public class E_Switch_lause {

    public static void main(String args[]) {
        String mj = "abba";
        char sex;
        int age = 0;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader lukija = new BufferedReader(input);

        try {
            System.out.print("Oletko mies vai nainen (m/n)?");
            mj = lukija.readLine();
            System.out.print("Anna ikäsi:");
            age = Integer.parseInt(lukija.readLine());
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
        // otetaan vain ensimmäinen merkki merkijonosta
        sex = mj.charAt(0);

        switch (sex) {
            case 'm':
                if (age >= 0 && age <= 55) {
                    System.out.print("Olet mies parhaassa iässä!");
                } else if (age > 55 && age <= 100) {
                    System.out.print("Olet viisas mies!");
                } else {
                    System.out.println("Ohjelmassa tapahtunut virhe!");
                }

                break;
            case 'n':
                if (age >= 0 && age <= 55) {
                    System.out.print("Olet neito kauneimmillaan!");
                } else if (age > 55 && age <= 100) {
                    System.out.print("Olet nuori ikäiseksesi!");
                } else {
                    System.out.println("Ohjelmassa tapahtunut virhe!");
                }

                break;

            default:
                System.out.println("Ohjelmassa tapahtunut virhe!");
        }
        System.out.println("\n\n");

        System.out.println("Toinen switch-lausen esimerkki\n");

        int luku1, luku2, summa, erotus, jakojaannos, tulo, valinta, osamaara;

        System.out.println("Käytössäsi on seuraavat laskutoimitukset: \n"
                + "1: vähennyslasku \n"
                + "2: yhteenlasku\n"
                + "3: kertolasku \n"
                + "4: osamäärä \n"
                + "5: jakojäännös \n");

        try {

            System.out.println("Valitse laskutoimitus:");
            valinta = Integer.parseInt(lukija.readLine());
            System.out.print("Anna eka luku:");
            luku1 = Integer.parseInt(lukija.readLine());
            System.out.println("Anna toka luku:");
            luku2 = Integer.parseInt(lukija.readLine());
            
            //Usean lauseen kokonaisuuden switch() -lauseessa
            switch (valinta) {
                // laitetaan lohkoon sisään muutamat ohjelmalauseet
                case 1: {
                    erotus = luku1 - luku2;
                    System.out.println(luku1 + "-" + luku2 + "=" + erotus);
                    break;
                }
                case 2: {
                    summa = luku1 + luku2;
                    System.out.println(luku1 + "+" + luku2 + "=" + summa);
                    break;
                }
                case 3:
                    tulo = luku1 * luku2;
                    System.out.println(luku1 + "*" + luku2 + "=" + tulo);
                    break;
                case 4: {
                    osamaara = luku1 / luku2;
                    System.out.println(luku1 + "/" + luku2 + "=" + osamaara);
                    break;
                }
                case 5: {
                    jakojaannos = luku1 % luku2;
                    System.out.println(luku1 + "%" + luku2 + "=" + jakojaannos);
                    break;
                }
                default:
                    System.out.println("Paina ensi kerralla lukua 1-5!");
            }

        } catch (Exception e) {

            System.out.print("Syötteesi oli virhellinen");

        }

    }
}


