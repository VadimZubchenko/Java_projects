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
public class  MyThread2 extends Thread
{
    String thread1 = "thread1";
    Iterator<Integer> i;

    public MyThread2(Iterator<Integer> i)
    {
        this.i = i;
        
    }

    public void run()
    {
        while (this.i.hasNext()) {
            //Integer num = this.i.next();
            System.out.print(i.next() + " " + this.thread1 + " \n");
        }
    }
}
