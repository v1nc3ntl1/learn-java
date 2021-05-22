package com.learning;

public class Main {

    public static void main(String[] args) {
        Hamburger basicHamBurger = new Hamburger("Basic", "Parmesan Oat", "chicken");
        basicHamBurger.addLettuce();
        basicHamBurger.addTomatoes();
        basicHamBurger.addCarrot();
        basicHamBurger.addCheese();
        basicHamBurger.showPricing();

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Honey oats", "pork");
        deluxeHamburger.addCheese();
        deluxeHamburger.showPricing();

        HealthyBurger healthyBurger = new HealthyBurger("beef");
        healthyBurger.addLettuce();
        healthyBurger.addTomatoes();
        healthyBurger.addOlives();
        healthyBurger.addBacon();
        healthyBurger.showPricing();
    }
}
