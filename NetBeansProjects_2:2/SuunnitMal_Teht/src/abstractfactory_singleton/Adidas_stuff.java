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
public class Adidas_stuff extends Kaappi {
    // muuttuja, joka sisältää ilmentymän luomisen määrää
    public static int counter = 0;
    // luodaan muuttaja, joka sisältää Adidas_stuff tyyppisen tuleva objekti
    static private volatile Adidas_stuff instance = null;

    // private konstruktori, jolla luodaan luokan ilmentymän, mutta sitä ei voi käyttää luokan ulkopuolella
    private Adidas_stuff() {
        // lasketaan ilmentymien luomisen määrän
        counter++;
    }

    //public metodi, jolla voi luoda luokan ainoa ilmentymä(objekti) ulkopuolelta
    public static Adidas_stuff getInstance() {
        // tarkistetaan oliko luokan ilmentymä jo luotu vai ei 
        if (instance == null) {
            // synchronisoidaan jos tänne pääsee enemmän kuin yksi ilmentymät
            synchronized (Adidas_stuff.class){
                if (instance == null) {
                    // luodaan luokan ilmentymä;
                    instance = new Adidas_stuff(); 
                }
            }

        }

        return instance;
    }

    @Override
    public Jeens createJeens() {
        return new JeensA();

    }

    @Override
    public Cup createCup() {
        return new CupA();
    }

    @Override
    public Snickers createSnickers() {
        return new SnickersA();
    }

    @Override
    public Tshot createTshot() {
        return new TshotA();
    }

}
