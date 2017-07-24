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

        int highScore;

        // methods allow us to execute one block of code multiple time

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 1200, 16, 300);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table."

        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is  > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Keith", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Sean", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Connar", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Cooper", position);

    }

    // Cannot put a method inside another method, so the new one goes down here.
    // Returning a value makes use of the void keyword
    // void means "do not return anything"
    // if we are returning something then we will use the datatype of the return value

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }

    } // ends calculateScore

    // void methods are also refered to as a procedure
    public static void displayHighScorePosition (String name, int position) {
        // diplays String with name and position
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    } // ends displayHighScorePosition

    public static int calculateHighScorePosition (int score) {
        // calculates position based on score then returns position
        if (score > 1000) {
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
