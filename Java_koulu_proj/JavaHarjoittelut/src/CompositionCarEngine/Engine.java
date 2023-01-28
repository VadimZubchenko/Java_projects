package CompositionCarEngine;

// Java program,which illustrates a 
// difference between Aggregation 
// Composition. 
import java.io.*;

// Engine class, which will 
// be used by car. So 'Car' 
// class will have a field 
// of Engine type. 
class Engine {
    // starting an engine. 

    public void work() {

        System.out.println("Engine of car has been started ");

    }

}

// Car class 
final class Car {

    /* 
           In order to get a car moving, 
           it need to have a engine. 
           Here's field of Engine type. 
     */
    // private final Engine engine; // Composition "part of"
    // private Engine engine; // Aggregation "has a"
    private final Engine engine; //final keyword makes Composition relation between car and engine
    // private Engine engine;	 // Aggregation 

    // one parameter's constructor of class Car 
    Car(Engine engine) {
        this.engine = engine;
    }

    //car start moving by starting engine 
    public void move() {

        //if(engine != null) 
        {
            engine.work();
            System.out.println("Car is moving ");
        }
    }
    //this method works, just when Engine engine has not a final keyford

    public void setEngine(Engine engine2) {
        // this.engine = engine2;
    }
}
//Class GFG has only one method Main in JAVA.

class GFG {

    public static void main(String[] args) {

        // making an engine by creating 
        // an instance of Engine class. 
        Engine engine = new Engine();

        // let's make a car with engine. 
        // so we are passing a engine 
        // instance as an argument while 
        // creating instace of Car. 
        Car car = new Car(engine);
        car.move();

        //we can't change the engine to another one, 
        //because of final keyword, which makes it non-changeable and 
        //so makes composition relation between car and engine objects.
        /*
                Engine engine2 = new Engine();
                car.setEngine(engine2);
                car.move();
         */
    }
}
