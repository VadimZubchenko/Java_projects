/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public abstract class AbstractDevice {

    // define common tv's properties

    public int maxSetting;
    public int deviceState;

    // define abstractions functions for concrete tvs
    public abstract void buttonFive();

    public abstract void buttonSix();

    // define common function for all tvs
    public void deviceFeedback() {

        if (deviceState > maxSetting || deviceState < 0) {
            deviceState = 0;
        }
        System.out.println("Device state: " + deviceState);
    };

}
