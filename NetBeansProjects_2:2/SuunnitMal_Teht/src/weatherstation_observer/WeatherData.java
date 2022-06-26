/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation_observer;

import java.util.LinkedList;
import java.util.List;

/**
 *Subject, Nabljudatel, Datchik za oknom.
 * @author vadimzubchenko
 */
class WeatherData implements Observable {
    // - subjectState (attributes)
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private int pressure;
    
    public WeatherData() {
        observers = new LinkedList<>();
    }
    // Get State (attributes)
    public void setMeasurements(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //NotifyObservers kutsuu Observablesta update-metodia
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    //NotifyObservers kutsuu Observablesta update-metodia
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);// update-metodi
        }
    }

}
