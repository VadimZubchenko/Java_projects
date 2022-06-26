package pizza_decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vadimzubchenko
 */
public class Pizzapohja implements Pizza {

    @Override
    public double gethinta() {
        return 2.50;
    }

    @Override
    public String getTäyte() {
        return "pohja";
    }

}
