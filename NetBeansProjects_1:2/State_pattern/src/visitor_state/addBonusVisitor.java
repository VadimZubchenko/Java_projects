/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author vadimzubchenko
 */
public class addBonusVisitor implements StateElementVisitor {

    int mana;

    @Override
    public void visit(NecromancerState necr) {
        
        System.out.println("Mana -50");
        mana = necr.getMana() - 50;
        necr.setMana(mana);
        System.out.println("Mana jai: " + necr.getMana());
    }

    @Override
    public void visit(WarlockState warl) {

        System.out.println("Mana  -70");
        mana = warl.getMana() - 70;
        warl.setMana(mana);
        System.out.println("Mana jai: " + warl.getMana());
    }

    @Override
    public void visit(WitchState witch) {

        System.out.println("Mana -30");
        mana = witch.getMana() - 30;
        witch.setMana(mana);
        System.out.println("Mana jai: " + witch.getMana());
    }

}
