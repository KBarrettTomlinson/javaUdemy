package com.kbtomlinson;

public class HybridCar extends Car{

        private double hybridBattery;
        private boolean engineOn;

    // Constructors

    public HybridCar(String steering, String power, double height, double width, double length, int wheels, int gears,
                     String currentGear, int battery, String engine, double currentSpeed, double hybridBattery) {
        super(steering, power, height, width, length, wheels, gears, currentGear, battery, engine, currentSpeed);
        this.hybridBattery = hybridBattery;
        this.engineOn = false;
    }


    // Methods

    // Ingition

        // Turn Engine On
        public void turnEngineOn(){
            engineOn = true;
        }
        // Turn Engine Off
        public void turnEngineOff(){
            engineOn = false;
        }

    // Getters
}
