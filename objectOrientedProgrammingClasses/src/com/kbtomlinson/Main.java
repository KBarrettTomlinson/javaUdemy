package com.kbtomlinson;

// THIS IS A STATEMENT WHICH CREATES A NEW CLASS IN JAVA
public class Main {

    public static void main(String[] args) {
	// Object Orientated Programming - CLASSES

        // objects have
        //  state
        //  behavior

        // Class is template for creating an object

        // Basic/Primitive data types are limited
        // Classes are similar to a custom, user defined data type

        // Instantiating an object based on a class
        Car porsche = new Car();
        Car holden = new Car();

        // All defined classes inherit certain methods from the java class
        // Null is the internal default state for a class and a string

        System.out.println("The model of this object is: " + porsche.getModel());

        porsche.setModel("Carrera");

        holden.setModel("Caulfield");

        System.out.println("The model of this object is: " + porsche.getModel());
        System.out.println("The model of this object is: " + holden.getModel());

        // We use getters and setters because this allow us to add data validation within the classes

        

    }
}


