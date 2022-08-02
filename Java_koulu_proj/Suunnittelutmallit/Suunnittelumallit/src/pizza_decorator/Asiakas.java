/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_decorator;

/**
 *
 * @author vadimzubchenko
 */
public class Asiakas {

    public static void printInfo(String nimi, Pizza pizza) {

        double hinta = Math.round(pizza.gethinta() * 1000) / 1000.0;

        System.out.println("Pizza: " + nimi + " hinta: " + hinta + " euroa, täytteet: " + pizza.getTäyte());
    }

    public static void main(String[] args) {

        Pizza cuba78 = new Mozzarella(new Tonikala(new Ananas(new Pizzapohja())));
        printInfo("Cuba78", cuba78);
        System.out.println(" ");

        Pizza milano = new Mozzarella(new Salami(new Sienet(new Ananas(new Pizzapohja()))));
        printInfo("Milano", milano);
        System.out.println(" ");

        Pizza hawaii = new Mozzarella(new Kana(new Kinkku(new Ananas(new Pizzapohja()))));
        printInfo("Hawaii", hawaii);
        System.out.println(" ");
    }

}
