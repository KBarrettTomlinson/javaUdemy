package com.kbtomlinson;


// STATEMENT TO CREATE A NEW CLASS CALLED CAR

// Public is an access modifier. Public, Private, Protected.
public class Car {

    // variables
    // local variable - local to or belong to a method or code block
    // classes allow us to create variable which are visible to the object
    // class, member variables are known as fields.

    // encapsulation means that all of our fields will be private to the class

    // creating fields for our class Car
    // state or characteristic componants
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // creating a method for Car class

    // This is a setter!
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    // This is a getter!
    public String getModel() {
        return this.model;
    }


}
