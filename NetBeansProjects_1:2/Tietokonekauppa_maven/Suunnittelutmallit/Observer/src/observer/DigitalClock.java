/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * tower
 * @author vadimzubchenko
 */
public class DigitalClock implements Observer {

    // tallentaa tilan, jonka pitä olla yhdenmukainen subjektin tilan kanssa. 
    private int hour;
    private int minute;
    private int second;
    //Muuttuja joka reservoi tilaa ClockTiemr tyyppiselle obkjektilee 
    //Sisältä viitteen konkrettiseen subjektiin ClockTimer
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        // ct(saatu clockTimer konstruktorin kautta)
        timer = ct;
        //"Hei, rekisteröimisen jälkeen voit saada data clocktimer-oliosta(subject)
        //Huom!Observable-API kautta ei suoraan  "
        //rekisteröidaan DigitalClock-observer subjectille clockTimer(Observable-API)
        timer.addObserver(this);

    }

    // observer API määrittelee päivistysrajapinnan DigitalClosk-oliolle
    // ja niin se saa datan clocktimer-oliosta(subject)
    //Huom! datan saapuu  Observable-API kautta, eikä suoraan clocktimer-oliosta
    @Override
    public void update(Observable o, Object arg) {
        if (o == timer) {
            draw();
        }
    }

    private void draw() {
        this.hour = timer.getHour();
        this.minute = timer.getMinute();
        this.second = timer.getSecond();

        System.out.println("Current Local Time in Helsinki \n" + hour + " : " + minute + " : " + second);

    }

}
