package com.learning;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class CommonHeavenlyBody {
    public enum BodyType{
        Star,
        Planet,
        Moon,
        Dwarf,
    }

    private final String name;
    private final double orbitalPeriod;
    protected final Set<HeavenlyBody> satellites;
    private final Key key;

    public CommonHeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

    public final static Key createKey(String name, BodyType bodyType){
        return new Key(name, bodyType);
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof CommonHeavenlyBody) {
            CommonHeavenlyBody theObject = (CommonHeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.getKey().toString() + ":" + this.orbitalPeriod;
    }

    public final static class Key{
        private String name;
        private BodyType bodyType;

        public Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return this.name + ":" + this.bodyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return getName().equals(key.getName()) && getBodyType() == key.getBodyType();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getBodyType());
        }
    }
}
