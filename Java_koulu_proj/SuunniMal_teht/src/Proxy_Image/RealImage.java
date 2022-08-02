/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy_Image;

/**
 *
 * @author vadimzubchenko
 */
public class RealImage implements Image {

    
    private Object name;

    public RealImage(Object name) {
        
        this.name = name;
        load();
        
    }

    public void load() {
        System.out.println("Loading foto: " + name);

    }

    @Override
    public void displayImage() {
        System.out.println("Displaying foto: " + name + "\n");

    }

    @Override
    public void showData() {
        
        System.out.println("Foto's name: " + name + "\n");
    }

}
