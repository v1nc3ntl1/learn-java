package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Vincent", score);
        score = calculateHighScorePosition(1000);
        displayHighScorePosition("John", score);
        score = calculateHighScorePosition(900);
        displayHighScorePosition("Lion", score);
        score = calculateHighScorePosition(500);
        displayHighScorePosition("Alucard", score);
        score = calculateHighScorePosition(100);
        displayHighScorePosition("Basha", score);
        score = calculateHighScorePosition(50);
        displayHighScorePosition("Maiden", score);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) {
            return 1;
        } else if (score >= 500){
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;
    }
}
