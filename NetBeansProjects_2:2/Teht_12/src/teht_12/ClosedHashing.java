/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_12;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author vadimzubchenko
 */
public class ClosedHashing {
    
    int table = 10;
    Integer[] hashTable = new Integer[table];
    int amount = 0;

    public boolean insert(int key) {
        boolean free = false;
        int place = hashing(key);
        while (!free && amount <= table) {
            free = hashTable[place] == null;
            if (free) {
                hashTable[place] = key;
                
                amount++;
            } else {
                place = newPlace(place);
            }
        }

        return free;
    }

    public Integer find(Integer key) {
        boolean data = false;
        int place = hashing(key);
        Integer result = null;
        int firstPlace = place;

        do {

            data = hashTable[place] == key;
            if (data) {
                result = hashTable[place];
            } else {
                place = newPlace(place);
            }
        } while (!data && place != firstPlace);

        return result;
    }

    private int newPlace(int place) {
        return ++place % table;
    }

    private int hashing(int key) {
        return key % table;
    }
    public void print() {
        System.out.println(Arrays.toString(hashTable));
        
    }
}
