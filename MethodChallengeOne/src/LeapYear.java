public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean inRange = (year >= 1 && year <= 9999);
        if (!inRange) return false;

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        return false;
    }
}