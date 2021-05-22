package com.learning;

import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank() {
        this("Bank1");
    }

    public Bank(String name) {
        this.name = name;

        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Failed to add Branch. Branch " + branchName + " is already in File.");
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            System.out.println("Failed to add customer to branch " + branchName + ". Branch not in file.");
            return false;
        }

        branch.addCustomer(customerName, initialAmount);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            System.out.println("Failed to add transaction to branch " + branchName + ". Branch not in file.");
            return false;
        }

        branch.addTransaction(customerName, amount);
        return true;
    }

    public ArrayList<Customer> getCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (showTransaction) {
            printCustomers(branch, showTransaction);
        }
        return branch.getCustomers();
    }

    private void printCustomers(Branch branch, boolean showTransaction) {
        ArrayList<Customer> customers = branch.getCustomers();
        Customer currentCustomer;
        ArrayList<Double> transactions;
        double currentTransaction;

        System.out.println("Showing customers from branch " + branch.getName() + ": ");

        for (int i = 0; i < customers.size(); i++) {
            currentCustomer = customers.get(i);
            System.out.println("\t " + currentCustomer.getName());

            if (showTransaction) {
                transactions = currentCustomer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    currentTransaction = transactions.get(j);
                    System.out.println("\t\t " + currentTransaction);
                }
            }

            System.out.println("-------------------------------------------------");
        }
    }

    public Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equalsIgnoreCase(name)) {
                return branches.get(i);
            }
        }

        return null;
    }
}

class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String name, double initialTransactionAmout) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            System.out.println("No customer added. Customer " + name + " already in file.");
            return;
        }

        Customer customer = new Customer(name);
        customer.addTransaction(initialTransactionAmout);
        this.customers.add(customer);
    }

    public boolean addTransaction(String customerName, double transactionAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer == null) {
            System.out.println("Failed to add transaction. Customer " + customerName + " not in file.");
            return false;
        }

        existingCustomer.addTransaction(transactionAmount);
        return true;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return customers.get(i);
            }
        }

        return null;
    }
}

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
}

public class Main {

    public static void main(String[] args) {
        Bank uob = new Bank("Uob bank");
        String midah = "Taman Midah";
        boolean success = uob.addBranch(midah);
        System.out.println(success ? "added branch successfully" : "Failed to add branch");

        String customer1 = "Vincent";
        uob.addCustomer(midah, customer1, 30);

        String customer2 = "Edwin";
        uob.addCustomer(midah, customer2, 40);

        uob.addCustomerTransaction(midah, customer1, 90);

        Branch branch = uob.findBranch(midah);
        System.out.println("branch name = " + branch != null ? branch.getName() : " Not branch Found");

        uob.getCustomers(midah, true);

        Branch unknownBranch = uob.findBranch("unknown");
        System.out.println("Branch unknown is " + (unknownBranch == null ? "not found." : "found"));

        Branch midahBranch = uob.findBranch(midah);
        System.out.println("Branch Taman Midah is " + (midahBranch == null ? "not found." : "found"));

        System.out.println("Priting Customer of Midah Branch");
        for (int i =0; i < midahBranch.getCustomers().size(); i++){
            System.out.println(midahBranch.getCustomers().get(i).getName());
        }
        System.out.println("---------------------------------------------------");

        midahBranch.addTransaction(customer2, 5);

        String customer3 = "hayley";
        midahBranch.addCustomer(customer3, 12);
        midahBranch.addTransaction(customer3, 99);

        uob.getCustomers(midah, true);

        uob.addBranch(midah);

        uob.addCustomer("unknown", "unknown customer", 12.0);
    }
}
