/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor_state;

import java.util.List;

/**
 *
 * @author vadimzubchenko
 */
public class StateContext{

    private State state = new WarlockState();


    public void fly() {
        System.out.println("Olen " + state.getName());
        System.out.println("Mana: " + state.getMana());
        state.fly(this);
        System.out.println("Mana: " + state.getMana());

    }

    public void wizard() {
        System.out.println("Olen " + state.getName());
        System.out.println("Mana: " + state.getMana());
        state.wizard(this);
        System.out.println("Mana: " + state.getMana());
    }

    public void disapper() {
        System.out.println("Olen " + state.getName());
        System.out.println("Mana: " + state.getMana());
        state.disapper(this);
        System.out.println("Mana: " + state.getMana());

    }

    public void changgeState(State state) {
        System.out.println("Olen muuttunut " + state.getName() + "iksi...");
        this.state = state;
    }

    
    public void accept(StateElementVisitor visitor) {
        state.accept(visitor);

    }


}
