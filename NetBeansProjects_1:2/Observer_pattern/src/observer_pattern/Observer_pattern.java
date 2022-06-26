/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

/**
 *
 * @author vadimzubchenko
 */
public class Observer_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Enter Text: ");
        var eventSource = new EventSource();
        
        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
    
}
