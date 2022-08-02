/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsibility;

/**
 *
 * @author vadimzubchenko
 */
public class ToimitusJohtaja extends Palkankorotus_abstract{
     
    // tämä tulee Palkankorotus_abstract luokaan getAlloewable arvoksi
    protected double getAllowable(){
        return BASE+5;
    }

    protected String getRole(){
        return "Toimitusjohtaja";
    }
}
