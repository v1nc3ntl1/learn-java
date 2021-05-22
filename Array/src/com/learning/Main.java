package com.learning;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = new int[10];
        double[] myDoubleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myDoubleArray[5]);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] myArray) {
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        return (double) sum / (double) myArray.length;
    }
}
