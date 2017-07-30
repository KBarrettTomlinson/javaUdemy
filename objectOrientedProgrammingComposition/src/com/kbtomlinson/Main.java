package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// COMPOSITION
        // Has a relationship with as apposed to being a subset of
        // A computer HAS a motherboard, keyboard, and monitor

        // Composition is where you have another class as a property of a class.
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 in Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(1500,1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();




    }
}
