package com.learning;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        String result = getDurationString(70, 10);
        System.out.println(result);
        result = getDurationString(80, 59);
        System.out.println(result);
        result = getDurationString(65, 45);
        System.out.println(result);
        result = getDurationString(3610);
        System.out.println(result);
        result = getDurationString(3945 );
        System.out.println(result);
        result = getDurationString(65, 9 );
        System.out.println(result);
        result = getDurationString(-1 );
        System.out.println(result);
        result = getDurationString(10, -1 );
        System.out.println(result);
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes >= 0 &&
            seconds >= 0 && seconds <=59){
            long hours = minutes / 60;
            long remainderMinutes = minutes % 60;

            String hourString = (hours < 10 ? "0" : "") + hours;
            String minutesString = (remainderMinutes < 10 ? "0" : "") + remainderMinutes;
            String secondsString = (seconds < 10 ? "0" : "") + seconds;

            return hourString + "h " + minutesString + "m " + secondsString + "s";
        }

        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(long seconds) {
        if (seconds >= 0) {
            long minutes = seconds / 60;
            long secondsRemainder = seconds % 60;

            return getDurationString(minutes, secondsRemainder);
        }

        return INVALID_VALUE_MESSAGE;
    }
}
