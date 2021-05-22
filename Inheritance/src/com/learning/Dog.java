package com.learning;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking");
        move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        //only execute method in inherited class.
        super.move(10);
    }

    private void moveLegs() {
        System.out.println("dog moving legs");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving at " + speed + "km/h");
        moveLegs();
        super.move(speed);
    }
}
