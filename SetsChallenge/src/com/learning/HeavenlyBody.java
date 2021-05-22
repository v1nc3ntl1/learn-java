package com.learning;

public class HeavenlyBody extends CommonHeavenlyBody implements SupportSatellite {

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        super(name, orbitalPeriod, bodyType);
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }
}

