package com.learning;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;
    private static int count;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before class once. Count = " + count++);
    }

    @BeforeEach
    void setUp() {
        System.out.println("Running test");
        account = new BankAccount("Vincent", "li", 1000, BankAccount.CHECKING);
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(1200.00, balance, 0);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_notBranch() {
        assertThrows(IllegalArgumentException.class, () -> {
            double balance = account.withdraw(600.00, false);
        });
    }

    @org.junit.jupiter.api.Test()
    void getBalance_deposit() {
        account.deposit(200, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(200, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("vincent", "li", 1000.0, BankAccount.CHECKING);
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @ParameterizedTest
    @ValueSource(doubles = {501d, 600d, 700d, 800d, 900d, Double.MAX_VALUE}) // six numbers
    void withdraw_notBranch(double number) {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(number, false);
        });
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After class once. Count = " + count++);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Count = " + count++);
    }
}