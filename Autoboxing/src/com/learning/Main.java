package com.learning;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {

        ArrayList<IntClass> myInt = new ArrayList<IntClass>();
        myInt.add(new IntClass(54));
        Integer integer = Integer.valueOf(54);
        Double doubleValue = Double.valueOf(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myValue1 = 56; // Integer.valueOf(56);
        int myInt1 = myValue1; // myValue1.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i=0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
