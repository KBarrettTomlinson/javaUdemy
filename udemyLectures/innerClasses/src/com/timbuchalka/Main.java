package com.timbuchalka;

import java.util.Scanner;

public class Main {

    //Nested classes
    // Static
    // Non-static Inner Class
    // Local Class Inner Class defined inside a scope block
    // Anonymous Class - no name

    // This requires the inner class to be public, but typically we wouldn't want to do that.
    // Instead we would create new gears as a part of the instantiation of the main class Gearbox
    // In order to add gears, we would actually just add a method instead.

        // Gearbox newGearbox = new Gearbox(6);
        // Gearbox.Gear first = newGearbox.new Gear(2, 23); // instantiating an inner Class


    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {


        // using a global class utilizing a localized inner class called GEAR inside of the Gearbox class
        Gearbox newGearbox = new Gearbox(6);
        newGearbox.addGear(1, 5.3);
        newGearbox.addGear(2, 10.6);
        newGearbox.addGear(3, 15.9);
        newGearbox.operateClutch(true);
        newGearbox.changeGear(1);

            // declaring local class inside the main but is localized to the scope of this method
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());


        // anonymous classes must be declared and constructed in line.

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
