package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// WHILE and DO WHILE Statements


        //While

        int count = 0;
        while(count != 5){
            System.out.println("Count value is " + count);
            count ++;
        }

        // this is the same as above
        count = 0;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }

        // do While makes certain that it will execute at least once

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count ++;
        } while(count != 5);

        // Create a method called isEveNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method
        // is an even number or not
        // return true if an even number, otherwise return false

        int number = 5;
        int finishNumber = 20;

        while (number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number ++;
                // continue -  stop where you are, but don't stop looping
                // break = stop where you are, and stop looping
                continue;
            }

            System.out.println("Even number " + number);
            number ++;
        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        number = 5;
        finishNumber = 25;

        int evenCount = 0;
        int evenCountBreakPoint = 5;

        while (number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number ++;
                // continue -  stop where you are, but don't stop looping
                // break = stop where you are, and stop looping
                continue;
            }
            evenCount ++;
            System.out.println("Even number " + number);
            if (evenCount == evenCountBreakPoint) {
                break;
            }
            number ++;
        }

        System.out.println("You counted " + evenCount + " even numbers!");

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    } // ends isEvenNumber
}


