/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author vadimzubchenko
 */
public class Dvd extends AbstractDevice {

    public Dvd(int chapterNum, int maxChapter) {
        super();
        // define deviceState and maxSetting from chapterNum
        super.deviceState = chapterNum;
        super.maxSetting = maxChapter;

    }

    // implement functions of tvOne
    @Override
    public void buttonFive() {
        System.out.println("DVD Skips to Chapter");
        deviceState--;
    }

    @Override
    public void buttonSix() {
        System.out.println("DVD Skips to Next Chapter");
        deviceState++;
    }

}