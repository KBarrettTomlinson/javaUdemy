package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// INHERITANCE

        Animal animal = new Animal(1,1, 5, 5, "Animal");
        Dog dog = new Dog(8, 20, "yorkie", 2, 4, 1, 20, "long and silky");

        dog.eat();
        dog.move();


    }
}
