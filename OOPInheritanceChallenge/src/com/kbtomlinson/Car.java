package com.kbtomlinson;

public class Car extends Vehicle {
    // Properties

        private int wheels;
        private int gears;
        private String currentGear;
        private int battery;
        private String engine;
        private double currentSpeed;
        private boolean vehicleOn;

    // Constructors

        public Car(String steering, String power, double height, double width, double length, int wheels,
                   int gears, String currentGear, int battery, String engine, double currentSpeed) {
            super(steering, power, height, width, length);
            this.wheels = wheels;
            this.gears = gears;
            this.currentGear = currentGear;
            this.battery = battery;
            this.engine = engine;
            this.currentSpeed = currentSpeed;
            this.vehicleOn = false;
        }

    // Methods
        // Movement

        @Override
        public void move() {
            System.out.println("your car is moving at this current speed:" + currentSpeed);
            super.move();
        }

            // Increase Speed
                public  void increaseSpeed(double incriment){
                    System.out.println("Your car speed has been increased by: " + incriment);
                    currentSpeed += incriment;
                    move();
                }
            // Decrease Speed
                public  void decreaseSpeed(double incriment){
                    System.out.println("Your car speed has been decreased by: " + incriment);
                    currentSpeed += incriment;
                    move();
                }


        // Ingition
            // Turn On
                public  void turnOn(){
                    vehicleOn = true;
                }
            // Turn Off
                public void turnOff(){
                    vehicleOn = false;
                }

    // Getters

        public int getWheels() {
            return wheels;
        }

        public int getGears() {
            return gears;
        }

        public String getCurrentGear() {
            return currentGear;
        }

        public int getBattery() {
            return battery;
        }

        public String getEngine() {
            return engine;
        }

        public double getCurrentSpeed() {
            return currentSpeed;
        }

        public boolean isVehicleOn() {
            return vehicleOn;
        }
}
