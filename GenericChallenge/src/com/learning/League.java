package com.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private ArrayList<T> teams = new ArrayList<>();

    public boolean addTeam(T team){
        teams.add(team);
        return true;
    }

    public void printTeams(){
        Collections.sort(teams);
        for (T team : teams){
            System.out.println(team.toString());
        }
    }
}
