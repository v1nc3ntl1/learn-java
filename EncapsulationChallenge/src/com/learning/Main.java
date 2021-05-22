package com.learning;

public class Main {

    public static void main(String[] args) {
        Printer epson = new Printer(40, true);
        epson.fillToner(70);
        epson.print(7);
        System.out.println("no of page printed " + epson.getPagePrinted());

        System.out.println("********************************************");
        Printer canon = new Printer(2, false);
        canon.print(103);
        System.out.println("no of page printed " + canon.getPagePrinted());
    }
}
