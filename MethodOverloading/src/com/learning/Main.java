package com.learning;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(600);
        calculateScore();
        double result = calcFeetAndInchesToCentimeters(6.0, 10.0);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(6.0, 0);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(7.0, 5.0);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(-10.0, 1);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(0, 1);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(6, -10);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(12.0);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(100);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(157);
        System.out.println(result);
        result = calcFeetAndInchesToCentimeters(-10);
        System.out.println(result);
    }

    private static int calculateScore() {
        System.out.println("No player name. No player score.");
        return 0;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double resultInches = inches + feet * 12;
            return resultInches * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int)inches / 12;
            int remainder = (int)inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainder);
        }

        return -1;
    }
}
