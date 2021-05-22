package com.learning;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 3;
        switch (value){
            case 1:
                System.out.println("1 entered");
                break;
            case 2:
                System.out.println("2 entered");
                break;
            case 3: case 4: case 5:
                System.out.println("3,4,5");
                break;
            default:
                System.out.println("non selected");
                break;
        }

        String value2 = "January";
        switch (value2.toLowerCase()){
            case "january":
                System.out.println(value2);
        }
    }
}
