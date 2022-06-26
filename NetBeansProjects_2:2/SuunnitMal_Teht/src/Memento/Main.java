/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author vadimzubchenko
 */
public class Main {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker("Pekka");
        caretaker.run();
        
        Caretaker caretaker2 = new Caretaker("Väinö");
        caretaker2.run();{
        
        Caretaker caretaker3 = new Caretaker("Jukka");
        caretaker3.run();
//        Arvuuttaja nameWriter = new Arvuuttaja("Pekka");
//        nameWriter.write(6);
//        System.out.println(nameWriter + "\n\n");
//
//        caretaker.save(nameWriter);
//        
//
//        caretaker.undo(nameWriter);
//
//        System.out.println(nameWriter + "\n\n");
    }
}
}
