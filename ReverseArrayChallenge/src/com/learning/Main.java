package com.learning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {3, 1, 4, 8, 7, 9};

        System.out.println(Arrays.toString(myArray));

        System.out.println("***************************************");
        reverse(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }

    public static void reverse(int[] array1) {
        int numberOfLoop = array1.length / 2;

        int temp;
        for (int i = 0; i < numberOfLoop; i++) {
            temp = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = temp;
        }
    }
}
