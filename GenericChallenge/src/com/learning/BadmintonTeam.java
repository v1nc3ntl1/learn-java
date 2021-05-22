package com.learning;

public class BadmintonTeam extends Team{
    public BadmintonTeam(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getClass().toString() + "\n" + super.toString();
    }
}
