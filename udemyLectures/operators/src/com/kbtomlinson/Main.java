package com.kbtomlinson;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //OPERATORS and OPERANDS


        // Mathematical Operators
        int result = 1 + 2;
        // equal
        // plus

        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        // equal
        // subtract

        System.out.println(result);

        previousResult = result;

        result = result * 10;
        // equal
        // multiplication

        System.out.println(result);
        previousResult = result;

        result = result / 5;
        // equal
        // division

        System.out.println(result);
        previousResult = result;

        result = result % 3;
        // equal
        // modulo or remainder

        System.out.println(result);
        previousResult = result;

        result++;
        // increment by 1

        System.out.println(result);
        previousResult = result;

        result--;
        // decrease by 1

        System.out.println(result);
        previousResult = result;

        result += 2;
        // result = result + 2

        System.out.println(result);
        previousResult = result;

        result *= 10;

        System.out.println(result);
        previousResult = result;

        result -= 10;

        System.out.println(result);
        previousResult = result;

        result /= 3;

        System.out.println(result);
        previousResult = result;


        // IF THEN Statements

        boolean isAlien = false;
        if (isAlien == true)
            // == is equal to
            System.out.println("It is not an alien!");

        int topScore = 95;
        if (topScore != 100)
            // != is not equal to
            System.out.println("You Got the High Score!");

        if (topScore > 100)
            // > is greater than
            System.out.println("You Got the High Score!");

        if (topScore >= 100)
            // >= is greater than or equal to
            System.out.println("You Got the High Score!");

        if (topScore < 100)
            // < is less than
            System.out.println("You Got the High Score!");

        if (topScore <= 100)
            // < is less than or equal to
            System.out.println("You Got the High Score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            // && and
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            // || or
            System.out.println("One of these tests is true");

        //CAUTION
        boolean isCar = false;
        if(isCar = true)
            System.out.println("This is not supposed to happen!");
            System.out.println("But it is happening because we are redefining isCar to true.");

        // for booleans you can do this:
        if(isCar)
            System.out.println("This is working nicely.");

        // ternary
        boolean wasCar = isCar ? true : false;
        // if is car is equal to true, the return true otherwise return false
        System.out.println(wasCar);

        // LIST OF OPERATORS nuts and bolts ops summary oracle < --- google

        // EXERCISE
        // Create a double variable with the value 20
        double firstValue = 20d;

        // Create a second variable of type double with the value 80
        double secondValue = 80d;

        // Add both numbers up and multiply by 25
        double firstComputation = (firstValue + secondValue) * 25d;
        System.out.println(firstComputation);

        firstComputation = firstValue + secondValue * 25d;
        System.out.println(firstComputation);

        // Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        double secondComputation = firstComputation % 40d;

        // Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less.

        if (secondComputation <= 20d)
            System.out.println("Total was over the limit");

    }
}
