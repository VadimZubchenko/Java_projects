/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_decorator;

/**
 *
 * @author vadimzubchenko
 */
public abstract class Decorator implements Pizza {
    protected Pizza pizzatäytteineen;

    public Decorator(Pizza pizzatäytteineen) {
        this.pizzatäytteineen = pizzatäytteineen;
    }

    @Override
    public double gethinta() {
        return pizzatäytteineen.gethinta(); //Delegation
    }

    @Override
    public String getTäyte() {
        return pizzatäytteineen.getTäyte(); //Delegation
    }
    
    
}
