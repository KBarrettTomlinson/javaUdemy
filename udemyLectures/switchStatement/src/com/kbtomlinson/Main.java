package com.kbtomlinson;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
	// SWITCH STATEMENTS
        // if statements
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        // switch statement
        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("In fact, it specifically was: " + value);
                break;

            default:
                System.out.println("Value was not 1 or 2 or 3 or 4 or 5");
                break;
        } // ends switch statement

        // Switch and If statements are a matter of style
        // Switch only tests against one variable where if can include multiple values

        // Create a new switch statementusing char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char characterTest = 'B';

        switch (characterTest) {
            case 'A':
                System.out.println("Char value was A" );
                break;

            case 'B':
                System.out.println("Char value was B" );
                break;

            case 'C':
                System.out.println("Char value was C" );
                break;

            case 'D':
                System.out.println("Char value was D" );
                break;

            case 'E':
                System.out.println("Char value was E" );
                break;

            default:
                System.out.println("Char value was something other than A B C D or E");
        } // end switch statement

        String month = "janUaRY";

        // here we are running the toLowerCase method on the string
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "february":
                System.out.println("Feb");
                break;

            case "march":
                System.out.println("Mar");
                break;

            default:
                System.out.println("Your month is not in the first quarter of the year");
                break;
        } // end switch statement


    }
}
