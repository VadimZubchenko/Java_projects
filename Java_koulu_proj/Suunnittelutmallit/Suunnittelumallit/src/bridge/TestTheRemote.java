/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public class TestTheRemote {

    public static void main(String[] args) {

        // abstract of remotes = concreteRemote(concreteDevice)
        Remotes tv = new RemotePause(new Tv(0, 10));
        Remotes tv2 = new RemoteMute(new Tv(0, 100));
        Remotes dvd = new RemoteDVD(new Dvd(0, 10));

        System.out.println("\nRemote on Dvd");

        dvd.buttonSix();
        dvd.buttonSix();
        dvd.buttonSix();

        dvd.buttonFive();
        dvd.buttonFive();

        dvd.deviceFeedBack();
        dvd.centerButton();

        System.out.println("\nTest TV with Mute");

        tv.buttonSix();
        tv.buttonSix();
        tv.buttonFive();
        tv.deviceFeedBack();
        tv.centerButton();

        System.out.println("\nTest TV with Pause");

        tv2.buttonSix();
        tv2.buttonSix();
        tv2.buttonSix();
        tv2.buttonSix();
        tv2.buttonSix();
        tv2.buttonFive();
        tv2.deviceFeedBack();
        tv2.centerButton();

    }

}
