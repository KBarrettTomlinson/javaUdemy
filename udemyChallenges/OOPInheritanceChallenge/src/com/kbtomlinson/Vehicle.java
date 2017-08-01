package com.kbtomlinson;

public class Vehicle {
    // Properties
        // Steering
        // Power
        // Height
        // Width
        // Length

        private String steering;
        private String power;
        private double  height;
        private double width;
        private double length;

    // Constructors

        public Vehicle(String steering, String power, double height, double width, double length) {
            this.steering = steering;
            this.power = power;
            this.height = height;
            this.width = width;
            this.length = length;
        }


    // Methods
        // Movement
        public void move(){
            System.out.println("The vehicle is now moving");
        }

    // Getters

    public String getSteering() {
            return steering;
        }

        public String getPower() {
            return power;
        }

        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }
}
