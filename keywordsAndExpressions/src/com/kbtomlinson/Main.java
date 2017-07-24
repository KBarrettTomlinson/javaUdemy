package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //KEYWORDS and EXPRESSIONS

        // Java has 50 reserved keywords
        // package public class static void.... anything in orange.
        // list of java keywords wiki

        // it would not be allowed for us to create a variable called int
        // int int = 5;

        // Expressions
        // Expressions are building blocks of all java programs

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);

        // in the above example the expression is kilometers = (100 * 1.609344)

        if (kilometers == 50) {
            System.out.println("This is an expression");
        }

        // kilometers == 50 is an expression
        // ("This is an expression") oddly, is also an expression

        // In the following code that I will type below, write down what parts of the code
        // are expressions.

        int score = 100;
        // score = 100
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
        // score > 99
        // "You got the high score!"
        // score = 0

    }
}
