public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        if (a < 0)
            return Math.ceil(a * 1000) == Math.ceil(b * 1000);
        else
            return Math.floor(a * 1000) == Math.floor(b * 1000);
    }
}