/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author vadimzubchenko
 */
public class Vahtimestari extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Maito();
    }

    @Override
    public Ruoka createRuoka() {
        return new Voileipa();
    }

    @Override
    public Tuote luodaanUusi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
