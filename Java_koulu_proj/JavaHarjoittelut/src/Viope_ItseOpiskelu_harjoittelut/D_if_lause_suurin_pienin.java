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
public class D_if_lause_suurin_pienin
{
  public static void main(String[] args)
  {
    int luku1, luku2, luku3, suurin, pienin;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Syötä ensimmäinen kokonaisluku: ");
      luku1 = Integer.parseInt(in.readLine());

      System.out.print("Syötä toinen kokonaisluku: ");
      luku2 = Integer.parseInt(in.readLine());

      System.out.print("Syötä kolmas kokonaisluku: ");
      luku3 = Integer.parseInt(in.readLine());

      suurin = suurin(luku1, luku2, luku3);
      pienin = pienin(luku1, luku2, luku3);

      System.out.print("Syöttämistäsi luvuista suurin oli " +suurin);
      System.out.print(" ja pienin " +pienin + "\n");
    }
    catch(Exception e){
      System.out.print("Antamasi syöte on virheellinen...");
    }
  }

public static int suurin(int luku1, int luku2, int luku3){
		
		 
		if(luku1>=luku2 && luku1>=luku3){
		
			return luku1;
		}
		else if (luku2>=luku1 && luku2>=luku3){
			
			return luku2;
		
		}else{
			return luku3;
		}
	}
// tässä on toinenkin tapaa löytämään pienin luvun. Käytettiin muuttujaa palautus;    
public static int pienin(int luku1, int luku2, int luku3){
		
		int palautus = 0;
                
                if(luku1 >=luku2){
                    palautus=luku2;
                }else{
                    palautus=luku1;
                }
                
                if(palautus >= luku3){
                    palautus=luku3;
                }else{
                    palautus = palautus;
                }
                return palautus;
//                if(luku1<=luku2 && luku1<3=luku3){
//		
//			return luku1;
//		}
//		else if (luku2<=luku1 && luku2<=luku3){
//			
//			return luku2;
//		
//		}else{
//			return luku3;
//		}
	}
}



