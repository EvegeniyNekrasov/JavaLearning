public class Main {
    public static void main(String[] args) {
        boolean checkIfLeap = LeapYear.isLeapYear(1600);
        System.out.println(checkIfLeap);  // output true

        checkIfLeap = LeapYear.isLeapYear(1700);
        System.out.println(checkIfLeap);  // output false
    }
}
