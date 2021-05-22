package com.learning;

public class SoccerTeam extends Team{
    public SoccerTeam(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getClass().toString() + "\n" + super.toString();
    }
}
