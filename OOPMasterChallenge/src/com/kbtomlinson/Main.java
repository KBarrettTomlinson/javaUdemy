package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// The purpose of the application is to help a ficticious company called Bills Burgers to manage their process
    // of selling hamburgers.

        // Our application will help Bill to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.

        // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills Store

        // The basic hamburger should have the following items.
            // Bread roll type
            // Meat
            // Up to 4 additions to be selected by the customer
        // This burger has a base Price and the additions are all seperately priced.

        // Create a hamburger class to deal with the above.
        // The Constructor will include the roll type, meat and price.

        // Create two extra varities of Hamburgers to cater for:

        // A) Healthy burger ( on a brown rye bread roll), plus 6 additions
        // B) Deluxe burger comes with chips, drink and the 4 additions

        // Hamburger HAS Additions
        // Healthy and Deluxe extends Hamburger

        Addition topping1 = new Addition("pickles", .50);
        Addition topping2 = new Addition("grilled onions", .75);
        Addition topping3 = new Addition("jalapenos", .75);
        Addition topping4 = new Addition("mustard", .25);

        Hamburger basicOrder = new Hamburger(topping1, topping2, topping3, topping4);
        System.out.println(basicOrder.getBurgerPrice());
        System.out.println(basicOrder.getTotalPrice());
        basicOrder.printOrder();

        Hamburger deluxeOrder = new Deluxe(topping1, topping2, topping3, topping4);
        System.out.println(deluxeOrder.getBurgerPrice());
        System.out.println(deluxeOrder.getTotalPrice());
        deluxeOrder.printOrder();
    }
}
