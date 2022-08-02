/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obsrvrMeteoSt;

/**
 *
 * @author vadimzubchenko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // luodaan uuden clocktimer-olion (subject)
        ClockTimer clockTimer = new ClockTimer();

        //luodaan digiClock-olion(observerin konkrettinen luokka) ja 
        //rekisteröidään sen subjectille kostrukrorin kautta, jossa on timer.addObserver()
        DigitalClock digiClock = new DigitalClock(clockTimer);

        // käynistetään clocktimer-olion (subject)
        new Thread(clockTimer).start();
    }
    

}
