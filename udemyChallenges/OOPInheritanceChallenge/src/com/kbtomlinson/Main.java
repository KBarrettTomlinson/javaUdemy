package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// Inheritance Challenge

        // Challenge:

        // Start with a base class of Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inhertis from the Car class.

        // You should be able to handle steering, changing gears, and moving.
        // You will want to decide where to put the appropriate state and behaviors.
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.

        HybridCar mariner = new HybridCar("wheel", "Awesome", 34, 45, 23, 4, 5, "Neutral",
                450, "Super", 0, 434);

        mariner.turnEngineOn();
        mariner.increaseSpeed(45);
        mariner.decreaseSpeed(12);

    }
}
