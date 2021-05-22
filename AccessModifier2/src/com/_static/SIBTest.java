package com._static;

import java.sql.SQLOutput;

public class SIBTest {
    public static final String owner;

    static {
        owner = "time";
        System.out.println("SIBTest static init block called.");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd init block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
