/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;

/**
 *
 * @author vadimzubchenko
 */
public class MainTest {

    public static void main(String[] args) {
        CheckList checklist = new CheckList();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            list.add(Integer.toString(i));
        }
        checklist.setList(list);
        System.out.println("Jokaisen alkion jälkeen:");
        checklist.setListConverter(new JokaisenJalkeen());
        System.out.println(checklist);

        
        System.out.println("Joka toisen alkion jälkeen:");
        checklist.setListConverter(new ToisenJalkeen());
        System.out.println(checklist);

        System.out.println("Joka kolmannen alkion jälkeen:");
        checklist.setListConverter(new KolmannenJalkeen());
        System.out.println(checklist);
    }
}