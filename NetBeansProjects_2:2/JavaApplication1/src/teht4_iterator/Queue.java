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
public class Queue {

    ListItem first;
    private ListItem last;
    private int n;
    private final ArrayList list;

    public Queue() {
        list = new ArrayList();
        first = null;
        last = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;

    }

    //  palautetaan Array-iteraattori
    public ArrayIterator iterator() {
        return new ArrayIterator(list);
    }

    // lisätään alkio jonon loppuun
    public void push(String aData) {

        // tallennetaan jonon hännän toisella nimillä "oldLast"eli vanha häntä
        ListItem oldLast = last;
        // muodostetaan uusi lista-alkio "last"
        last = new ListItem();
        // luodaan uusi lista-alkio "last" aData-lla
        last.setData(aData);
        // kytketään "last" null-iin ja samalla irrotetaan oldLast-akio null-sta
        last.setNext(null);

        // jos jono on tyhjä sitten jonon pää on sama häntä
        if (isEmpty()) {
            first = last;
            n++;
        } // kytketään vanha häntä uuteen alkioon "last"
        else {
            oldLast.setNext(last);
            n++;
        }
        // luodaan taulokkoon uusi alkio 
        list.add(last.getData());

        //System.out.println(list);
    }

    public ListItem pop() {
        ListItem poisItem;
        if (first == null) {
            poisItem = null;

        } else {
            poisItem = last;
            // poistetaan häntän-alkio taulokosta
            list.remove(list.size() - 1);
            //System.out.println(list);
            first = first.getNext();
        }
        return poisItem;
    }

    // listataan sisältö
    public void printItems() {
        System.out.println(list);
    }

    public int getSize() {
        return n;
    }

}
