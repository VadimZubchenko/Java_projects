/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;
    private BinaryTree left;
    private BinaryTree right;
    
   
    
    public BinaryTree(String rootValue, int levelNumber) {
        root = new Node(rootValue, levelNumber);
    }
    public BinaryTree(){
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } 
    */
     public void Insert (String data) {
        if(root == null) {
            root = new Node(data, 1);
        } else {
            // tarkistetaan onko uusi alkio on pienempi juuren alkiota;
            if (Integer.parseInt(data) < Integer.parseInt(root.getData())) {
                    // uusi alkio on pienempi, sitten mennään vasemmalle
                    // tarkistetaan onko Node luokan left on tyhja, eli left == null;
                    if(root.left()== null){
                        // Node luokan left on tyhja, yhdistetän alipuu 
                        //etsintäpuuhun vasemmaksi alipuuksi
                        this.setLeft(new BinaryTree(data, root.getLevel() + 1));
                        
                    
                    // muuten node Node luokan left() sisältää alkio, 
                     // recursiviven:jokaisen seuravan Insert(data)sisältää Isert(data) taas 
                    } else {
                        root.left().Insert(data);// lasketaan alas rekursivisesti; 
                    }
            // jos uusi alkio on isompi juuren alkiota mennään oikealle
            }else{
                if (root.right() == null) {
                    this.setRight(new BinaryTree(data, root.getLevel() + 1));
                    } else {
                        root.right().Insert(data);
                    }
            }
        }
        
        
    }
     public BinaryTree delete (BinaryTree vad, String data) {
        // onko root tyhjä
        if(root == null) {
            return null;
        }
        // jos alkio(data) on pienimpi kuin root
        if(Integer.parseInt(data) < Integer.parseInt(root.getData())) {
            // mennään rekursivisesti alas vasemmalle kun data = node
            root.setLeft(root.left().delete(root.left(), data));// lasketaan alas rekursivisesti; 
                        
            
            
        // jos alkio(data) on isompi kuin root
        } else if(Integer.parseInt(data) > Integer.parseInt(root.getData())){
            // mennään rekursivisesti alas oikealle, kun data = node
            root.setRight(root.right().delete(root.right(), data));
        } else
                if(root.left() == null || root.right() == null) {
                    
                    BinaryTree temp = null;
                    temp = root.left() == null ? root.right() : root.left();
                   
                    if(temp == null) {
                        return null;
                    } else {
                        return this;
                    }
                
                } else {
                     /*    
                    BinaryTree successor = getSuccessor(data);
                    root.data = successor.root;
                    root.right = delete(root.root, data);
                    return root;
                    */
                }
                return this;
        }
         
    
    
        
    public BinaryTree getSuccessor(BinaryTree node)  {
        
        if(node == null){
            return null;
        }
        
        BinaryTree temp = node.right;
        
        while (temp.left != null){
              temp = temp.left;
        }
        return temp;
    }
     /*
    public BinaryTree getMin (String aData){
        if (find(root.getData())== null)
            return null; 
        
        if (find(root.getData()) != null) 
            return root.left();
       return root.left().getMin(aData);                           
    }
    */   

            
    /*   
        root = deleteRec(root, data);
    }
    Node deleteRec(Node root, String data) {
        
    }
    
        // tarkistetaan onko node olemassa 
        if(root == null) {
            root = new Node(null);
        if (find(data) != null) {
            // if (root.left().find(data) == null & root.right().find(data) == null)
            //BinaryTree temp = null;   
            root.left().delete(data);
            
                 
         } else {
             System.out.println("solmua ei ole");
         } 
        
        
    }
    */
    // tarkistetaan onko node olemassa;         
    public BinaryTree find(String aData){
        BinaryTree treeThrough = null;
        String value = root.getData();
        
        if (root != null) 
            if (value.equals(aData)){
                System.out.println("Data: " + root.getData() + ", level: " + root.getLevel());
                return this;
            }
            // tarkistetaan vasen alipuuta
            if (root.left() != null) // pääseeekö vasemmalle?
                treeThrough = root.left().find(aData);
            if (treeThrough != null){
                System.out.println("Data: " + root.getData() + ", level: " + root.getLevel());
                return treeThrough;
            }
                
            
            // tarkistetaan oikea alipuuta
            if (root.right() != null) // pääseekö oikealle?
                treeThrough = root.right().find(aData);
            if ( treeThrough != null){
                System.out.println("Data: " + root.getData() + ", level: " + root.getLevel());
                return treeThrough;
            }
              
            
        
        return null;
    }
        public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }

    private String getData() {
        return root.getData();
    }
    private BinaryTree getRight() {
        return root.right();
    }
    private BinaryTree getLeft() {
        return root.left();
    }
/*
    private BinaryTree delete(BinaryTree left, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}
