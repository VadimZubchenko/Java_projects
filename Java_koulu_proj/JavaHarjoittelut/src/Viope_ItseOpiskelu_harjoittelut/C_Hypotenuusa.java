/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viope_ItseOpiskelu_harjoittelut;

/**
 *
 * @author vadimzubchenko
 */
import java.io.*;

public class C_Hypotenuusa 
{
	public static void main(String[] args) {
		int kat_1, kat_2;
		double hyp;
	
		BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
	
		try {
											   
			System.out.print("Anna ensimmäinen kateetti:");
			kat_1 = Integer.parseInt(lukija.readLine());
			System.out.println("Anna toinen kateetti: ");
			kat_2 = Integer.parseInt(lukija.readLine());
		
			// lasketaan hypotenuusan
			hyp = Math.sqrt((double)((kat_1 * kat_1) + (kat_2 * kat_2)));
		
			System.out.println("Hypotenuusan pituus: " + hyp);
	
		}catch(Exception e){
	
			System.out.print("Syötteet olivat virhelliset");
		
		}
	
	
	}
}
