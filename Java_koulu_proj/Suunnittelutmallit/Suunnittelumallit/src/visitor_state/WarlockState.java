/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor_state;

/**
 *
 * @author vadimzubchenko
 */
public class WarlockState implements State {
    private static final String name = "Warlock";
    public static int mana = 210;

    @Override
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        WarlockState.mana = mana;
    }
    
    public String getName() {
        return name;
    }

   
    public void fly(StateContext context) {
        context.changgeState(new WitchState());
    }

    
    public void wizard(StateContext context) {
        System.out.println("REX PEX FEX! Firebolt!");
    }

    
    public void disapper(StateContext context) {
        System.out.println(new NecromancerState());
    }

    
    public void accept(StateElementVisitor visitor) {
        visitor.visit(this);
    }

   
    
}
