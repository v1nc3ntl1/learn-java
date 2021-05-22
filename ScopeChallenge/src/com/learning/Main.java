package com.learning;

import java.util.Scanner;

class X{
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    void x(){
        for (int x = 1; x < 13 ; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    };
}

public class Main {

    public static void main(String[] args) {
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
