/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilakone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import static tilakone.Tilakone.lueRivi;

/**
 *
 * @author vadimzubchenko
 */
public class Tilakone {

    public static String lueRivi(File file) {
        String textFile = "Ei ole kommentteja";
        FileInputStream fstream;
        try {
            fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    fstream));
            String javaText;

            while ((javaText = br.readLine()) != null) {

                if (javaText.contains("/")) {

                    if (javaText.startsWith("/") && javaText.contains("*")) {
                        System.out.println("/* - lohkokomentin alku ");
                    }

                    if ((javaText.contains("/")) && !javaText.contains("*")) {
                        System.out.println("// - rivikomentissa");
                    }

                }

                if ((javaText.contains("*"))) {

                    if ((javaText.startsWith(" *")) && javaText.contains("/")) {
                        System.out.println("*/ - lohkokomentin loppu");
                    } else if ((javaText.startsWith(" *"))) {
                        System.out.println("* - lohkokomenttissa");
                    }

                }

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return String(textFile);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String a[]) {
        File file = new File("/Users/vadimzubchenko/Java_koulu_proj/Tilakone/src/tilakone/Java_code.java");
        lueRivi(file);

    }

    private static String String(String textFile) {
        System.out.println(textFile);
        return textFile;
    }

}
