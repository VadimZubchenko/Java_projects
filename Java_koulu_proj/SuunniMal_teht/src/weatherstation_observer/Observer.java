/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation_observer;

/**
 *
 * @author vadimzubchenko
 */
public interface Observer {
    void update (float temperature, float humidity, int pressure);
}
