package com.learning;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class HealthyBurger extends Hamburger {
    private Addition olives;
    private Addition bacon;
    private double grandTotal;

    public HealthyBurger(String meat) {
        super("Healthy burger", "brown rye", meat);
        this.grandTotal = 0;
    }

    public void addOlives() {
        if (this.olives != null) return;
        this.olives = new Addition("olives", 0.9);
        System.out.println("added olives");
        this.grandTotal += this.olives.getPrice();
    }

    public void removeOlives() {
        if (olives == null) return;
        this.olives = null;
        System.out.println("removed olives");
        this.grandTotal -= this.olives.getPrice();
    }

    public void addBacon() {
        if (this.bacon != null) return;
        this.bacon = new Addition("bacon", 2.3);
        System.out.println("added bacon");
        this.grandTotal += this.bacon.getPrice();
    }

    public void removeBacon() {
        if (this.bacon == null) return;
        this.bacon = null;
        System.out.println("removed bacon");
        this.grandTotal -= this.bacon.getPrice();
    }

    @Override
    public double getGrandTotal() {
        this.grandTotal += super.getGrandTotal();
        return this.grandTotal;
    }

    @Override
    public void showPricing() {
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();

        System.out.println("--------" + this.getName() + "-----------");
        this.showBaseSection();
        this.showAdditionsPricing();

        if (this.olives != null) {
            System.out.println(this.olives.getName() + " - " + dollarFormat.format(this.olives.getPrice()));
        }
        if (this.bacon != null) {
            System.out.println(this.bacon.getName() + " - " + dollarFormat.format(this.bacon.getPrice()));
        }
        System.out.println("Grand Total = " + dollarFormat.format(this.getGrandTotal()));
        System.out.println("------------------END-----------------");
    }
}
