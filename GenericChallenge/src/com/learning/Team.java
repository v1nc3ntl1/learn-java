package com.learning;

public class Team implements Comparable<Team>  {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Team team) {
        return this.name.compareTo(team.name);
    }
}
