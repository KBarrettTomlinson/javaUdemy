package com.timbuchalka;

import java.util.ArrayList;

/**
 * Created by dev on 2/10/2015.
 */
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i=0; i<maxGears; i++) {
            addGear(i, i* 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }


    // method used to access the inner class from the global class.
    public void addGear(int number, double ratio) {
        if((number >0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if((newGear>=0 ) && (newGear <this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // NESTED Class
    // Non static
    // Inner Class
    // Build a class like you would any other class.

    // A gear is not useful outside of the context of the gearbox.
    // Instance of gear has access to all of the properties and methods of the upper class
    // even those marked as private.

    // Special cases of inner classes
    // Local classes or anonymous classes

    // Local classes tend to be used less frequently.

    private class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
        // this refers to the inner class not the upper class
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs *( this.ratio);
        }
    }
}
