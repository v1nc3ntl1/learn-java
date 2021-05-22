public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (!barking) return barking;

        if (hourOfDay < 0 || hourOfDay > 23)
            return false;

        return (hourOfDay < 8 || hourOfDay > 22);
    }
}