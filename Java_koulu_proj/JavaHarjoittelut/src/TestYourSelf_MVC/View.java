/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestYourSelf_MVC;

import java.util.Scanner;
//import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author vadimzubchenko
 */
class View {

    private Controller controller;
    int valinta;
    // luodaan 
    static Scanner scanner = new Scanner(System.in);

    public void tulostaTeksti(String text) {
        System.out.println(text);
    }

    //luodaan menu
    public void menu() {
        System.out.println("\nAnna numero:\n"
                + "1: saldo \n"
                + "2: nosta \n"
                + "3: add \n"
                + "4: lopeta \n");
        
        try {
            valinta = scanner.nextInt();
            
            switch (valinta) {
                case 1:
                    saldo();
                    break;
                case 2:
                    nosta();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    lopeta();
                    break;
                default:
                   menu();

            }
        } catch (Exception e) {
            tulostaTeksti("Anna numero 1-4");
            
        }
        
    }

    private void saldo() {
        controller.saldo();
    }

    private void nosta() {
        tulostaTeksti("Anna nostettava määrä: ");
        double summa = scanner.nextDouble();
        controller.nosta(summa);
    }

    private void add() {
        tulostaTeksti("Paljonko haluat lisätä: ");
        double summa = scanner.nextDouble();
        controller.add(summa);
    }

    private void lopeta() {
        controller.lopeta();
    }

    void regController(Controller aThis) {
        this.controller = aThis;
    }

}
