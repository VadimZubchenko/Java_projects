package CompositionCarEngine;

// Java program to illustrate the 
// difference between Aggregation 
// Composition. 

import java.io.*; 

// Engine class which will 
// be used by car. so 'Car' 
// class will have a field 
// of Engine type. 
class Engine 
{ 
	// starting an engine. 
	public void work() 
	{ 
		
		System.out.println("Engine of car has been started "); 
		
	} 
	
} 

// Engine class 
final class Car 
{ 
	
	/* 
           For a car to move, 
           it need to have a engine. 
           Here's field of Engine type. 
        */
	private final Engine engine; // Composition 
	// private Engine engine;	 // Aggregation 
	// constructor of class Car
	Car(Engine engine) 
	{ 
		this.engine = engine; 
	} 

        // car start moving by starting engine 
	public void move() 
	{ 
		
		//if(engine != null) 
		{ 
			engine.work(); 
			System.out.println("Car is moving "); 
		} 
	} 
} 

class GFG 
{ 
	public static void main (String[] args) 
	{ 
		
		// making an engine by creating 
		// an instance of Engine class. 
		Engine engine = new Engine(); 
		
		// Making a car with engine. 
		// so we are passing a engine 
		// instance as an argument while 
		// creating instace of Car. 
		Car car = new Car(engine); 
		car.move(); 
                
                // Now we're trying to change the engine to another one
                //Engine engine2 = new Engine();
                //car.setEngine(engine2);
                //car.move();
		
	} 
} 


