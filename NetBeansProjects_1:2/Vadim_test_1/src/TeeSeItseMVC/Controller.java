package TeeSeItseMVC;

/**
 *
 * @author vadimzubchenko
 */
class Controller {

    // esitellään menu ja tili luokat
    private Menu menu;
    private Tili tili;
    private boolean maksuOk;

    // Konstruktori
    public Controller() {

        // luodaan oliot Menu ja Tili, eli muut tarvittavat komponentit 
        tili = new Tili(500);
        menu = new Menu();

        menu.regController(this);// asennetaan this controlleri Menu-oliossa, 
        //se on mahdollistsa vain kontrolleri-olion luomisen jälkeen
        // ks. main-metodiin.
        menu.naytaMenu();// pyydetään näyttöä esittämään aloitusnäyttö

    }

    protected double naytaSaldo() {
        double saldo = tili.naytaSaldo();
        return saldo;
    }

    protected void nostaRaha(double summa) {
        // maksuOk saa vastaus true tai false, riippuen riittäkö rahaa tilillä
        maksuOk = tili.nostaRaha(summa);// true tai false

        if (maksuOk) {
            menu.naytaIlmoitus("Nosto onnistui!");

        } else {
            menu.naytaIlmoitus("Tilillä ei ole riittävästi rahaa!");

        }
        menu.naytaMenu();
    }

    protected void lisaRaha(double summa) {
        tili.lisaRaha(summa);//ei vaati true tai false, kun se aina onnistui, 
        //kun ei riippu tilin rahamäärästä
        menu.naytaIlmoitus("Rahaa on lisätty!");
        menu.naytaMenu();
    }

    protected void lopeta() {
        System.exit(0);
    }

    // Koko sovelluksen käynnistäminen
    public static void main(String[] args) {
        new Controller();// luodaan uusi kontrolleri-olio, joka valmistelee nyt sovelluksen
    }

}
