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
public class Boss_stuff extends Kaappi {

    public static int counter = 0;
    // luodaan private muuttaja, joka sisältää Boss_stuff tyyppisen tuleva objekti
    static private volatile Boss_stuff instance = null;

    // private konstruktori, jolla luodaan luokan ilmentymän, mutta sitä ei voi käyttää luokan ulkopuolella
    private Boss_stuff() {
       // lasketaan ilmentymien luomisen määrän
        counter++;
    }

    //public metodi, jolla voi luoda luokan ainoa ilmentymä(objekti) luokan ulkopuolelta
    public static Boss_stuff getInstance() {

        // tarkistetaan oliko luokan ilmentymä jo luotu vai ei 
        if (instance == null) {
            // synchronisoidaan jos tänne pääsee enemmän kuin yksi ilmentymät
            synchronized (Boss_stuff.class) {
                if (instance == null) {
                    // luodaan luokan ilmentymä;
                    instance = new Boss_stuff();
                }
            }

        }

        return instance;
    }

    @Override
    public Jeens createJeens() {
        return new JeensB();
    }

    @Override
    public Cup createCup() {
        return new CupB();
    }

    @Override
    public Snickers createSnickers() {
        return new SnickersB();
    }

    @Override
    public Tshot createTshot() {
        return new TshotB();
    }

}
