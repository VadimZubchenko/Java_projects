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
public class Stack {
    
    ListItem mTop; // top näkyy oletuspakkaukseen
    private int mSize;
    // luodaan uusi tyhjä stack 
    public Stack() {
        mTop = null; // muuttui 1-ksi,
        mSize = 0;
    }
    //  palautetaan pino-iteraattori
    public StackIterator iterator() {
        return new StackIterator(this);
    }
    // muodostetaan uusi alkio ja viedään se huipulle 
    public void push(String aData) { //1,
        
        ListItem oldItem = mTop;
        // luodaan uusi lista-alkio 
        ListItem newItem = new ListItem();
        
        // luodaan uusi lista-alkio
        newItem.setData(aData);//1,2,3
        
        // kytketään uusi alkio aikaisempaan(siis alemmaiselle) huippualkioon
        newItem.setNext(oldItem); // 3->2->1->null;
        mSize++;
        
        // Aseta uusi item paallimaiseksi tai // uusi alkio pinon 1:ksi
        mTop = newItem; //
   }
    // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
    public ListItem pop() {
        ListItem poisItem;
        
        if (mTop == null) {
            poisItem = null;
            
        } else 
        {
            mSize--;
            // tallennetaan poistettava alkio returnia varten joka menee menu,java pop()_iin
            poisItem = mTop;
            // top palaa aikasempaan item, mihin viime item osoittaa esim 3--->2, eli nyt top=2
            mTop = mTop.getNext();
        }
        return poisItem;
    }
 
    // operaatio, joka tulostaa pinon sisällön
    public void printItems() {
        // luodaan apulais nItem, joka laske pinon allemmaksi
        ListItem nItem = mTop;

        for(int i = 0; i < mSize; i++) {
            System.out.print(nItem.getData()+", "); 
            // Seuraava item, pinon top laskee atkaisin
            nItem = nItem.getNext();
        }
        // toinen tapa while avulla
        /*
        ListItem lPointer = top;
                while (lPointer != null) {
                        System.out.print(lPointer.getData()+", ");
                        lPointer = lPointer.getLink();
                }
        */
    }
    
    public int getSize() {
        return mSize;
    }


}