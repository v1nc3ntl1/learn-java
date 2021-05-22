package com.learning;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateCluth(true);
        mcLaren.changeGear(1);
        mcLaren.operateCluth(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateCluth(true);
        mcLaren.changeGear(3);
        mcLaren.operateCluth(false);
        System.out.println(mcLaren.wheelSpeed(6000));


    }
}
