/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_13;
import java.io.IOException;


/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) 
            throws IOException {
        PostFixCalculator calc = new PostFixCalculator();
        calc.calculateFile("/Users/vadimzubchenko/Java_koulu_proj/Binaari_Bheap_ClosedHashing_Postfix/src/teht_13/postfix.rtf");
    }
        }
//