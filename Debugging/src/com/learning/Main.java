package com.learning;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
        CalculateSum(new int[]{2, 3, 4, 5, 6, 7, 9});
        CalculateSum(new int[]{7, 44, 88});
        CalculateSum(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 0});
        Car.addCar(StringUtil.ToUpperCase("Almera"), new Car("Almera", "NIssan"));
        Car.removeCar(StringUtil.ToUpperCase("Almera"));
    }

    public static int CalculateSum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}

class Car {
    private static HashMap<String, Car> myCars = new LinkedHashMap<>();
    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public static void addCar(String name, Car car) {
        myCars.put(name, car);
    }

    public static void removeCar(String name) {

        myCars.remove(name);
    }
}

class StringUtil{
    public static String ToUpperCase(String value){
        return value.toUpperCase();
    }
}
