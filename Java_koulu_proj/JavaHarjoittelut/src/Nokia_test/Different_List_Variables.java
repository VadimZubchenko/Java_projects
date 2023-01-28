/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nokia_test;

import java.util.Random;

/**
 *
 * @author vadimzubchenko
 */
public class Different_List_Variables {
    
    public static void main(String[] args) {
        
        
    
        Integer[] table = new Integer[5];
        Integer[] table2 = new Integer[5];
        int i = 0;
        
        while (i < 5) {            
            table[i] = addDiff();
            table2[i] = addDiff();
            
                while (table[i] == table2[i]) {
                    
                    table[i] = addDiff();
                    
                }
                
            // check for the sameless 
        
         i++;
        
            
        }
        for (i = 0; i < 5; i++) {
            System.out.print("t1: " + table[i] + ", ");
            System.out.println("\tt2: " + table2[i] + ", ");
        }
        
    }
    
    
    public static int addDiff(){
        int newOne;
        Random random = new Random();
        newOne = random.nextInt(10);
        return newOne;
    }
    
   
}
