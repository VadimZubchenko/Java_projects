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
public interface StateElementVisitor {
   

   void visit(NecromancerState necr);
   void visit(WarlockState warl);
   void visit(WitchState witch);
   
   
}
