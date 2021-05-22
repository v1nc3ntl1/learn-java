package com.learning;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        int previousInt = 0;
        for (int i = 1; i < n; i++) {
            sum += (previousInt + i);
            previousInt = previousInt + i;
            System.out.println(previousInt);
        }

        return sum;
    }

    public static int factorial(int n) {
        if (n == 0){
            return 1;
        }

        int sum = 0;
        int current;
        for (int i = 1; i <= n; i++) {
            current = 1;
            for (int j = 1; j <= i; j++) {
                current *= j;
            }
            //System.out.println("Current element is " + current);
            sum += current;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if (n ==0){
            return 0;
        }else if (n == 1){
            return 1;
        }

        int sum = 0;
        int current = 0;
        int firstPrevious = 1;
        int secondPrevious = 0;
        for (int i = 1; i <= n; i++) {
            current = firstPrevious + secondPrevious;
            System.out.println("current is " + current);
            firstPrevious=secondPrevious;
            secondPrevious = current;
            sum += current;
        }
        return sum;
    }
}
