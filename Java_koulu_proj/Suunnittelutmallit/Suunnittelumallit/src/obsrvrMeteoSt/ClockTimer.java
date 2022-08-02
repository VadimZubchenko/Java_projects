/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsrvrMeteoSt;

import java.util.GregorianCalendar;
import java.util.Observable;

/**
 * meteostation
 *
 * @author vadimzubchenko
 */
public class ClockTimer extends Observable implements Runnable {

    //Tallentaa tilan, josta konkrettinen observeri(DigitalClock) on kiinstunut.
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void run() {
        while (true) {
            tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // tikck() päivittää ClockTimerin sisäisen tilan(day,minute ja second)
    // ja kutsu notify() metodia
    void tick() {

        GregorianCalendar gregorinkalenteri = new GregorianCalendar();

        this.hour = gregorinkalenteri.get(GregorianCalendar.HOUR_OF_DAY);
        this.minute = gregorinkalenteri.get(GregorianCalendar.MINUTE);
        this.second = gregorinkalenteri.get(GregorianCalendar.SECOND);
        //Marks this Observable object as having been changed; 
        //the hasChanged method will now return true.
        setChanged();
        // If this object has changed, as indicated by the hasChanged method, then notify all of its observers 
        //and then call the clearChanged method to indicate that this object has no longer changed
        //konkrttinen subjekti ilmoittaa observerelle tilansa muutoksesta
        notifyObservers();//NotifyObservers kutsuu Observablesta update-metodia
    }

}
