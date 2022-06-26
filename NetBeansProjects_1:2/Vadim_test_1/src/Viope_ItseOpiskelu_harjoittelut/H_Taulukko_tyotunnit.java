/**
* Tee ohjelma, joka laskee tietyn ajanjakson 
* aikana tehtyjen työtuntien määrän sekä tulostaa 
* tuntien yhteismäärän, keskimääräisen työpäivän 
* pituuden ja syötetyt tunnit eriteltynä. 
* Ohjelman tulee aluksi kysyä, kuinka monen 
* työpäivän tiedot syötetään (max. 30 päivää). 
* Tämän jälkeen ohjelma kysyy päivittäiset työtunnit.
* 
 */
package Viope_ItseOpiskelu_harjoittelut;

/**
 *
 * @author vadimzubchenko
 */
import java.io.*;

public class H_Taulukko_tyotunnit {

    public static void main(String[] args) {
        // esitellään muuttujat;
        int paivat = 0; // pakko laittaa, jos se ei tule alustettu ohjelman sisällä
        double summa = 0, tunnit, keskim;
        //sama kuin 'double taulukko[]';   
        double[] taulukko;// = new double[30]; muuten voidankin esitellä alusta heti 30 päivää ja"
                       //ei vältämättä täyttää sen loppuun"

        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Kuinka monta päivää:");
            paivat = Integer.parseInt(lukija.readLine());
            // esitellään taulukko ja alustetaan se for-rakentella
            taulukko = new double[paivat];
            for (int i = 1; i <= paivat; i++) {
                System.out.print("Anna " + i + ". päivän työtunnit:");
                tunnit = Double.parseDouble(lukija.readLine());
                // alustetaan taulukko ja tulostetaan sen alkion sisältö
                taulukko[i-1] = tunnit;// i-1 koska taulukkoon varattu vain 5(0,1,2,3,4) alkioita, mutta i alkaa '1'-sta eikä '0'-sta

                // lasketaan samalla joka kierroksessa työtuntien summa
                summa += tunnit;
            }
            System.out.println("\nTehdyt työtunnit yhteensä: " + summa);
        // tarkistetaan huvin vouksi onko index '0' tyhjaa? =)))
        System.out.println("taulukko[0]: " + taulukko[0]);
        // lasketaan keskimääräinen työpäivien pituus
        keskim = summa / paivat;
        System.out.println("Keskimääräinen työpäivän pituus: " + keskim);
        // tulostetaan kaikki syötetyt tunnit
        System.out.print("Syötetyt tunnit : ");
        for (int i = 1; i <= paivat; i++) {
            /*
            * // i-1 koska tauluun varattu vain 5(0,1,2,3,4) alkioita 
            * mutta i alkaa '1'-sta eikä '0'-sta. Vaikka tässä kohdassa voisikin aloittaa '0'-sta
            */
            System.out.print(taulukko[i-1] + " ");
        }

        } catch (Exception e) {

            System.out.print("Annettu syöte oli virhellinen " + e);

        }
        
        // näin lopussa systemin ilmoitus tulee seuraavalla rivillä
        System.out.print("\n\n");
    }
}
