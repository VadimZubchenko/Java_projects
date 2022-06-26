/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_2_MVC;

/**
 *
 * @author vadimzubchenko
 */
public class Model {
    private double saldo;

    protected Model(double d) {
        this.saldo = d;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    void lisaRaha(double saldo) {
        this.saldo += saldo;
    }

    boolean nostaRaha(double saldo) {
        if (this.saldo >= saldo) {
            this.saldo -= saldo;
            return true;
        } else {
            return false;
        }
    }
    
}
