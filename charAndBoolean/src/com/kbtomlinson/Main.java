package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // CHAR AND BOOLEAN

        // Stores one letter or character
        // Has a width of 16 ( 2 bytes )
        // Using a unicode character
        char myChar = '\u00A9';
        System.out.println(myChar);

        // Boolean can only equal true or false
        // typically used for conditional logic
        boolean myBoolean = true;

        // Find the code for the registered symbol on the same line as the copyright symbol.
        // 00AE
        // Create a variable of type char and assign it to the unicode value for that symbol.
        char registrationSymbol = '\u00AE';
        // Display it on screen.
        System.out.println(registrationSymbol);


    }
}
