package com.learning;

public class Suv extends Car {
    private int passengerCapacity;
    private Boolean isBootSpaceFolded;

    public Suv(int wheel, String modelName, int capacity, boolean isBootSpaceFolded) {
        super(wheel, modelName);
        this.passengerCapacity = capacity;
        this.isBootSpaceFolded = isBootSpaceFolded;
    }

    public void keepChair(){
        if (!this.isBootSpaceFolded) return;

        System.out.println("Chair in boot is open");
        this.isBootSpaceFolded = false;
        this.passengerCapacity += 2;
    }

    public void foldChair(){
        if (this.isBootSpaceFolded) return;

        System.out.println("fold chair to allow more boot space");
        this.isBootSpaceFolded = true;
        this.passengerCapacity -= 2;
    }
}
