package com.learning;

import java.text.NumberFormat;

public class DeluxeHamburger extends Hamburger {
    private Addition chips;
    private Addition drinks;

    public DeluxeHamburger(String breadRoleType, String meat) {
        super("Deluxe Hamburger", breadRoleType, meat);
        this.chips = new Addition("chips", 2.5);
        this.drinks = new Addition("drinks", 2);
    }

    @Override
    public void addLettuce() {
        // Do nothing
    }

    @Override
    public void removeLettuce() {
        // Do nothing
    }

    @Override
    public void addTomatoes() {
        // Do nothing
    }

    @Override
    public void removeTomatoes() {
        // Do nothing
    }

    @Override
    public void addCarrot() {
        // Do nothing
    }

    @Override
    public void removeCarrot() {
        // Do nothing
    }

    @Override
    public void addCheese() {
        // Do nothing
    }

    @Override
    public void removeCheese() {
        // Do nothing
    }

    @Override
    public void showPricing() {
        double basePrice = getBasePrice();
        double grandTotal = basePrice + chips.getPrice() + drinks.getPrice();
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();

        System.out.println("--------" + this.getName() + "-----------");
        this.showBaseSection();
        System.out.println(chips.getName() + " = " + dollarFormat.format(chips.getPrice()) + "\n" +
                drinks.getName() + " = " + dollarFormat.format(drinks.getPrice()) + "\n" +
                "Grand Total = " + dollarFormat.format(grandTotal)
                );
        System.out.println("------------------END-----------------");
    }
}
