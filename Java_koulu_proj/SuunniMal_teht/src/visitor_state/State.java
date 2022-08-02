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
public interface State {

    String getName();
    int getMana();
    
    void setMana(int mana);

    void fly(StateContext context);

    void wizard(StateContext context);

    void disapper(StateContext context);

    void accept(StateElementVisitor visitor);
}
