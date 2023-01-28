package Koira_olio;

/**
 *
 * @author vadimzubchenko
 */
public class KoiraLuokanTesti {
    public static void main(String[] args)
    {
        // luodaan koira parametrittomall konstruktorilla
        Koira eka_koira = new Koira();
    
        //esitettään ja täytetään muuttuija 
        String tokan_nimi = "Rekku";
        String tokan_rotu = "Dalmatialainen";
        int tokan_ika = 7;
        // luodaan koira konstruktorilla kolmella parametrilla
        Koira toka_koira = new Koira(tokan_nimi, tokan_rotu, tokan_ika);
    
        System.out.println("Koirien tiedot alussa:\n");
        System.out.print("Eka_koira  \t");
        eka_koira.tulostaTiedot();
        System.out.print("Toka_koira \t");
        toka_koira.tulostaTiedot();
        
        System.out.println("");
        
        System.out.print("Eka koira sanoo: ");
        // voidaan viittaa suoraan luokan kautta, silla metodi on staattinen
        // muuten vain olion kautta, kuten eka_koira.hauku();
        Koira.hauku();
        
        System.out.println("Annetaan eka_koiralle nimi, rotu ja ika");
        
        eka_koira.asetaNimi("Pluto");
        eka_koira.asetaRotu("Vinttikoira");
        eka_koira.asetaIka(3);
        eka_koira.tulostaTiedot();
        
        System.out.println("\nNyt muutetaan toka_koiran ominaisuudet:");
        
        /* Nyt muutetaan toka_koiran ominaisuudet:"*/
        toka_koira.asetaNimi("Jerry");
        toka_koira.asetaRotu("Saksanpaimenkoira");
        toka_koira.asetaIka(1);
        System.out.print("Toka_koira \t");
        toka_koira.tulostaTiedot();
        System.out.println("\n");
    
        System.out.println("Nyt ekalla koiralla on nimikin:");
        System.out.print("Eka_koira  \t");
        eka_koira.tulostaTiedot();
        
      }
    
}
