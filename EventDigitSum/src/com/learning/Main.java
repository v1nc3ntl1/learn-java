package com.learning;

public class Main {

    public static void main(String[] args) {
        int number = getEvenDigitSum(24);
        System.out.println(number);
        number = getEvenDigitSum(123456789);
        System.out.println(number);
        number = getEvenDigitSum(-1);
        System.out.println(number);
        number = getEvenDigitSum(8);
        System.out.println(number);
    }

    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;

        int currentNumber;
        int sum = 0;

        do{
            currentNumber = number % 10;

            if (currentNumber % 2 ==0)
            {
                sum += currentNumber;
            }

            number = number / 10;

        }while (number >= 1);

        return sum;
    }
}
