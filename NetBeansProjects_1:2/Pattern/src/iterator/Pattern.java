/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vadimzubchenko
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
        
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // Iterator to traverse the list 
        Iterator iterator1 = list.iterator();
        Iterator iterator2 = list.iterator();

        System.out.println("List elements : ");

        MyThread threadOne = new MyThread(iterator1);

        MyThread2 threadTwo = new MyThread2(iterator2);

        // Start the threads.
        threadOne.run();
        threadOne.join();

        threadTwo.run();
        threadTwo.join();

    }
}
