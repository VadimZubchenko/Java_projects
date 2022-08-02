/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestYourSelf_MVC;

/**
 *
 * @author vadimzubchenko
 */
public class Controller {

    private View view;
    private Model model;

    public Controller() {
        // luodaan view- and model-luokaat oliot 
        view = new View();
        //laitetaan argumentiksi 500;
        model = new Model(500);

        //rekisteröidään controller view-luokassa 
        view.regController(this);
        view.menu();
    }

    protected void saldo() {
        double summa = model.saldo();
        view.tulostaTeksti("Saldo: " + Double.toString(summa));
        view.menu();
    }

    void nosta(double summa) {
        boolean maksuOk;
        maksuOk = model.nosta(summa);
        if (maksuOk) {
            view.tulostaTeksti("Raha on tulossa.");
        } else {
            view.tulostaTeksti("Saldoa ei ole riittävästi.");
        }
        view.menu();

    }

    void add(double summa) {
        model.add(summa);
        view.tulostaTeksti("Raha on lisätty.");
        view.menu();
    }

    void lopeta() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new Controller();
    }

}
