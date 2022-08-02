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

public class I_Taulukko_matriisiin_summa {
	public static void main(String[] args) {
		int luvut[] = new int[6];
		int indeksi;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			for(indeksi=1; indeksi<6; indeksi++) {
				//System.out.print("Syötä " +indeksi +". numero: ");
				luvut[indeksi] = +indeksi;//Integer.parseInt(in.readLine());
			}

			System.out.println("Numerot käänteisenä: ");

			for(indeksi=5; indeksi>0; indeksi--) {
				System.out.print(luvut[indeksi]+", "); 
			}
                        //vaikka emme tallentaneet mitään index[0], se sisältää "0";
                        
                        System.out.println("\nvaikka emme tallentaneet mitään index[0]\n" +
                                ",kuitenkin se sisältää –––– "+ luvut[0]+" !!! \n\n"); 
		} catch(Exception e) {
			System.out.println("Syötteesi oli virheellinen. :" + e);
		}
                System.out.println("---------Matrisien summa!---------\n");
                int y, x, summa;

		int matr_a[][] = {
			{3, 2, 76},
			{55, 1, 43},
			{12, 9, 67}
			};  

		int matr_b[][] = {
			{11, 54, 7},
			{2, 77, 82},
			{41, 29, 1}
			};


		for(y=0; y<3; y++) {
			for(x=0; x<3; x++) {
				summa = matr_a[y][x] + matr_b[y][x];
				
				if(x==2) {//tähän jos koko rivi on laskettu
					System.out.println(summa);// Huom! tässä on rivinvaihtomerkki - 'println' !!! eli hypätään toiseen riviin
				} else {
					// '\n' - sarkain, tabulaattorimerkki;
                                        System.out.print(summa +"\t");// Huom! tässä on vain  - 'print' !!!
				}
			}
		}
	}
}