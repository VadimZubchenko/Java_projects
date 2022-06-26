/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_12;

import java.util.Scanner;

/**
 *
 * @author vadimzubchenko
 */
public class Teht_12 {

    public static void main(String[] args) {
        ClosedHashing hash = new ClosedHashing();
        Scanner reader = new Scanner(System.in);
        int cases;
        do {
            System.out.println("1. Insert a key");
        System.out.println("2. Find a key");
        System.out.println("3. Print the table ");
        System.out.println("4. Finish \n");
        
        cases = Integer.parseInt(reader.nextLine());
        
        switch (cases) {
            case 1:
                System.out.print("Add a key : ");
                if (hash.insert(Integer.parseInt(reader.nextLine()))) {
                    System.out.println("Adding has been done successfully \n");
                } else {
                    System.out.println("There's not any free place in the table");
                }
                
                break;
            case 2:
                System.out.println("Give a key");
                Integer data = hash.find(Integer.parseInt(reader.nextLine()));
                
                if (data == null) {
                    System.out.println("There's no the data in the table");
                } else {
                    System.out.println("The key " + data + " has been find");
                }
                break;
            case 3:
                hash.print();
        }
        } while (cases != 4);
        
    }
    }
    

