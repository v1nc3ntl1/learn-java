package com.learning;

public class Vehicle {
    private int wheel;
    private int currentGear;
    private int currentSpeed;

    public Vehicle(int wheel) {
        this.wheel = wheel;
        this.currentGear = 0;
        this.currentSpeed = 0;
    }

    public void start() {
        System.out.println("Vehicle start");
    }

    public void steer(String orientation) {
        System.out.println("Vehicle Steer to " + orientation);
    }

    protected void changeGear(int gear) {
        if (gear < -1) return;
        this.currentGear = gear;
        System.out.println("Vehicle change gear to gear " + gear);
    }

    public void shiftGearForward() {
        System.out.println("Shift gear forward ");
        changeGear(++currentGear);
    }

    public void shiftGearBackward() {
        System.out.println("Shift gear backward ");
        changeGear(--currentGear);
    }

    public void accelerate(int speed) {
        System.out.println("Vehicle accelerate " + speed + " km/h");
        move(speed);
    }

    public void brake(int speed) {
        System.out.println("Vehicle break at speed " + speed);
        speed = speed > 0 ? -1 * speed : speed;
        move(speed);
    }

    protected void move(int speed) {
        currentSpeed += speed;
        System.out.println("Vehicle moving at speed " + currentSpeed + " km/h");
    }

    public void stop() {
        System.out.println("Vehicle stop");
        currentSpeed = 0;
        currentGear = 0;
    }
}
