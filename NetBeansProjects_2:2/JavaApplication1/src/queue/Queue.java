/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author vadimzubchenko
 */
public class Queue {
    
    ListItem first;
    private ListItem last;
    private int n;
    
   
    public Queue() {
        first = null;
        last = null;
        n = 0;
    }    
    public boolean isEmpty() {
        return first == null;
    
    }
        //  palautetaan pino-iteraattori
    public StackIterator iterator() {
        return new StackIterator(this);
    }
    // lisätään alkio jonon loppuun
    public void push(String aData) {
        
            // tallennetaan jonon hännän toisella nimillä "oldLast"eli vanha häntä
            ListItem oldLast = last;
            // muodostetaan uusi lista-alkio "last"
            last = new ListItem();
            // luodaan uusi lista-alkio "last" aData-lla
            last.setData(aData);
            // kytketään "last" null-iin
            last.setNext(null);
            
            // jos jono on tyhjä sitten jonon pää on sama häntä
            if(isEmpty()){
                first = last;
                n++;
            }
            // kytketään vanha häntä uuteen alkioon "last"
            else{
                oldLast.setNext(last);
                n++;
            }   
            
            
            
   } 
    public ListItem pop() {
        ListItem poisItem;
        
        if (first == null) {
            poisItem = null;
            
        } else 
        {
            n--;
            // tallennetaan poistettava alkio returnia varten
            poisItem = first;
            // siirettetaan head to seuravan alkion
            first = first.getNext();
        }
        return poisItem;
    }
 
    // listataan sisältö
        public void printItems() {
                ListItem lPointer = first;
                while (lPointer != null) {
                        System.out.print(lPointer.getData()+", ");
                        lPointer = lPointer.getNext();
                }

        }
    
    public int getSize() {
        return n;
    }
}