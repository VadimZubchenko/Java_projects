/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vadimzubchenko
 */
public class JokaisenJalkeen implements ListConverter {

   // private String tulos = "";

    @Override
    public String listToString(List<String> list) {
        String tulos = "";
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            tulos += iterator.next() + "\n";
        }
        return tulos;
    }

}