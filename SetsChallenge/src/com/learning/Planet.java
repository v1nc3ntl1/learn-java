package com.learning;

public class Planet extends CommonHeavenlyBody implements SupportMoonSatellite{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.Planet);
    }

    @Override
    public boolean addMoon(Moon moon) {
        this.satellites.add(moon);
        return true;
    }
}
