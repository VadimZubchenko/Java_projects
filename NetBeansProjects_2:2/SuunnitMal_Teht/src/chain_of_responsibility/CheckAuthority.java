/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author vadimzubchenko
 */
public class CheckAuthority {
    public static void main(String[] args) {
        LahiEsimies manager = new LahiEsimies();
        YksikonPaallikko director = new YksikonPaallikko();
        ToimitusJohtaja president = new ToimitusJohtaja();
        manager.setSuccessor(director);
        director.setSuccessor(president);
        

        try {
            while (true) {
                System.out.println("Kunka monta prosentia palkankorotusta pyydetään?");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new KorotusRequest(d));
           }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}
