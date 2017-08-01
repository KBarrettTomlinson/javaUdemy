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

//        thePC.getMonitor().drawPixelAt(1500,1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

    // COMPOSITION Challenge

        // Create a single room of a house using composition
        // This about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter
        // and then that object's public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video

        // PLANNING

        // Bathroom HAS
        // Sink
        // Shower
        // Toilet
        // Towel Rack
        // Closet

        // Bathroom CAN
        // Clean bathroom

        Sink aSink = new Sink(false, "bob");
        Shower aShower = new Shower(false, "tim");

        Bathroom theBathrooom = new Bathroom(aSink, aShower);
        theBathrooom.cleanBathroom();
        theBathrooom.getTheSink().turnOn();

    }
}
