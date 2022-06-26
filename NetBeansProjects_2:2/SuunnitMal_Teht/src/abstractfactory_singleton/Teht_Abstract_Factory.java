/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory_singleton;

/**
 *
 * @author vadimzubchenko
 */
public class Teht_Abstract_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        // testataan singleton mallia, montako luokkien ilmentymät luotu. 
        final int SIZE = 1000;

        Thread t[] = new Thread[SIZE];

        //Singleton arr[] = new Singleton[SIZE];
        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R());
            t[i].start();

        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        System.out.println("Adidas ilmentymät: " + Adidas_stuff.counter + " Boss ilmentymät: " + Boss_stuff.counter);
        
        System.out.println("");
        
       
        System.out.println("Opiskeluaikana Jasperilla päällään oli: ");
        // valitaan käytettäväksi tehdas Adidas
        Kaappi opiskelija;
        // käytetään sunnitelumallia sigleton(ainokainen), joka luo loukan ainoan ilmentymän
        opiskelija = Adidas_stuff.getInstance();
        opiskelija.paallaOn();
        System.out.println("");

        // valitaan käytettäväksi tehdas Adidas
        System.out.println("Opiskeluaikana Vadimilla ei ollutkaan: ");
        Kaappi vadim;
        // käytetään sunnitelumallia sigleton(ainokainen), joka luo loukan ainoan ilmentymän
        vadim = Adidas_stuff.getInstance();
        vadim.paallaOn();
        System.out.println("");
        

        // valitaan käytettäväksi tehdas Boss
        System.out.println("Valmistuttuaan insinööriksi Ailillä päällään on: \": ");
        Kaappi aili;
        // käytetään sunnitelumallia sigleton(ainokainen), joka luo loukan ainoan ilmentymän
        aili = Boss_stuff.getInstance();
        aili.paallaOn();
        System.out.println("");

        // valitaan käytettäväksi tehdas Boss
        System.out.println("Valmistuttuaan insinööriksi Jasperilla päällään on: ");
        Kaappi insinööri;
        // käytetään sunnitelumallia sigleton(ainokainen), joka luo loukan ainoan ilmentymän
        insinööri = Boss_stuff.getInstance();
        insinööri.paallaOn();
        System.out.println("");
        // tarkistetaa ovatko oliot samanlaiset,eli ovatko ne saman luokan ilmentymät
        System.out.println(opiskelija == vadim );
        // tarkistetaan onko olioiden sisältö samanalainen
        System.out.println(opiskelija.equals(vadim));
           
        System.out.println("Adidas ilmentymät: " + Adidas_stuff.counter + " Boss ilmentymät: " + Boss_stuff.counter);
        
    }
    
}

class R implements Runnable {

    @Override
    public void run() {
        Adidas_stuff.getInstance();
        Boss_stuff.getInstance();

    }

}
