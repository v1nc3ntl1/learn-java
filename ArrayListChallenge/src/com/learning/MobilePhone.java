package com.learning;

import java.util.ArrayList;
import java.util.Locale;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void addContact(String name, int number) {
        if (findContact(name) >= 0) {
            System.out.println("Skip adding contact. Contact already exists.");
            return;
        }

        contactList.add(new Contact(name, number));
        System.out.println("Contact " + name + "is added");
    }

    public void modifyContactName(String name, Contact updatedContact) {
        int position = findContact(name);
        if (position < 0) {
            System.out.println("Skip modifying contact. Contact not found.");
            return;
        }

        if (name.equals(updatedContact.getName())) {
            System.out.println("Skip modifying contact. Contact name hasn't changed.");
            return;
        }

        int position2 = findContact(updatedContact.getName());
        if (position2 >= 0) {
            System.out.println("Skip modifying contact. Contact name " + updatedContact.getName() + " is already exists");
            return;
        }

        contactList.set(position, updatedContact);
        System.out.println("Contact " + updatedContact.getName() + "is updated");
    }

    public void modifyContact(String name, Contact updatedContact) {
        int position = findContact(name);
        if (position < 0) {
            System.out.println("Skip modifying contact. Contact not found.");
            return;
        }

        contactList.set(position, updatedContact);
        System.out.println("Contact " + updatedContact.getName() + "is updated");
    }

    public void removeContact(String name) {
        int position = findContact(name);

        if (position < 0) {
            System.out.println("Contact Not found.");
            return;
        }
        contactList.remove(position);
        System.out.println("Contact " + name + "is deleted");
    }

    public Contact searchContact(String name) {
        int position = findContact(name);
        if (position < 0) return null;
        return contactList.get(position);
    }

    private int findContact(String name) {
        Contact contact;
        for (int i = 0; i < contactList.size(); i++) {
            contact = contactList.get(i);
            if (contact.getName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }

        return -1;
    }

    public void printContacts() {
        Contact contact;
        int numberOfContact = contactList.size();

        if (numberOfContact < 1) {
            System.out.println("0 Contact entries.");
            return;
        }
        for (int i = 0; i < numberOfContact; i++) {
            contact = contactList.get(i);
            System.out.println("\t" + contact.getName() + " - " + contact.getNumber());
        }
        System.out.println();
    }
}
