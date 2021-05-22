package com.learning;

import java.util.Locale;

public class Car extends Vehicle {
    private String currentOrientation;
    private String movingDirection;
    private String modelName;

    public Car(int wheel,String modelName) {
        super(wheel);
        this.modelName = modelName;
        this.movingDirection = "forward";
        this.currentOrientation = "neutral";
    }

    @Override
    public void steer(String orientation) {
        super.steer(orientation);
        this.currentOrientation = orientation;

        String currentDirection;
        setMovingDirection();
    }

    public void turnLeft(){
        System.out.println(modelName + " is turning left");
        steer("left");
    }

    public void turnRight(){
        System.out.println(modelName + " is turning right");
        steer("right");
    }

    public void driveForward(){
        System.out.println(modelName + " is driving forward");
        steer("neutral");
    }

    private void setMovingDirection() {
        String currentDirection;
        switch (this.currentOrientation.toLowerCase()) {
            case "neutral":
                currentDirection = "forward";
                break;
            case "left":
                currentDirection = "left";
                break;
            case "right":
                currentDirection = "right";
                break;
            default:
                currentDirection = "unknown";
                break;
        }

        this.movingDirection = currentDirection;
    }

    public void reverse() {
        System.out.println(modelName + " is reversing");
        changeGear(-1);
        move(-10);
    }
}
