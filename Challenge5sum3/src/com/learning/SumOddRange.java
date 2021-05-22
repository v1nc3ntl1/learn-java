package com.learning;

public class SumOddRange {
    public static boolean isOdd(int number){
        if (number < 1) return false;

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if (end < start) return -1;
        if (start < 0 || end < 0) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sum +=i;
            }
        }
        return sum;
    }
}
