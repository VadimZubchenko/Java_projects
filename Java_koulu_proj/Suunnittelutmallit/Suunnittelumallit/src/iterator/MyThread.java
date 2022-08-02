/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;

/**
 *
 * @author vadimzubchenko
 */
public class MyThread extends Thread 
{
    String thread2 = "thread2";
    Iterator<Integer> i;

    public MyThread(Iterator<Integer> i)
    {
        this.i = i;
        
    }

    public void run()
    {
        while (this.i.hasNext()) {
            
            int changed = i.next() / 2;
            //Integer num = this.i.next();
            System.out.print(changed + " " + thread2 + " \n");
        }
    }
}
