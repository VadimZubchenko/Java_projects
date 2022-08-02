/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author vadimzubchenko
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LaiteOsa motherboard = new Emolevy("Emolevy", 140);
        LaiteOsa ram = new Ram("Ram 125", 60);
        LaiteOsa ram2 = new Ram("Ram 256", 100);
        LaiteOsa verkkokortti = new Verkkokortti("Verkkokortti", 40);
        LaiteOsa naytonohjain = new Naytonohjain("Näytonohjain", 300);
        LaiteOsa processor = new Prosessori("Prosessori", 500);
        LaiteOsa comp = new Kotelo("Pöytätietokone 'Iskra'", 120);

        motherboard.add(naytonohjain);
        motherboard.add(processor);
        motherboard.add(verkkokortti);
        motherboard.add(ram);
        motherboard.add(ram2);
        comp.add(motherboard);

        // tietokoneen loppullinen hinta ja sen sisältävät osat. 
        comp.print();
    }

}
