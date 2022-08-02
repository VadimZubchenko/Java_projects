package teht4_iterator;


/**
 *
 * @author kamaj
 */
public class ListItem {
    private String mData;
    private ListItem mNext;

    public ListItem() {
        mData = null;
        mNext = null;
    }
    public String getData() {
        return mData;
    }

    public void setData(String mData) {
        this.mData = mData;
    }

    public ListItem getNext() {
        return mNext;
    }

    public void setNext(ListItem mNext) {
        this.mNext = mNext;
    }

    String pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
