/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_11;

/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) {
            printMenu();
        }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
        private static void printMenu() {
            char h;    
            char select;
            Bheap heap = new Bheap(); //Luodaan tyhjä etsintäpuu
            String data;
            int treeSize = 0;
            do {
                System.out.println("\n\t\t\t1. Lisää avain.");
                System.out.println("\t\t\t2. Näytä Heapin sisältö.");
                System.out.println("\t\t\t3. Poista heapin pienin arvo.");
                System.out.println("\t\t\t4. lopetus ");
                System.out.print("\n\n"); // tehdään tyhjiä rivejä
                select = Lue.merkki();
                switch (select) {
                case '1':
                    System.out.println("Anna uusi avain (merkkijono)");
                    data = new String(Lue.rivi());
                    heap.insert(Integer.parseInt(data));
                    break;
                case '2':
                    heap.print();
                    h = Lue.merkki(); // pysäytetään kontrolli
                    break;
                case '3':
                    System.out.println("Pienin arvo poistettu");
                    heap.deleteMin();
                case '4':
                    break;
                }
            }
            while (select != '4');
        }
//printMenu loppuu ----------------------------------------------------------------
}