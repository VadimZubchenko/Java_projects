/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Random;

/**
 *
 * @author vadimzubchenko
 */
public class Arvuuttaja {

    private int luku;
    private String name;
    private Random rand;
    private static Arvuuttaja INSTANCE = null;

    public Arvuuttaja(String asiakas) {
        this.name = asiakas;
        this.luku = luku;

    }

    @Override
    public String toString() {
        
        return "name=" + name + ", luku=" + luku  ;
    }

    public void write(int luku) {
        
            this.luku = luku;
        

    }

    public Arvuuttaja() {
    }

    public Object save() {
        rand = new Random();
        int number = rand.nextInt(10);
        return new Memento(number);
    }

    public boolean undoToLastSave(int luku, Object obj) {
        Memento memento = (Memento) obj;
        return this.luku == memento.luku;
    }

    private class Memento{

        private int luku;
        

        public Memento(int luku) {

            
            this.luku = luku;
        }

    }
    public static synchronized Arvuuttaja getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Arvuuttaja();
        }
        return INSTANCE;
    }
}
