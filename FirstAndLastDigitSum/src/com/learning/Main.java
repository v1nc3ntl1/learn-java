package com.learning;

public class Main {

    public static void main(String[] args) {
        int number = sumFirstAndLastDigit(865);
        System.out.println("sum of 865 is " + number);
        number = sumFirstAndLastDigit(9);
        System.out.println("sum of 9 is " + number);
        number = sumFirstAndLastDigit(-1);
        System.out.println("sum of -1 is " + number);
        number = sumFirstAndLastDigit(79525);
        System.out.println("sum of 79525 is " + number);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        if (number < 10) return number * 2;

        int lastNumber = number % 10;
        System.out.println("last number =" + lastNumber);
        int firstNumber = number;

        while (firstNumber >= 10) {
            firstNumber = firstNumber / 10;
        }

        System.out.println("first number = " + firstNumber);
        return firstNumber + lastNumber;
    }
}
