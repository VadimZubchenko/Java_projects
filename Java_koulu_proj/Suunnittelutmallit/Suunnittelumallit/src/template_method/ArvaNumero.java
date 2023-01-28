/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_method;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vadimzubchenko
 */
public class ArvaNumero extends Game {

    int numero;
    int kortti;
    int count = 1;
    int player1Count;
    int player2Count;
    private Random rand;
    static Scanner lukija = new Scanner(System.in);

    @Override
    void initializeGame() {
        int player1 = 0;
        int player2 = 1;

        rand = new Random();
        System.out.println("Nyt player 1: ");
        makePlay(player1);
        player1Count = count;

        System.out.println("Nyt player 2: ");
        count = 1;
        makePlay(player2);
        player2Count = count;
        endOfGame();
    }

    @Override
    void makePlay(int player) {

        kortti = rand.nextInt(5);
        // System.out.println("Kortti: " + kortti);
        System.out.println("Arva kortin numero: ");
        numero = lukija.nextInt();

        while (numero != kortti) {
            System.out.println("Väärin. Kokeile vielä ");
            System.out.println("Arva viidesta kortista oikea numero: ");
            numero = lukija.nextInt();
            count++;
        }
        System.out.println("Nyt arvasit oikein. Olet kokoeillut: " + count + " kertaa");
    }

    @Override
    boolean endOfGame() {

        return true;

    }

    @Override
    void printWinner() {
        if (player1Count < player2Count) {
            System.out.println("Player 1 voitti");
        } else if (player1Count == player2Count) {
            System.out.println("Tasapeli");
        } else {
            System.out.println("Player 2 voitti");
        }
    }

}
