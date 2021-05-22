package com.learning;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
	    dog.breathe();
	    dog.eat();

	    Parrot parrot = new Parrot("hornbill");
		parrot.breathe();
		parrot.eat();
		parrot.fly();

		Penguin penguin = new Penguin("Iko");
		penguin.fly();
    }
}
