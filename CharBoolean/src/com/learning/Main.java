package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char b = '\u0044';
        System.out.println(b);
        char copywrite = '\u00A9';
        System.out.println(copywrite);

        String myString ="hellow";
        myString = myString + "\u00A9 2009";
        System.out.println(myString);
        myString = myString + "250.00";
        myString = myString + "11.002";
        System.out.println(myString);
    }
}
