/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_3_MVC;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author vadimzubchenko
 */
class View {

    private Controller controller;
    private double summa;

    // luodaan lukija;
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner reader2 = new Scanner(System.in);
    void showMenu() {
        //String valintaString;
        //int valinta;
        int v;

        System.out.println("Which operation whould you like to do:\n"
                + "1: Balance.\n"
                + "2: Withdraw.\n"
                + "3: Add.\n"
                + "4: Finish.\n");

        try {
            //valintaString = reader.readLine();
            v = reader2.nextInt();
            //valinta = Integer.parseInt(valintaString);

            switch (v) {
                case 1:
                    Balance();
                    break;
                case 2:
                    Withdraw();
                    break;
                case 3:
                    Add();
                    break;
                case 4:
                    Finish();
                default:
                    System.out.println("Choose the number between 1-4");
                    showMenu();
            }
        } catch (Exception e) {
            System.out.println("Choose the number between 1-4");
            
        }

    }

    protected void printText(String text) {
        System.out.println(text);
    }

    private void Balance() {
        controller.balance();
    }

    private void Withdraw() {
        System.out.print("How much would you like to withdraw: ");
        try {
            double summa = Double.parseDouble(reader.readLine());
            controller.withdraw(summa);
        } catch (Exception e) {
            System.out.println("Please, give the correct number.");
            showMenu();
        }

    }

    private void Add() {
        System.out.print("How much would you like to get: ");
        try {
            summa = Double.parseDouble(reader.readLine());
            controller.add(summa);
        } catch (Exception e) {
            System.out.println("Please, give the correct number.");
            showMenu();
        }

    }

    private void Finish() {
        controller.finish();
    }

    protected void regController(Controller aThis) {
        this.controller = aThis;
    }

}
