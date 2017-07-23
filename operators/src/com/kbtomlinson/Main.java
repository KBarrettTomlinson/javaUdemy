package com.kbtomlinson;

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

        int topScore = 75;
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
        if (topScore > secondTopScore && topScore < 100)
            // && and
            System.out.println("Greater than top score and less than 100");

        if (topScore > secondTopScore && topScore < 100)
            // && and
            System.out.println("Greater than top score and less than 100");
    }
}
