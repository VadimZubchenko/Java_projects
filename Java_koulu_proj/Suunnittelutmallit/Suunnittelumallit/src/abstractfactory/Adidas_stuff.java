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
public class Adidas_stuff extends Kaappi{

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
