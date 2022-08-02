/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author vadimzubchenko
 */
public class KolmannenJalkeen implements ListConverter{
    String tulos = "";
    @Override
    public String listToString(List<String> list) {
        
        String[] array = list.toArray(new String[list.size()]);

        for (int i = 0; i < array.length; i++) {
            tulos += list.get(i);
            if ((i + 1) % 3 == 0) {
                tulos += "\n";
            }
        }

        return tulos;
    }
    
}