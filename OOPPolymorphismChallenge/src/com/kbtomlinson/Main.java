package com.kbtomlinson;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine(){
        System.out.println("An engine has started");
    }

    public void accelerate(){
        System.out.println("a car has accelerated");
    }

    public void brake(){
        System.out.println("a car has slowed down");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Porsche extends Car{
    public Porsche(){
        super(24, "Porsche");
    }

    @Override
    public void startEngine() {
        System.out.println("A " + getName() + " has started its engine");
    }

    @Override
    public void accelerate() {
        System.out.println("A " + getName() + " has accelerated");
    }

    @Override
    public void brake() {
        System.out.println("A " + getName() + " has slowed down.");
    }
}



public class Main {

    public static void main(String[] args) {
	// Plymorphism challenge

        //Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // Engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
        // Cylinders and names would be passed parameters.

        // Create the appropriate getters

        // Create some methods like startEngine, accelerate, and brake

        // Show a message for each in the base class
        // Now create 3 sub classes foryour favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // Pul all classes in the one java file.

        Porsche porsche = new Porsche();
        Car aCar = new Car(7, "just a generic fucking car");

        porsche.accelerate();
        aCar.accelerate();
    }
}
