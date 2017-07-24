package com.kbtomlinson;

public class Main {

    // HI, I'm a method
    public static void main(String[] args) {
	// write your code here

        // METHODS

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        // methods allow us to execute one block of code multiple time

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 1200, 16, 300);

    }

    // Cannot put a method inside another method, so the new one goes down here.
    // Returning a value makes use of the void keyword
    // void means "do not return anything"
    // if we are returning something then we will use the datatype of the return value

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
        
    } // ends calculateScore
}
