/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author vadimzubchenko
 */
interface Iterator {
    boolean hasNext();
    Object next();
}
public class StackIterator implements Iterator {
    private ListItem  current;
    private Stack container; // container on tietorakenne, jota iteroidaan
    
        StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        current = container.mTop;
    }
    @Override
    public boolean hasNext() {
        if (current == null)
            return false;
        else
            return true;
    }

    @Override
    public ListItem next() {
        ListItem oldCurrent = current;
        current=current.getNext();
        return oldCurrent;
    }
    
}
