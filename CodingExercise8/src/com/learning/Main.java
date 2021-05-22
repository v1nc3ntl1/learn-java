package com.learning;

public class Main {

    public static void main(String[] args) {
        double result = AreaCalculator.area(10);
        System.out.println(result);
        result = AreaCalculator.area(20);
        System.out.println(result);
        result = AreaCalculator.area(5, 10);
        System.out.println(result);

        MinutesToYearsDaysCalculator.printYearsAndDays(-525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        IntEqualityPrinter.printEqual(2, 2, 2);
        IntEqualityPrinter.printEqual(2, 3, 4);
        IntEqualityPrinter.printEqual(2, 4, 2);

        PlayingCat.isCatPlaying(true, 10);
        PlayingCat.isCatPlaying(false, 36);
        PlayingCat.isCatPlaying(false,  35);
    }
}
