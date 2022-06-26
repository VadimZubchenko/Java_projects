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
public class J_Kaksiulotteisen_taulukko_metodit {

    public static void main(String[] args) {
        int matriisi[][] = {{1, 2, 3, 4, 5}, {3, 4, 6, 7, 2}, {12, 21, 3, 24, 5}, {1, 2, 12, 4, 15}, {11, 22, 33, 44, 55}};
        int summa;

        try {
            System.out.print("Matriisi:\n\n");
            tulosta_matriisi(matriisi);
            summa = laske_summa(matriisi);
            System.out.print("\nMatriisin alkioiden summa: " + summa + "\n");

        } catch (Exception e) {
            System.out.print("Antamasi syöte oli virheellinen...\n" + e + "\n");
        }
    }

    public static void tulosta_matriisi(int matriisi[][]) {

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {

                if (x == 4) {
                    System.out.println(matriisi[y][x]);// siittetään toiselle riville
                } else {
                    System.out.print(matriisi[y][x] + "\t");
                }
            }
        }

    }

    public static int laske_summa(int matriisi[][]) {
        int summa = 0;
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                summa += matriisi[y][x];

            }
        }
        return summa;

    }
}
