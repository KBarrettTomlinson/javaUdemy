package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// FOR STATEMENT or FOR LOOP
        System.out.println("10,000 at 2% Interest = " + calculateInterest(10000, 2));

        // for ( code initialized once at start of loop; at what point do we exit upon == false; expression invoked after each loop)

        // using the for statement, call the calculateInterest method with
        // the amount of 10_000 with an interestRate of 2 ... 8
        // and print the results to the console window.

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at "+i+"% Interest = " + String.format("%.2f", calculateInterest(10_000.0, (double) i)));
        } // ends for loop

        // how would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at "+i+"% Interest = " + String.format("%.2f", calculateInterest(10_000.0, (double) i)));
        } // ends for loop

        int count = 0;

        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)){
                System.out.println(i + " is a Prime Number");
                count ++;
            }

            if (count == 3) {
                System.out.println("You've listed 3 Prime Numbers!");
                break;
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate) / 100);
    } // ends calculateInterest

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
