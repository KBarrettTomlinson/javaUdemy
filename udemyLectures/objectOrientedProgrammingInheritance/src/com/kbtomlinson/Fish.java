package com.kbtomlinson;

public class Fish extends Animal {
    // properties
    private int gills;
    private int eyes;
    private int fins;

    // constructor
    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // method
    private void rest () {

    }

    private void moveMuscles() {
        System.out.println("moving muscles");
    }

    private void moveBackFin() {
        System.out.println("moving backfin");
    }

    public void swim() {
        moveMuscles();
        moveBackFin();
        System.out.println("swimming");
        move(2);
    }


    // getters

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
