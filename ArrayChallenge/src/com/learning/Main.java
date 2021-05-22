package com.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfElement = 6;
        System.out.println("Enter " + numberOfElement + " number of integer: ");
        var myArray = getIntegers(numberOfElement);
        sortArrayDescending(myArray);
    }

    public static int[] getIntegers(int numberOfElement) {
        int[] array1 = new int[numberOfElement];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        return array1;
    }

    public static void printArrays(int[] array1){
        for (int i =0; i <array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    public static void sortArrayDescending(int[] array1){
        boolean allPass;
        int temp;
        //int[] sortedArray = new int[array1.length];

        //for (int i =0; i < array1.length; i++){
        //    sortedArray[i] = array1[i];
        //}
        int[] sortedArray = Arrays.copyOf(array1, array1.length);

        do{
            allPass = true;
            for (int i=0; i< sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    allPass = false;
                }
            }
        }while (!allPass);

        printArrays(sortedArray);
    }
}
