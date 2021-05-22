package com.learning;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek2(0);
        printDayOfTheWeek2(1);
        printDayOfTheWeek2(2);
        printDayOfTheWeek2(3);
        printDayOfTheWeek2(4);
        printDayOfTheWeek2(5);
        printDayOfTheWeek2(6);
        printDayOfTheWeek2(7);

        NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        NumberOfDaysInMonth.getDaysInMonth(2,2020);
        NumberOfDaysInMonth.getDaysInMonth(2,2021);
        NumberOfDaysInMonth.getDaysInMonth(3, 2020);
        NumberOfDaysInMonth.getDaysInMonth(4, 2020);
        NumberOfDaysInMonth.getDaysInMonth(5, 2020);
        NumberOfDaysInMonth.getDaysInMonth(6,2020);
        NumberOfDaysInMonth.getDaysInMonth(7,2020);
        NumberOfDaysInMonth.getDaysInMonth(8,2020);
        NumberOfDaysInMonth.getDaysInMonth(9,2020);
        NumberOfDaysInMonth.getDaysInMonth(10,2020);
        NumberOfDaysInMonth.getDaysInMonth(11,2020);
        NumberOfDaysInMonth.getDaysInMonth(12,2020);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeek2(int day){
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
