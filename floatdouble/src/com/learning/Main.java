package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float minfloatValue = Float.MIN_VALUE;
        float maxfloatValue = Float.MAX_VALUE;
        System.out.println("min float value = " + minfloatValue);
        System.out.println("max float value = " + maxfloatValue);

        double mindoubleValue = Double.MIN_VALUE;
        double maxdoubleValue = Double.MAX_VALUE;
        System.out.println("min double value = " + mindoubleValue);
        System.out.println("max double value = " + maxdoubleValue);

        int myInt = 5/3;
        float a = 5f / 3f;
        double b = 5.00 / 3.00;
        System.out.println(myInt);
        System.out.println(a);
        System.out.println(b);
    }
}
