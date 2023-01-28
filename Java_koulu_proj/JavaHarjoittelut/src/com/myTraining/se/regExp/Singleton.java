/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myTraining.se.regExp;

/**
 *
 * @author vadimzubchenko
 */
public class Singleton {
    
    public double dbUrl = 0;
    private static Singleton INSTANCE = null;

    private Singleton() {
        dbUrl = Math.random();

    }

    public static Singleton getINSTANCE() {
        if (INSTANCE == null) {

            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

class GFG {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Singleton w = Singleton.getINSTANCE();
            System.out.println("Url of" + i + ": " + w.dbUrl);
        }
    }

}
