/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilakaavio_java;

/**
 *
 * @author vadimzubchenko
 */
public class Tilakaavio_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereg 
        String c = new String("A7@52#@12#1121#");
        String digits = new String("0123456789");
        int state = 0;
        for (int i = 0; i < c.length(); i++) {

            if (state == 0) {
                if (c.charAt(i) == '@') {
                    state = 1; // Huom!!! jos pääse state = x, sit palaa for looppiin ja i++
                }
            } else if (state == 1) {
                if (digits.indexOf(c.charAt(i)) != -1) {// kun charAr(index) on numero, sit indexOf toimii ja != -1, muuten ei 
                    state = 2;
                } else if (c.charAt(i) == '@') {
                    state = 1;
                } else {
                    state = 0;
                }
            } else if (state == 2) {
                if (c.charAt(i) == '#') {
                    state = 3;
                } else if (digits.indexOf(c.charAt(i)) != -1) {
                    state = 2;
                } else if (c.charAt(i) == '@') {
                    state = 1;
                } else {
                    state = 0;
                }

            } else if (state == 3) {
                if (c.charAt(i) == '@') {
                    state = 1;
                
                } else {
                    state = 0;
                }
            }
        }
        if (state == 3) {
            System.out.println("Löytyy!");
        } else {
            System.out.println("Ei löydy");

        }

    }
}
