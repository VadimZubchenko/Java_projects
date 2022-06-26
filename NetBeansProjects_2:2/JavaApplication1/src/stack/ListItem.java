package stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamaj
 */
public class ListItem {
    private String mData;
    private ListItem mNext;

    public ListItem() {
        mData = null; //1,2,3
        mNext = null;
    }
    public String getData() {
        return mData; //1,2,3
    }

    public void setData(String mData) {
        this.mData = mData;// 1,2,3
    }

    public ListItem getNext() {
        return mNext;//(top)null,(top)1,...jne
    }

    public void setNext(ListItem mNext) {
        this.mNext = mNext; //(top)null,(top)1,...jne
    }
    
    
}
