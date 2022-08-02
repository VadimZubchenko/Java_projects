/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template name, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_image;

/**
 *
 * @author vadimzubchenko
 */
public class ProxyImage implements Image{
    
    private Object name;
    private RealImage realimage;

    public ProxyImage(Object file) {
        this.name = file;
    }

    @Override
    public void displayImage() {
        if(realimage == null){
            realimage = new RealImage(name);
        }
        realimage.displayImage();
    }

    @Override
    public void showData() {

        System.out.println("Foto's name: " + name + "\n");
    }
    
    
}
