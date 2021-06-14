public class Main {
    public static void main(String[] args) {
        boolean leapYear = NumberOfDaysInMonth.isLeapYear(2021);
        System.out.println(leapYear);
        int daysInMonth = NumberOfDaysInMonth.getDayInMonth(8,2021);
        System.out.println(daysInMonth);
    }
}
