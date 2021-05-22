package com.learning;

public class Main {

    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;

        int max = Integer.MAX_VALUE;

        System.out.println(min);
        System.out.println(max);

        System.out.println("bused0max:" + (max + 1));
        System.out.println("bused0min:" + (min - 1));

        byte minValue = Byte.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;

        System.out.println("minValue" + minValue);
        System.out.println("maxValue" + maxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short min value:"+ myShortMinValue);
        System.out.println("Short max value:"+ myShortMaxValue);

        long myLongValue = 100L;

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("long min value:"+ myLongMinValue);
        System.out.println("long max value:"+ myLongMaxValue);

        byte newByte2 = (byte)(minValue / 2);
        short newShortValue = (short)(myShortMinValue / 2);

        byte myBytev2 = 120;
        short myShortv2 = 3401;
        int myIntv2 = 998811469;
        long myLongv2 = 50_000 + (10 * (myBytev2 + myShortv2 + myIntv2));

        System.out.println(myLongv2);
    }
}
