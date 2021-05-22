package com.learning;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1, 1, 5, 5);
        animal.eat();
        System.out.println("************************************");
        Dog dog = new Dog("Yorkie", 8, 20, 2, 1, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
