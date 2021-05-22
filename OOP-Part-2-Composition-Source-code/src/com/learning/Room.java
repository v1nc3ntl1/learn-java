package com.learning;

public class Room {
    private int windows;
    private int doors;
    private int noOfFurniture;
    private String wallColor;
    private Aircon aircondition;
    private Dimensions dimensions;

    public Room(int windows, int doors, int noOfFurniture, String wallColor, Aircon aircondition, Dimensions dimensions) {
        this.windows = windows;
        this.doors = doors;
        this.noOfFurniture = noOfFurniture;
        this.wallColor = wallColor;
        this.aircondition = aircondition;
        this.dimensions = dimensions;
    }

    public void turnOnAircon()
    {
        this.aircondition.setState("on");
        this.aircondition.setTemperature(16);
        System.out.println("Aircon is " + this.aircondition.getState() + " at temperature " + this.aircondition.getTemperature());
    }

    public void turnOffAircon(){
        this.aircondition.setState("off");
        this.aircondition.setTemperature(33);
        System.out.println("Aircon is off");
    }

    public Aircon getAircon()
    {
        return this.aircondition;
    }
}
