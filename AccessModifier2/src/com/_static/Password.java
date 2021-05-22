package com._static;

public class Password {
    public static final int key = 879456111;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptDecrcypt(encryptedPassword);
    }

    private int encryptDecrcypt(int password) {
        return password ^ key;
    }

    public final void storePasswordd() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if (encryptDecrcypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
