package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String playerName;
    private int playerScore;
    private int health;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerScore = 0;
        this.health = 100;
    }

    public void receiveDamage(int damagePoint){
        if (damagePoint> 100) {
            System.out.println("Invalid damage point.");
            return;
        }
        this.health -= damagePoint;
    }

    public void death(){
        this.playerScore = 0;
    }

    public void levelUp(){
        this.playerScore += 10;
    }

    @Override
    public List<String> getValues() {
        List<String> currentValue = new ArrayList<String>();
        currentValue.add(this.playerName);
        currentValue.add(Integer.toString(this.playerScore));
        currentValue.add(Integer.toString(this.health));

        return currentValue;
    }

    @Override
    public void setValues(List<String> values) {
        this.playerName = values.get(0);
        this.playerScore = Integer.parseInt(values.get(1));
        this.health = Integer.parseInt(values.get(2));
    }

    @Override
    public String toString() {
        return this.playerName + ":" + this.playerScore + ":" + this.health;
    }
}
