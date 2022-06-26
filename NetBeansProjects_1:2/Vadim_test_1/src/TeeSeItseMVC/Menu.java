package TeeSeItseMVC;
//
import java.io.*;

/**
 *
 * @author vadimzubchenko
 */
public class Menu {

    // esiltellään kontrolleri
    private Controller controller;
    private int valinta;
    // luodaan uusi input lukija
    BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
    // luodaan methods;

    protected void naytaMenu() {

        System.out.println("\nValitse toiminto:\n"
                + "1: Katso saldo\n"
                + "2: Nosta rahaa\n"
                + "3: Lisä rahaa\n"
                + "4: Lopeta\n");

        try {
            valinta = Integer.parseInt(lukija.readLine());
            // käytetään switch-rakennetta
            switch (valinta) {
                case 1:
                    naytaSaldo();
                    break;
                case 2:
                    nostaRaha();
                    break;
                case 3:
                    lisaRaha();
                    break;
                case 4:
                    lopeta();
                    break;
                default:
                    naytaMenu();
            }
        } catch (Exception e) {
            System.out.println("Annettu syöte oli virhellinen!");
        }
    }

    // metodi joka ilmoittaa suoritettu toiminnot
    protected void naytaIlmoitus(String viesti) {
        System.out.println(viesti);
    }

    protected void naytaSaldo() {
        double saldo = controller.naytaSaldo();
        System.out.println("Tilillä on " + saldo);
        naytaMenu();
    }

    protected void nostaRaha() {
        System.out.print("Paljonko haluat nosta?");

        try {
            double summa = Double.parseDouble(lukija.readLine());
            controller.nostaRaha(summa);
        } catch (Exception e) {
            System.out.println("Annettu syöte oli virhellinen!");
        }

    }

    protected void lisaRaha() {
        System.out.println("Paljonko laitetaan? :");
        try {
            double summa = Double.parseDouble(lukija.readLine());
            controller.lisaRaha(summa);
        } catch (Exception e) {
            System.out.println("Annettu syöte oli virhellinen!");
        }

    }

    protected void lopeta() {
        controller.lopeta();
    }

    protected void regController(Controller controller) {
        this.controller = controller;
    }

}
