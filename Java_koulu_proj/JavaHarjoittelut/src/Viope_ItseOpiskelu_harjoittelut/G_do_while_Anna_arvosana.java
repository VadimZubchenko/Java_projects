package Viope_ItseOpiskelu_harjoittelut;

/**
 *
 * @author vadimzubchenko
 * 
 * Tee ohjelma, joka kysyy oppilaiden koearvosanoja 
 * (kokonaisluvut 4-10 käytössä) ja laskee syötettyjen arvosanojen
 * keskiarvon. Ohjelman tulee ottaa vastaan arvosanoja, 
 * kunnes arvosanojen syöttö lopetetaan negatiivisella kokonaisluvulla. 
 * Lopuksi ohjelma tulostaa arvosanojen lukumäärän sekä 
 * lasketun keskiarvon. Vain luvut 4-10 huomioidaan keskiarvoon. 
 * Jos käyttäjä antaa jonkin muun luvun, kysytään uusi luku.
 */
import java.io.*;

public class G_do_while_Anna_arvosana {

    public static void main(String[] args) {

        int arvosana = 0, summa = 0, i = 0;
        double keskiarvo;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.\n"
                + "Lopetus negatiivisella kokonaisluvulla.");

        try {
            do {
                System.out.print("Anna arvosana(4-10):");
                arvosana = Integer.parseInt(in.readLine());

                if (arvosana >= 4 && arvosana <= 10) {
                    summa = summa + arvosana;
                    i++;
                }

            } while (arvosana > 0);

        } catch (Exception e) {

            System.out.println("Virhetilanne!");
        }

        System.out.println("Ohjelmaan syötetty " + i + " arvosanaa.");
        keskiarvo = (double)summa / i;

        System.out.println("Arvosanojen keskiarvo: " + keskiarvo);

    }
    
}
