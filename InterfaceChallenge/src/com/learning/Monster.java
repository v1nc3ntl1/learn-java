package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int score;
    private int health;

    public void receiveDamage(int damagePoint){
        if (damagePoint> 100) {
            System.out.println("Invalid damage point.");
            return;
        }
        this.health -= damagePoint;
    }

    public void death(){
        this.score = 0;
    }

    public void levelUp(){
        this.score += 10;
    }

    public void Kill(){
        this.score += 10;
    }

    @Override
    public List<String> getValues() {
        List<String> currentValue = new ArrayList<String>();
        currentValue.add(this.name);
        currentValue.add(Integer.toString(this.score));
        currentValue.add(Integer.toString(this.health));

        return currentValue;
    }

    @Override
    public void setValues(List<String> values) {
        this.name = values.get(0);
        this.score = Integer.parseInt(values.get(1));
        this.health = Integer.parseInt(values.get(2));
    }
}
