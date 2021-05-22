package com.learning;

public class Main {

    public static void main(String[] args) {
	    Car mazda6 = new Car(5, "mazda6");
	    mazda6.start();
        mazda6.changeGear(1);
	    mazda6.accelerate(10);

        mazda6.shiftGearForward();
        mazda6.accelerate(30);

        mazda6.accelerate(30);
        mazda6.shiftGearForward();

        mazda6.brake(30);
        mazda6.shiftGearBackward();
        mazda6.turnLeft();
        mazda6.driveForward();

        mazda6.accelerate(30);
        mazda6.shiftGearForward();

        mazda6.accelerate(30);
        mazda6.shiftGearForward();

        mazda6.brake(30);
        mazda6.brake(30);
        mazda6.brake(10);
        mazda6.stop();

        mazda6.reverse();
        mazda6.stop();

        System.out.println("*************************************");
        Suv cx5 = new Suv(5, "CX-5", 6, false);
        cx5.start();
        cx5.changeGear(1);
        cx5.accelerate(10);

        cx5.shiftGearForward();
        cx5.accelerate(30);
        cx5.shiftGearForward();

        cx5.brake(30);
        cx5.shiftGearBackward();
        cx5.turnLeft();
        cx5.driveForward();

        cx5.accelerate(30);
        cx5.shiftGearForward();

        cx5.accelerate(30);
        cx5.shiftGearForward();

        cx5.brake(30);
        cx5.brake(30);
        cx5.brake(10);
        cx5.stop();

        cx5.reverse();
        cx5.stop();

        cx5.foldChair();

        System.out.println("*************************************");
        Vehicle boeing777 = new Vehicle(6);

        boeing777.start();
        boeing777.changeGear(1);
        boeing777.accelerate(10);
        boeing777.steer("left");
        boeing777.steer("neutral");
        boeing777.accelerate(30);
        boeing777.brake(20);
        boeing777.shiftGearForward();
        boeing777.accelerate(70);
        boeing777.shiftGearForward();
        boeing777.accelerate(100);
    }
}
