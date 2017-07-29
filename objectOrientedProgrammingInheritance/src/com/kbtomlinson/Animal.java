package com.kbtomlinson;

public class Animal {

    // properties
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    // constructor
    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    // methods
    public void eat() {
        System.out.println("eating");
    }

    public void move() {
        System.out.println("moving");
    }

    //getters
    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }


}
