package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// Encapsulation Challenge
        // Create a class and demonstrate proper encapuslation techniques
        // the class will be called Printer
        // It will simulate a real COmputer Printer
        // It should have fields for the toner level, numb er of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the num ber of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        // Printer has
        // Toner
        // Pages Printed
        // Duplex

        TonerCartridge theTonerCartridge = new TonerCartridge(100);
        Printer thePrinter = new Printer(true, theTonerCartridge);
        thePrinter.isDuplexOn();
        thePrinter.setDuplexOn(true);
        thePrinter.checkTonerLevel();
        thePrinter.printJob(45);
        thePrinter.checkTonerLevel();
        thePrinter.getNumPagesPrinted();
        thePrinter.printJob(76);
        thePrinter.checkTonerLevel();
        thePrinter.getNumPagesPrinted();
        thePrinter.changeToner(350);
        thePrinter.changeToner(100);
        thePrinter.checkTonerLevel();

    }
}
