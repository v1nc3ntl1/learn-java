package com.learning;

public class Main {

    public static void main(String[] args) {
	    double va1 = 20.0;
	    double va2 = 80.0;

        double result = (va1 + va2) * 100.0;
        double remainder = result % 40.0;

        boolean myBoolean = remainder == 0;

        System.out.println("myBoolean value is " + myBoolean);

        if (!myBoolean){
            System.out.println("Got remainder");
        }
    }
}
