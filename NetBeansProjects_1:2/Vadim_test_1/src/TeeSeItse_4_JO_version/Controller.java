/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_4_JO_version;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

/**
 *
 * @author vadimzubchenko
 */
public class Controller {
    View view;
    Model model; 

    public Controller() {
        
        view = new View();
        model = new Model(500);
        
        view.regController(this);
        view.Menu();
        
    }
    
    public static void main(String[] args) {
        new Controller();
    }

    void loppu() {
        view.tulostaText("Sovellus on suljettu.");
        System.exit(0);
    }

    void saldo() {
        view.tulostaText(Double.toString(model.saldo()));
        view.Menu();
    }

    void nosta(double summa) {
        boolean maksuOk;
        maksuOk = model.nosta(summa);
        if (maksuOk) {
            view.tulostaText("Rahat ovat tulossa.");
        } else {
            view.tulostaText("Saldon määrä on pieinempi.");
        }
        view.Menu();
    }

    void lisaa(double summa) {
        model.lisaa(summa);
        view.tulostaText("Rahat ovat lisätty.");
        view.Menu();
    }
}
