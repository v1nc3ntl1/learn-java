package com.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        boolean hasInt = scanner.hasNextInt();

        if (!hasInt) {
            System.out.println("Invalid year of birth");
            return;
        }

        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2021 - year;

        if (age < 0 || age > 200) {
            System.out.println("Invalid year of birth");
            return;
        }

        System.out.println("Your name is " + name + " and your are " + age + "years old.");
        scanner.close();
    }
}
