package com.kbtomlinson;

public class Main {

    // METHOD OVERLOADING - use the same method name but with different parameters

    public static void main(String[] args) {
	// write your code here
        int newScore;

        newScore = calculateScore("Keith", 750);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(750);
        System.out.println("New score is " + newScore);

        newScore = calculateScore();
        System.out.println("New score is " + newScore);

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter

        // You should validate that the first parameter feet is >= 0
        // You should validate that the second parameter inches is >= 0 and <= 12
        // return -1 from the method if either of the above is not true

        // If the parameters are valid, then calculate how many centimeters
        // comprise the feet and inches passed to this method and return that value.

        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that it is >= 0
        // return -1 if it is not true
        // But if it is valid, then calculate how many feet are in the inches and then call the other
        // overloaded method passing the correct feet and inches calculated so that it can calculate correctly.

        // 1 inch = 2.54 cm
        // 1 foot = 12 in

        double conversion;

        conversion = calcFeetAndInchesToCentimeters(750);
        System.out.println(conversion + "cm");

        conversion = calcFeetAndInchesToCentimeters(45, 5);
        System.out.println(conversion + "cm");

        conversion = calcFeetAndInchesToCentimeters(6,0);
        System.out.println(conversion + "cm");

        conversion = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println(conversion + "cm");

        conversion = calcFeetAndInchesToCentimeters(750);
        System.out.println(conversion + "cm");

        conversion = calcFeetAndInchesToCentimeters(750);
        System.out.println(conversion + "cm");

    }

    // In order to overload, we need to create a unique method signature. The unique method signature is determined
    // by the parameters

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && ((inches >= 0 && inches <= 12))) {
            return (((feet * 12) + inches) * 2.54);
        }
        return -1;

    } // ends calcFeetAndInchesToCentimeters

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            return calcFeetAndInchesToCentimeters((double)((int)(inches / 12)),inches % 12);
        }
        return -1;
    } // ends calcFeetAndInchesToCentimeters

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName+ " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1700;
    }

    public static int calculateScore() {
        System.out.println("No player name or score.");
        return 0;
    }


}
