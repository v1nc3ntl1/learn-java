public class Main {
    public static void main(String[] args){
        SpeedConverter.printConversion(10);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        BarkingDog.shouldWakeUp(true, 8);
        LeapYear.isLeapYear(2010);
        boolean isTrue = DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.1756);
        isTrue = DecimalComparator.areEqualByThreeDecimalPlaces(-3.175,-3.1756);
        EqualSumChecker.hasEqualSum(2, 2, 4);
        TeenNumberChecker.hasTeen(12,15, 32);
        TeenNumberChecker.isTeen(17);
    }
}
