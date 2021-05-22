package com.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static AdvanceGroceryList advanceGroceryList = new AdvanceGroceryList();

    private static void simpleProgram() {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void advanceProgram() {
        boolean quit = false;
        int choice = 0;
        advancePrintInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    advancePrintInstruction();
                    break;
                case 1:
                    advanceGroceryList.printGroceryList();
                    break;
                case 2:
                    advanceAddItem();
                    break;
                case 3:
                    advanceModifyItem();
                    break;
                case 4:
                    advanceRemoveItem();
                    break;
                case 5:
                    advanceSearchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        //copy arrayList to another arrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(advanceGroceryList.getGroceryList());
        //copy arrayList to another arrayList
        ArrayList<String> newArray2 = new ArrayList<String>(advanceGroceryList.getGroceryList());
        //copy arrayList to another array
        String[] newArray3 = new String[advanceGroceryList.getGroceryList().size()];
        newArray3 = advanceGroceryList.getGroceryList().toArray(newArray3);
    }

    public static void main(String[] args) {
        //simpleProgram();
        advanceProgram();
    }

    private static void advancePrintInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - Process Array");
        System.out.println("\t 7 - To quit the application");
    }

    public static void advanceAddItem() {
        System.out.print("Please enter the grocery item: ");
        advanceGroceryList.addGroceryItem(scanner.nextLine());
    }

    public static void advanceModifyItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        advanceGroceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void advanceRemoveItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        advanceGroceryList.removeGroceryItem(itemName);
    }

    public static void advanceSearchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (advanceGroceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery lists.");
        } else {
            System.out.println(searchItem + " is not in the grocery lists.");
        }
    }

    private static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery lists.");
        } else {
            System.out.println(searchItem + " is not in the grocery lists.");
        }
    }
}
