public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mb = kiloBytes/1024;
        int remainder = mb/1024;
        System.out.println(remainder);
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else System.out.println(kiloBytes + " KB = " + mb + "MB and " + remainder + " KB");
    }

}