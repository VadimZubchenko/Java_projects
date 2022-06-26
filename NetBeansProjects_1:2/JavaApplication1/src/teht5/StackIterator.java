/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht5;

import java.util.LinkedList;



/**
 *
 * @author vadimzubchenko
 */
interface Iterator {
    boolean hasNext();
    Object next();
}
public class StackIterator implements Iterator {
    private Object  current;
    private LinkedList linkedList;
    private int currentSize;
    //private Stack container; // container on tietorakenne, jota iteroidaan
    
        StackIterator (LinkedList list) { // konstruktori on "package visible"
//        container = c;
//        current = container.mTop;
            this.linkedList = list;
            currentSize = 0;
    }
    @Override
    public boolean hasNext() {
        if (currentSize >= linkedList.size())
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        current = linkedList.get(currentSize);
        currentSize++;
        return current;
    }
    
}
