/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_2_MVC;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vadimzubchenko
 */
public class View {

    private Controller controller;

    private String valintaStr;
    private int valinta;
    private double saldo;
    private String summa;

    protected void showMenu() {

        valintaStr = JOptionPane.showInputDialog(null,
                "Valitse toiminto: \n"
                + "1: Näytä tilin saldo \n"
                + "2: Pano \n"
                + "3: Otto \n"
                + "4: Lopetus \n");
        try {
            valinta = Integer.parseInt(valintaStr);

            switch (valinta) {

                case 1:
                    saldo();
                    break;
                case 2:
                    pano();
                    break;
                case 3:
                    otto();
                    break;
                case 4:
                    lopetus();
                    break;
                default:
                    showMenu();
            }
        } catch (Exception e) {
            showText("Valitse toiminto 1-4.");
            showMenu();
        }

    }

    protected void showText(String text) {
        JOptionPane.showMessageDialog(null, text);

    }

    protected void saldo() {
        controller.saldo();
        
    }

    private void pano() {
        summa = JOptionPane.showInputDialog("Kuinka paljon rahaa laitetaan: ");
        saldo = Double.parseDouble(summa);
        controller.talletus(saldo);

    }

    private void otto() {
        summa = JOptionPane.showInputDialog("Kuinka paljon rahaa nostetaan: ");
        saldo = Double.parseDouble(summa);
        controller.otto(saldo);

    }

    private void lopetus() {
        controller.lopetus();
    }

    protected void regController(Controller aThis) {
        this.controller = aThis;
    }

}
