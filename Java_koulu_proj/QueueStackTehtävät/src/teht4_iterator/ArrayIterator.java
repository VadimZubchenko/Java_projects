/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht4_iterator;

import java.util.ArrayList;

/**
 *
 * @author vadimzubchenko
 */
interface Iterator {

    boolean hasNext();

    Object next();
}

public class ArrayIterator implements Iterator {

    private Object current;
    private final ArrayList arrayList;
    private int currentSize;

    ArrayIterator(ArrayList list) {
        this.arrayList = list;
        currentSize = 0;
    }

    @Override
    public boolean hasNext() {
        if (currentSize >= arrayList.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        current = arrayList.get(currentSize);
        currentSize++;
        return current;
    }

}
