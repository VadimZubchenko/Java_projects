/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_making;

/**
 *
 * @author vadimzubchenko
 */
public class Oma_harjoutukset {

    public static void main(String[] args) throws InterruptedException {
        
        final int SIZE = 1000;
        
        Thread t[] = new Thread[SIZE];
        
        //Singleton arr[] = new Singleton[SIZE];
        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R());
            t[i].start();
        
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        System.out.println(Singleton.counter);
    }

}

class R implements Runnable {

    @Override
    public void run() {
        Singleton.getSingleton();
    }
    
}
// luodaan singleton luokka, joka rajoittaa olion syntymisen määrä, synty ainoa olio. Vain 1!
class Singleton {
    public static int counter = 0;
    private static volatile Singleton instance;
    
    // konstruktori, jolla voi tehdä mitä vain, tällä kertaa se laskee käynistymisen määrää
    private Singleton() {
        counter++;
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null)
                    // näin syntyy ilmentymä, eli olio
                    instance = new Singleton();
            }
            
        }
        return instance;
    }
}
