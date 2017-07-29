package com.kbtomlinson;

public class Dog extends Animal {

    // properties
        private int eyes;
        private int legs;
        private int tail;
        private int teeth;
        private String coat;

    // constructor
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        // super is the class that this one is inheriting from
        // initialized the basic properties of the animal class
        // here we add default values where we can
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // overriding methods

    @Override
    public void eat() {
        System.out.println("Dog eat is called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("dog is chewing");
    }

}
