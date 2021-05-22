package com.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int currentNumber;

        while (true) {
            System.out.println("Enter a number");

            if (!scanner.hasNextInt()) {
                break;
            }

            currentNumber = scanner.nextInt();

            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }

            scanner.nextLine();
        }

        printMinMax(min, max);
    }

    public static void printMinMax(int min, int max) {
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No number has been entered.");
            return;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
