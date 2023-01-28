/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public class RemoteMute extends Remotes {

    public RemoteMute(AbstractDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void centerButton() {
        System.out.println("Device switches to mute");
    }

}