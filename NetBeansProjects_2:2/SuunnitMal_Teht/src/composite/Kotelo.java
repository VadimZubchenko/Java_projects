/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vadimzubchenko
 */
public class Kotelo implements LaiteOsa {

    public String name;
    public double hinta;

    public Kotelo(String name, double hinta) {
        this.name = name;
        this.hinta = hinta;
    }
    ArrayList<LaiteOsa> osat = new ArrayList<>();

    @Override
    public void add(LaiteOsa osa) {
        osat.add(osa);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHinta() {
        return hinta;
    }

    public double getTotalCost() {
        double totalcost = 0;

        for (int i = 0; i < osat.size(); i++) {
            totalcost += osat.get(i).getTotalCost();
        }
        return totalcost + getHinta();
    }

    @Override
    public void print() {

        System.out.println("-------------");
        System.out.println("Name = " + getName());
        System.out.println("Hinta = " + getTotalCost());
        System.out.println("-------------");

        Iterator<LaiteOsa> osaIterator = osat.iterator();
        while (osaIterator.hasNext()) {
            LaiteOsa osa = osaIterator.next();
            osa.print();
        }
    }

    @Override
    public void remove(LaiteOsa osa) {
        osat.remove(osa);
    }

}
