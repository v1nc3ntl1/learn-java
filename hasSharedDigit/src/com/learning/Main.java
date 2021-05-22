package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSharedDigit(int a, int b){
        if (a < 10 || a > 99) return false;

        int start = a;
        int end = b;
        while (start / 10 > 0){
            int digit = start % 10;

            while (b > 0){
                int innerDigit = end
                if ()
                end = end / 10
            }

            start = start / 10;
        }
    }
}
