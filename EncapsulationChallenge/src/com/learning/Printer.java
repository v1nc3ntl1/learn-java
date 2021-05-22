package com.learning;

public class Printer {
    private double tonerLevel;
    private int noOfPagesPrinted = 0;
    private boolean isDuplexPrinter = false;

    public Printer(double tonerLevel, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.isDuplexPrinter = isDuplexPrinter;
        System.out.println("Printer toner level is " + this.tonerLevel);
    }

    public void fillToner(double tonerLevel) {
        if (tonerLevel < 0) return;

        System.out.println("fill up toner");
        this.tonerLevel += tonerLevel;
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        System.out.println("toner level = " + this.tonerLevel);
    }

    public void print(int pages) {
        if (tonerLevel == 0) {
            System.out.println("Fail to print. Please refill toner");
            return;
        }

        if (pages < 1) return;

        int counterPage = 1;
        int side;
        int innerPage = 1;

        while (tonerLevel >= 0 && counterPage <= pages) {
            if (isDuplexPrinter) {
                side = 1;
                while (side < 3 && counterPage <= pages) {
                    if (tonerLevel <= 0) {
                        System.out.println("    Fail to print " + innerPage + " side " + side + "Please refill toner");
                        return;
                    }
                    System.out.println("    Printing page " + innerPage + " Printing side " + side);
                    tonerLevel -= printPagesToTonerRatio;
                    side++;
                    counterPage++;
                }

                innerPage++;
                this.noOfPagesPrinted++;
            } else {
                System.out.println("Printing page " + counterPage);
                tonerLevel -= printPagesToTonerRatio;
                counterPage++;
                this.noOfPagesPrinted++;
            }
        }

        if (tonerLevel <= 0) {
            System.out.println("Failed to print page " + counterPage + " onwards. Please refill toner.");
        }
    }

    public int getPagePrinted(){
        return this.noOfPagesPrinted;
    }

    final double printPagesToTonerRatio = 0.02;

}
