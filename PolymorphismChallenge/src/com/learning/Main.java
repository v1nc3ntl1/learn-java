package com.learning;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private boolean steering;
    private int speed;

    public Car(String name, int cylinders, boolean steering) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.steering = true;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isSteering() {
        return steering;
    }

    public void startEngine() {
        System.out.println("start " + name + " engine");
    }

    public void accelerate(int km) {
        speed += km;
        System.out.println("accelerate at " + km);
    }

    public void brake() {
        speed = 0;
        System.out.println("braking");
    }


}

class HondaCivic extends Car {
    public HondaCivic(int cylinders) {
        super("Honda Civic", 6, true);
    }

    @Override
    public void startEngine() {
        LightUpHeadLight();
    }

    private void LightUpHeadLight() {
        System.out.println("Light up headlight");
    }
}

class HondaCrv extends Car {
    public HondaCrv() {
        super("Honda Crv", 10, true);
    }

    @Override
    public void startEngine() {
        openSideMirror();
    }

    private void openSideMirror() {
        System.out.println("opening side mirror");
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            Car car = getRandomCar();
            System.out.println("starting car " + car.getName());
            car.startEngine();
        }

    }

    public static Car getRandomCar() {
        int randomNumber = (int) (Math.random() * 2) + 1;

        switch (randomNumber) {
            case 1:
                return new HondaCivic(6);
            case 2:
                return new HondaCrv();
        }

        return null;
    }
}
