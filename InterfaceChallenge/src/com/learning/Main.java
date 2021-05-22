package com.learning;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim");
        System.out.println(tim.toString());
        read(tim);
        tim.levelUp();
        System.out.println(tim);
        tim.receiveDamage(10);
        read(tim);
        save(tim);
        System.out.println(tim);
    }

    public static void read(ISaveable objectToSave){
        for (int i = 0; i <objectToSave.getValues().size(); i++){
            System.out.println("reading " + objectToSave.getValues().get(i) + " to storage device.");
        }
    }

    public static void save(ISaveable objectToSave){
        ArrayList<String> values = readValues();
        objectToSave.setValues(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
