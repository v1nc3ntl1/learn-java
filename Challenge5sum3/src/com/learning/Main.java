package com.learning;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        int count=0;
	    for (int i = 1; i < 1001; i++) {
	        if (i % 3 == 0 && i % 5 ==0) {
                System.out.println(i);
                count++;
	            sum+=i;
            }

	        if (count == 5){
	            break;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("********************************");

        int a = SumOddRange.sumOdd(1, 100);
        System.out.println(a);
        a = SumOddRange.sumOdd(-1, 100);
        System.out.println(a);
        a = SumOddRange.sumOdd(100, 100);
        System.out.println(a);
        a = SumOddRange.sumOdd(13, 13);
        System.out.println(a);
        a = SumOddRange.sumOdd(100, -100);
        System.out.println(a);
        a = SumOddRange.sumOdd(100, 1000);
        System.out.println(a);
    }
}
