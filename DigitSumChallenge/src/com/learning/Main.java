package com.learning;

public class Main {

    public static void main(String[] args) {
        int sum = sumDigits(32159);
        System.out.println("sum = " + sum);
        System.out.println("************************");
        sum = sumDigits(821);
        System.out.println("sum = " + sum);
        System.out.println("************************");
        sum = sumDigits(125);
        System.out.println("sum = " + sum);
        System.out.println("************************");
        sum = sumDigits(111);
        System.out.println("sum = " + sum);
        System.out.println("************************");
        sum = sumDigits(42);
        System.out.println("sum = " + sum);
        System.out.println("************************");
        sum = sumDigits(99);
        System.out.println("sum = " + sum);
        System.out.println("************************");
        sum = sumDigits(9);
        System.out.println("sum = " + sum);
        System.out.println("************************");
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) return -1;

        int leastSignificantDigit = 0;

        do {
            leastSignificantDigit = number % 10;
            sum += leastSignificantDigit;

            number = number / 10;

            System.out.println("remaining = " + number);
        } while (number > 0.1);

        return sum;
    }
}
