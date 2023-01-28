/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template_method;

/**
 *
 * @author vadimzubchenko
 */
public abstract class Game {
    protected int playersCount;

    abstract void initializeGame();

    abstract void makePlay(int player);

    abstract boolean endOfGame();

    abstract void printWinner();

    /*
     * A template method :
     * "final" metodi ei pereydy aliloukkiin
     */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while (!endOfGame()) {
            makePlay(j);

            j = (j + 1) % playersCount; // % - jakaa ja pyöristää kokonaisluvuksi

        }
        printWinner();
    }

}
