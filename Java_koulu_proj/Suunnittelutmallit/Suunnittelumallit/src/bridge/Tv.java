/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public class Tv extends AbstractDevice {

    public Tv(int chanalState, int maxChanal) {
        super();
        this.deviceState = chanalState;
        this.maxSetting = maxChanal;

    }

    // implement functions of tvOne
    @Override
    public void buttonFive() {
        System.out.println("Chanal changes down.");
        deviceState--;
    }

    @Override
    public void buttonSix() {
        System.out.println("Chanal changes up.");
        deviceState++;
    }

}
