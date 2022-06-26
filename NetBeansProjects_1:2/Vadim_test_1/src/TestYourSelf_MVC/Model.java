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
class Model {

    private double summa;

    Model(double i) {
        this.summa = i;
    }

    public double saldo() {
        return summa;
    }

    boolean nosta(double summa) {
        if (this.summa >= summa) {
            this.summa -= summa;
            return true;
        } else {
            return false;
        }
    }

    void add(double summa) {
        this.summa += summa;
    }

}
