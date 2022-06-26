/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author vadimzubchenko
 */
public interface LaiteOsa {

    public void add(LaiteOsa osa);

    public void remove(LaiteOsa osa);

    public String getName();

    public double getHinta();

    public double getTotalCost();

    public void print();

}
