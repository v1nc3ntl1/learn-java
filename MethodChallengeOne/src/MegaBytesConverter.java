public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = kiloBytes / 1024;
        int remaider = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remaider + " KB");
    }
}