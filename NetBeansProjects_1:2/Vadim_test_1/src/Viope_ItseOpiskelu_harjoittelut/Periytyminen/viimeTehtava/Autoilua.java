/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viope_ItseOpiskelu_harjoittelut.Periytyminen.viimeTehtava;

import java.io.*;

/**
 *
 * @author vadimzubchenko
 */
public class Autoilua {

    public static void main(String[] args) {
        BufferedReader lukjia = new BufferedReader(new InputStreamReader(System.in));
        int paino, nopeus, km;
        String merkki, malli, rekkari;

        try {
            System.out.print("Anna auton merkki:");
            merkki = lukjia.readLine();
            System.out.print("Anna auton malli:");
            malli = lukjia.readLine();
            System.out.print("Anna auton rekisteri:");
            rekkari = lukjia.readLine();
            System.out.print("Anno auton paino:");
            paino = Integer.parseInt(lukjia.readLine());
            System.out.print("Anno auton nopeus:");
            nopeus = Integer.parseInt(lukjia.readLine());
            System.out.print("Anno autolla ajettu kilometrit:");
            km = Integer.parseInt(lukjia.readLine());
            System.out.println("\n");
            // luodaan luokan Auto olio autoZ tarvittavilla luokalle argumenteilla
            Auto autoX = new Auto(paino, nopeus, km, merkki, malli, rekkari, false);
            // auton tila ennen moottorin käynnistämistä
            autoX.katsasta();
            autoX.kaynnista();
            autoX.aja(95);
            System.out.println("\n\n");
            // auton tila moottorin käynnistämisen ja ajamisen jälkeen 
            autoX.katsasta();
            // sammutetaan moottori
            autoX.sammuta();
            
            System.out.println("\n\n");
            autoX.katsasta();
        } catch (Exception e) {
            System.out.println("Virhetilanne!");
        }
    }
}
