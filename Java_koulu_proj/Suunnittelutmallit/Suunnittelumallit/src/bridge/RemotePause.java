/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public class RemotePause extends Remotes {

    // put device's abstract as a constructor parameter
    public RemotePause(AbstractDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void centerButton() {
        System.out.println("Device switches to pause");
    }

}
