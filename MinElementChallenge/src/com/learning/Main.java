package com.learning;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of element: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] myArray = readIntegers(count);

        System.out.println("The min value is " + findMin(myArray));
    }

    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Enter an integer: ");
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return myArray;
    }

    public static int findMin(int[] array1) {
        int min = array1[0];

        for (int i=1; i < array1.length ; i++){
            if (array1[i] < min){
                min = array1[i];
            }
        }

        return min;
    }
}
