/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_4_JO_version;

/**
 *
 * @author vadimzubchenko
 */
class Model {
    private double saldo;

    public Model(double i) {
        this.saldo = i; 
    }

    double saldo() {
        return saldo;
    }

    boolean nosta(double summa) {
        if (saldo >= summa) {
            this.saldo -= summa;
            return true;
        } else {
            return false;
        }
    }

    void lisaa(double summa) {
        saldo += summa;
    }
    
}
