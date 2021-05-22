package com.learning;

public class Main {

    public static void main(String[] args) {
        for (int i=2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, (double) i)));
        }

        for (int i=8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, (double) i)));
        }

        System.out.println("************************************");
        int count = 0;
        for (int i = 10; i < 50; i++){
            if (PrimeNumber.isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }

            if (count == 10) break;
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
