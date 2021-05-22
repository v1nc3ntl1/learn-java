package com.learning;

public class MinutesToYearsDaysCalculator {
    private static final String INVALID_VALUE = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }

        long minutesInYear = (60 * 24 * 365);
        long year = minutes / minutesInYear;
        long minutesRemaider = minutes % minutesInYear;
        long days = minutesRemaider / (60 * 24);

        System.out.println(minutes + " min = " + year + " y and " + days + " d");
    }
}