package com.learning;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        showOptions();

        boolean quit = false;

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    listContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default: break;
            }
        }
    }

    private static void showOptions() {
        System.out.println("List of operation");
        System.out.println("\t 0 - Show list of operation");
        System.out.println("\t 1 - List Contacts");
        System.out.println("\t 2 - add new contact");
        System.out.println("\t 3 - update a contact");
        System.out.println("\t 4 - remove a contact");
        System.out.println("\t 5 - find/search a contact");
        System.out.println("\t 6 - quit the application");
        System.out.println();
    }

    private static void listContact() {
       mobilePhone.printContacts();
    }

    private static void addNewContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        int number = scanner.nextInt();
        mobilePhone.addContact(name, number);
        scanner.nextLine();
    }

    private static void updateContact() {
        System.out.print("Enter the contact name: ");
        String contactName = scanner.nextLine();

        Contact existingContact = mobilePhone.searchContact(contactName);
        if (existingContact == null) {
            System.out.println("Not updated. Contact not found");
            return;
        }

        System.out.println("Choose update options: ");
        System.out.println("\t 1 - update contact name");
        System.out.println("\t 2 - update contact number");
        int selectedOptions = scanner.nextInt();
        scanner.nextLine();

        switch (selectedOptions) {
            case 1:
                System.out.print("Enter a new contact name: ");
                String newName = scanner.nextLine();
                mobilePhone.modifyContactName(existingContact.getName(), new Contact(newName, existingContact.getNumber()));
                break;
            case 2:
                System.out.print("Enter new number: ");
                int newNumber = scanner.nextInt();
                mobilePhone.modifyContact(existingContact.getName(), new Contact(existingContact.getName(), newNumber));
                scanner.nextLine();
                break;
        }

    }

    private static void removeContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    private static void findContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.searchContact(name);
        if (contact != null) {
            System.out.println("Found contact with phone number " + contact.getNumber());
        }else
        {
            System.out.println("Contact not found.");
        }
    }
}
