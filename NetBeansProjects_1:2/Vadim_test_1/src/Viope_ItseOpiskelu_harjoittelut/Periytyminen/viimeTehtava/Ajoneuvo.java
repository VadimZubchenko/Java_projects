package Viope_ItseOpiskelu_harjoittelut.Periytyminen.viimeTehtava;

/**
 *
 * @author vadimzubchenko
 */
import java.io.*;

public class Ajoneuvo {

    private int paino;
    private int huippunopeus;
    private int ajetut_kilometrit;

    // Konstruktori parametreilla

    protected Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit) {
        this.paino = paino;
        this.huippunopeus = huippunopeus;
        this.ajetut_kilometrit = ajetut_kilometrit;
    }

    protected void aja(int ajettava_matka) {
        this.ajetut_kilometrit += ajettava_matka;
    }

    protected int anna_paino() {
        return this.paino;
    }

    protected int anna_huippunopeus() {
        return this.huippunopeus;
    }

    protected int anna_ajetut_kilometrit() {
        return this.ajetut_kilometrit;
    }
}

class Auto extends Ajoneuvo {

    private String merkki, malli, rekNumero;
    private boolean kaynnissa;

    // parametrillinen  Konstruktori, joka sisältää lisää parametreja kun yläluokka

    public Auto(int paino, int huippunopeus, int ajetut_kilometrit,
            String merkki, String malli, String rekNumero, boolean kaynnissa) {
        super(paino, huippunopeus, ajetut_kilometrit);
        this.merkki = merkki;
        this.malli = malli;
        this.rekNumero = rekNumero;
        this.kaynnissa = kaynnissa;
    }

    public void kaynnista() {

        this.kaynnissa = true;

    }

    public void katsasta() {
        // haetaan yläluokan parametrit ainoastaan gettering kautta, kun ne ovat private-suojausmääreillä
        System.out.println("Auton tiedot:\nMerkki: " + this.merkki
                + "\nMalli: " + this.malli
                + "\nAjokilometrit: " + this.anna_ajetut_kilometrit()
                + "\nPaino (kg): " + this.anna_paino()
                + "\nHuippunopeus (km/h): " + this.anna_huippunopeus()
                + "\nRekisterinumero: " + this.rekNumero);

        if (kaynnissa == true) {

            System.out.println("Auto on käynnissä");

        } else {

            System.out.println("Auto ei ole käynnissä");

        }
    }

    public void sammuta() {

        this.kaynnissa = false;
    }

}
