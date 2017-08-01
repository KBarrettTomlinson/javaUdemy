package com.kbtomlinson;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // if keyword

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // Code Block --> {} is not required if we only have one line of executable code after the if conditional
        if (score == 5000) {
           System.out.println("Your score was 5000");
        }

        if (score == 5000)
            System.out.println("See this thing ran too");

        // using code blocks can make the code more clear and easier to understand

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else if (score == 5000) {
            System.out.println("Your score was 5000");
        } else {
            System.out.println("Your score was greater than 5000");
        }

        // In the code below, finalScore is in the scope of the code block
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // level completed set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean gameOver2 = true;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver2) {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore);
        }


        // uses the memory more efficiently but is violating DRY
        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
