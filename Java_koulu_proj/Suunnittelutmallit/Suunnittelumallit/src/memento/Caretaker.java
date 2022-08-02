/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author vadimzubchenko
 */
public class Caretaker extends  Thread{
    
    private Object object;
    private Caretaker ct;
    private Arvuuttaja arv;
    private String pelaaja;
    private int arvo;
    private Random rand;
    
    
    public Caretaker(String pelaaja) {
        this.pelaaja = pelaaja;
    }
    
    public void save(Arvuuttaja nameWriter) {
        this.object = nameWriter.save();
    }
    
    public void undo(Arvuuttaja nameWriter){
        nameWriter.undoToLastSave(arvo, object);
    }
    public void run() {
            
            arv = Arvuuttaja.getInstance();
            
            rand = new Random();
            do {
            arvo = rand.nextInt(10) + 1;
            arv.write(arvo);
            save(arv);
            undo(arv);
            System.out.println("Pelaaja " + pelaaja + ": Arvaan numero: " + arvo + ",  Voittonumero: " + arv);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!arv.undoToLastSave(arvo, object));
        
    }
}
