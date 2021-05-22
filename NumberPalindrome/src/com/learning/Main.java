package com.learning;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
        System.out.println((isPalindrome(1245421)));
        System.out.println(isPalindrome(-9889));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        if (number < 10) return false;

        int lastDigit;
        int reverse = 0;
        int workingNumber = number;
        do{
            lastDigit = workingNumber % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            workingNumber = workingNumber / 10;
        }while (workingNumber >= 0.1);

        return reverse == number;
    }
}
