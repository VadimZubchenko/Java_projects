/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_image;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vadimzubchenko
 */
public class ProxyMain {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {

        int kuvanNumero;
        boolean valinta = true;

        // luodaan kuvan kansion
        List<String> kansio = new ArrayList<String>();

        kansio.add("001_Kesä.jpg");
        kansio.add("002_Talvi.jpg");
        kansio.add("003_Kevät.jpg");
        kansio.add("004_Syksy.jpg");
        kansio.add("005_Meriranta.jpg");
        kansio.add("006_Mökki.jpg");

        Image image = new ProxyImage(kansio);
        // tulostetaan vain kuvien nimet  
        image.showData();

        // ladataan kiinostavan kuvan
        while (valinta) {
            System.out.println("Valitse kuva 1...6: ");
            kuvanNumero = lukija.nextInt();
            if (kuvanNumero > 0 && kuvanNumero <= kansio.size()) {
                Image imageShow = new ProxyImage(kansio.get(kuvanNumero - 1));
                imageShow.displayImage();

            } else {
                System.out.println("Kuva ei löydy");
                valinta = false;
            }

        }

    }
}
