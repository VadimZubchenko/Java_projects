/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public abstract class Remotes {

    // define class of tv to calling it from constructor
    private AbstractDevice theDevice;

    // put device's abstract as a constructor parameter
    public Remotes(AbstractDevice theDevice) {
        this.theDevice = theDevice;
    }

    // define functions what common remote doing,
    // delegating commands to TV functions
    public void buttonFive() {
        // delegating to tv or dvd
        theDevice.buttonFive();
    }

    public void buttonSix() {

        theDevice.buttonSix();
    }

    public void deviceFeedBack() {
        theDevice.deviceFeedback();
    }

    // define abstsract funfunction for concrete remotes
    public abstract void centerButton();

}
