package com.learning;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNo;

    public BankAccount(String customerName, String email, String phoneNo) {
        this(888888, 100, customerName, email, phoneNo);
    }

    public BankAccount() {
        this(9999999, 10, "test customer name", "test@test.com", "999");
        System.out.println("Empty constructor");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNo) {
        System.out.println("constructor with parameters calls");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void deposit(double amount) {
        System.out.println("depositing " + amount + " to bank account");
        this.balance += amount;
        System.out.println("new balance: " + balance);
    }

    public void withdraw(double amount) {
        System.out.println("withdrawing " + amount + " from bank account");
        if (amount > balance) {
            System.out.println("withdraw not processed. attempt to withdraw amount more than balance number.");
            return;
        }

        this.balance -= amount;
        System.out.println("new balance: " + this.balance);
    }
}
