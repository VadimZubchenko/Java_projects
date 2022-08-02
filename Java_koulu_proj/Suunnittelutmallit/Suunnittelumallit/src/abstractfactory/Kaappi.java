/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vadimzubchenko
 */
public abstract class Kaappi {

    Jeens jeens = null;
    Cup cup = null;
    Snickers snickers = null;
    Tshot tshot = null;

   
    public abstract Jeens createJeens();

    public abstract Cup createCup();

    public abstract Snickers createSnickers();

    public abstract Tshot createTshot();

    public void paallaOn() {
        otaJeens();
        otaCup();
        otaSnickers();
        otaTshot();

    }

    public void otaJeens() {
        if (jeens == null) {
            jeens = createJeens();
        }
        System.out.println("Ihanat " + jeens);
    }

    public void otaCup() {
        if (cup == null) {
            cup = createCup();
        }
        System.out.println("Loistava " + cup + " päällä.");
    }

    public void otaSnickers() {
        if (snickers == null) {
            snickers = createSnickers();
        }
        System.out.println("Mukavat " + snickers + " päällä.");
    }

    public void otaTshot() {
        if (tshot == null) {
            tshot = createTshot();
        }
        System.out.println("Tyylikäs " + tshot + " päällä.");
    }

}
