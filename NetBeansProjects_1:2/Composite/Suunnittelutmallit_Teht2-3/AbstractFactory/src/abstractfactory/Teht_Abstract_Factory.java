/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author vadimzubchenko
 */
public class Teht_Abstract_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Opiskeluaikana Jasperilla päällään oli: ");
        // valitaan käytettävä tehdas Adidas
        Kaappi opiskelija = new Adidas_stuff();
        opiskelija.paallaOn();
        System.out.println("");
        
        System.out.println("Valmistuttuaan insinööriksi Jasperilla päällään on: ");
        // valitaan käytettävä tehdas Boss
        Kaappi insinööri = new Boss_stuff();
        insinööri.paallaOn();
        System.out.println("");
    }
    
}
