/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_3_MVC;

/**
 *
 * @author vadimzubchenko This is essential class, which controls all other
 * classes's
 */
public class Controller {

    private View view;
    private Model model;

    public Controller() {

        view = new View();
        model = new Model(500);

        view.regController(this);
        view.showMenu();

    }

    void balance() {
        view.printText("Balance " + Double.toString(model.getBalance()));
        view.showMenu();
    }

    void withdraw(double summa) {
        boolean balanceOk;
        balanceOk = model.withdraw(summa);
        if (balanceOk) {
            view.printText("Your maney is being gone.");
        } else {
            view.printText("You don't have enouth money on the balance.");
        }
        view.showMenu();
    }

    void add(double summa) {
        model.add(summa);
        view.showMenu();
    }

    void finish() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new Controller();
    }

}
