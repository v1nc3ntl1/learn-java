package com.learning;

public class Aircon {
    private String state;
    private int temperature;

    public Aircon(String state, int temperature) {
        this.state = state;
        this.temperature = temperature;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
