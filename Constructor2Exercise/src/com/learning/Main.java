package com.learning;

public class Main {

    public static void main(String[] args) {
        VipCustomer vince = new VipCustomer();
        System.out.println(vince.toString());
        VipCustomer heya = new VipCustomer("heyo", "heya@hey.com");
        System.out.println(heya.toString());
        VipCustomer soma = new VipCustomer("suma", 1000, "suma@test.com" );
        System.out.println(soma.toString());
    }
}
