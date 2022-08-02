/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeeSeItse_4_JO_version;

import javax.swing.JOptionPane;

/**
 *
 * @author vadimzubchenko
 */
class View {
    private Controller controller;

    
    public void Menu() {
       
        String valintaString = JOptionPane.showInputDialog(null, "Anna valinta: \n"
                + "1. saldo \n"
                + "2. nosta \n"
                + "3. lisää \n"
                + "4. loppu \n");
        
        
        try {
            int valintaInt = Integer.parseInt(valintaString);
            switch(valintaInt){
            case 1: saldo(); 
                break;
            case 2: nosta();
                break;
            case 3: lisaa();
                break;
            case 4: loppu();
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Anna valintasi 1-4");
                    Menu();
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Syöttämäsi arvot ovat virhellisia.");
            Menu();
        }
        
        
    }
    public void tulostaText(String text){
        JOptionPane.showMessageDialog(null, text);
    }
    void regController(Controller ohjain) {
        this.controller = ohjain;
    }

    private void saldo() {
        controller.saldo();
    }

    private void nosta() {
        
        try {
            double summa = Double.parseDouble(JOptionPane.showInputDialog("Kuinka paljon nostetaan? "));
            controller.nosta(summa);
        } catch (Exception e) {
            tulostaText("Syöttämäsi arvo on virhellinen.");
            Menu();
        }
    }

    private void lisaa() {
       try {
            double summa = Double.parseDouble(JOptionPane.showInputDialog("Kuinka paljon talletetaan? "));
            controller.lisaa(summa);
        } catch (Exception e) {
            tulostaText("Syöttämäsi arvo on virhellinen.");
            Menu();
        }
    }

    private void loppu() {
        controller.loppu();
    }
    
}
