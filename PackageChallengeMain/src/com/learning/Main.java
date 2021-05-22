package com.learning;

public class Main {

    public static void main(String[] args) {
        int sum = Series.nSum(10);
        System.out.println(sum);

        System.out.println("******************************");

        sum = Series.factorial(1);
        System.out.println(sum);

        System.out.println("******************************");
        sum = Series.fibonacci(10);
        System.out.println(sum);
    }
}
