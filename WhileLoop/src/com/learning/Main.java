package com.learning;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number);

        }
        System.out.println("******************");

        number = 4;
        finishNumber = 20;
        int count = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number);
            count++;
            if (count == 5){
                break;
            }
        }

        System.out.println("found " + count);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
