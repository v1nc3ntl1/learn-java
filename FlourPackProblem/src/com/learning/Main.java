package com.learning;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(2,1,5));
        System.out.println(canPack(4,18,19));
        System.out.println(canPack(0,5,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 ||
        smallCount < 0 ||
        goal < 0){
            return false;
        }

        final int bigPackSize = 5;

        while (bigCount > 0) {
            goal = goal - bigPackSize;
            //System.out.println("goal = " + goal);
            if (goal < 0) {
                int surplus = goal + bigPackSize;
                //System.out.println("balance = " + (smallCount - bigPackSize));
                return smallCount - surplus >= 0;
            }
            bigCount--;
        }

        if (goal == 0) return true;

        return smallCount - goal >= 0;
    }
}
