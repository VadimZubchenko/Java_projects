/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_3_MVC;

/**
 *
 * @author vadimzubchenko
 */
class Model {
    private double balance;
    
        Model(double d) {
            this.balance = d;
    }

    public double getBalance() {
        return balance;
    }

    boolean withdraw(double summa) {
        if (summa <= balance) {
            balance -= summa;
            return true;
        } else {
            return false;
        }
    }

    void add(double summa) {
        balance += summa;
    }
    
}
