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
public class Boss_stuff extends Kaappi{

    
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
