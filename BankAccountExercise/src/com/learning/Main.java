package com.learning;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(12345678);
        bankAccount.setBalance(100);
        bankAccount.setCustomerName("Vincent");
        bankAccount.setEmail("vincentli@gmail.com");
        bankAccount.setPhoneNo("+601170360269");

        System.out.println("customer name: " + bankAccount.getCustomerName());
        System.out.println("account no: " + bankAccount.getAccountNumber());
        System.out.println("balance: " + bankAccount.getBalance());
        System.out.println("email address: " + bankAccount.getEmail());
        System.out.println("phone no: " + bankAccount.getPhoneNo());

        System.out.println("***********************************");
        int withdrawAmount = 20;
        bankAccount.withdraw(withdrawAmount);

        System.out.println("***********************************");
        int depositAmount = 30;
        bankAccount.deposit(depositAmount);

        System.out.println("***********************************");
        withdrawAmount = 200;
        bankAccount.withdraw(withdrawAmount);

        System.out.println("------------------------------------------------------------");
        BankAccount aliAccount = new BankAccount(876542235, 40, "ali", "ali@gmail.com", "0126659986");

        System.out.println("customer name: " + aliAccount.getCustomerName());
        System.out.println("account no: " + aliAccount.getAccountNumber());
        System.out.println("balance: " + aliAccount.getBalance());
        System.out.println("email address: " + aliAccount.getEmail());
        System.out.println("phone no: " + aliAccount.getPhoneNo());

        System.out.println("***********************************");
        withdrawAmount = 20;
        aliAccount.withdraw(withdrawAmount);

        System.out.println("***********************************");
        depositAmount = 30;
        aliAccount.deposit(depositAmount);

        System.out.println("***********************************");
        withdrawAmount = 200;
        aliAccount.withdraw(withdrawAmount);

        System.out.println("------------------------------------------------------------");
        BankAccount defaultAccount = new BankAccount();

        System.out.println("customer name: " + defaultAccount.getCustomerName());
        System.out.println("account no: " + defaultAccount.getAccountNumber());
        System.out.println("balance: " + defaultAccount.getBalance());
        System.out.println("email address: " + defaultAccount.getEmail());
        System.out.println("phone no: " + defaultAccount.getPhoneNo());

        System.out.println("***********************************");
        withdrawAmount = 20;
        defaultAccount.withdraw(withdrawAmount);

        System.out.println("***********************************");
        depositAmount = 30;
        defaultAccount.deposit(depositAmount);

        System.out.println("***********************************");
        withdrawAmount = 200;
        defaultAccount.withdraw(withdrawAmount);
    }
}
