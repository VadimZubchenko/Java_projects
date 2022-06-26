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
public class Pelihahmo {

    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.wizard();
        context.accept(new addBonusVisitor());
        context.fly();
        context.accept(new addBonusVisitor());
        context.fly();
        context.accept(new addBonusVisitor());
        System.out.println(" ");
        
        context.disapper();
        context.accept(new addBonusVisitor());
        context.disapper();
        context.accept(new addBonusVisitor());
        System.out.println(" ");

        context.wizard();
        context.accept(new addBonusVisitor());
        context.wizard();
        context.accept(new addBonusVisitor());

    }

}
