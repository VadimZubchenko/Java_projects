/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vadimzu.regExp;

/**
 *
 * @author vadimzubchenko
 */
public class Singleton2 {

    public double url = 0;
    private static Singleton2 instance = null;

    private Singleton2() {
        url = Math.random();
    }

    public static Singleton2 instanceGet() {
        
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;

    }

public static void main(String[] args) {
        // try out the diff. castings
        int cast = 8;
        float castt = 5.23444444f;
        double myDouble = castt;
        for (int i = 0; i < 10; i++) {
            Singleton2 s = Singleton2.instanceGet();
            System.out.println("url " + i +": \t" + s.url);
            System.out.println("url in float \'" + i + "\'\t" + (float) s.url);
            System.out.println("casting to double: " + myDouble);
        }
    }
}


