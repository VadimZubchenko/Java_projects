/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_2_MVC;

//import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author vadimzubchenko
 */
public class Controller {

    private Model model;
    private View view;
    private boolean maksuOK;

    protected Controller() {

        model = new Model(500);
        view = new View();
        view.regController(this);
        view.showMenu();

    }
    // saadaan tietoa saldosta model-luokasta ja tulostetaan se lennossa 
    // käyttäjälle. Muutetaan double arvo to String
    protected void saldo() {
        view.showText("Tililla on " + Double.toString(model.getSaldo()));
        view.showMenu();
    }

    protected void talletus(double saldo) {
        model.lisaRaha(saldo);

        view.showText("Raha on lisätty. \n "
                + "Tililla on: "
                + Double.toString(model.getSaldo()));
        view.showMenu();

    }

    protected void otto(double saldo) {

        maksuOK = model.nostaRaha(saldo);
        if (maksuOK) {
            view.showText("Raha on nostettu onnistunesti. \n"
                    + "Tililla on: "
                    + Double.toString(model.getSaldo()));

        } else {
            view.showText("Tililla ei ole riittävästi varaa.");

        }
        view.showMenu();
    }

    protected void lopetus() {
        view.showText("Ohjelma on suljettu.");
        System.exit(0);
    }

    public static void main(String[] args) {
        new Controller();
    }
}
