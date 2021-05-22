package com.learning;

import java.text.NumberFormat;

public class Hamburger {
    private String name;
    private final double basePricing;
    private double grandTotal;
    private String breadRoleType;
    private String meat;
    private Addition lettuce;
    private Addition tomatoes;
    private Addition carrot;
    private Addition cheese;

    public Hamburger(String name, String breadRoleType, String meat) {
        this.name = name;
        this.breadRoleType = breadRoleType;
        this.meat = meat;
        this.basePricing = 2.8;
        this.grandTotal = this.basePricing;
    }

    public String getName() {
        return name;
    }

    public void addLettuce() {
        if (this.lettuce != null) return;
        this.lettuce = new Addition("lettuce", 1.5);
        System.out.println("Added lettuce");
        this.grandTotal += this.lettuce.getPrice();
    }

    public void removeLettuce() {
        if (this.lettuce == null) return;
        this.lettuce = null;
        System.out.println("removed lettuce");
        this.grandTotal -= this.lettuce.getPrice();
    }

    public void addTomatoes() {
        if (this.tomatoes != null) return;
        this.tomatoes = new Addition("tomatoes", 1);
        System.out.println("Added tomatoes");
        this.grandTotal += this.tomatoes.getPrice();
    }

    public void removeTomatoes() {
        if (tomatoes == null) return;
        this.tomatoes = null;
        System.out.println("removed tomatoes");
        this.grandTotal -= this.tomatoes.getPrice();
    }

    public void addCarrot() {
        if (this.carrot != null) return;
        this.carrot = new Addition("carrot", 0.8);
        System.out.println("Added carrot");
        this.grandTotal += this.carrot.getPrice();
    }

    public void removeCarrot() {
        if (this.carrot == null) return;
        this.carrot = null;
        System.out.println("removed carrot");
        this.grandTotal -= this.carrot.getPrice();
    }

    public void addCheese() {
        if (this.cheese != null) return;
        this.cheese = new Addition("cheese", 1.8);
        System.out.println("Added cheese");
        this.grandTotal += this.cheese.getPrice();
    }

    public void removeCheese() {
        if (this.cheese == null) return;
        this.cheese = null;
        System.out.println("removed cheese");
        this.grandTotal -= this.cheese.getPrice();
    }

    public double getBasePrice() {
        return this.basePricing;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void showBaseSection() {
        System.out.println();
        System.out.println("Base Price = " + this.basePricing + "\n");
        System.out.println("    bread roll type = " + this.breadRoleType);
        System.out.println("    meat = " + this.meat);
        System.out.println();
    }

    public void showAdditionsPricing() {
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();
        if (this.lettuce != null) {
            System.out.println(this.lettuce.getName() + " - " + dollarFormat.format(this.lettuce.getPrice()));
        }
        if (this.tomatoes != null) {
            System.out.println(this.tomatoes.getName() + " - " + dollarFormat.format(this.tomatoes.getPrice()));
        }
        if (this.carrot != null) {
            System.out.println(this.carrot.getName() + " - " + dollarFormat.format(this.carrot.getPrice()));
        }
        if (this.cheese != null) {
            System.out.println(this.cheese.getName() + " - " + dollarFormat.format(this.cheese.getPrice()));
        }
    }

    public void showPricing() {
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();

        System.out.println("--------" + this.getName() + "-----------");
        showBaseSection();
        showAdditionsPricing();
        System.out.println("Grand Total = " + dollarFormat.format(this.getGrandTotal()));
        System.out.println("------------------END-----------------");
    }
}
