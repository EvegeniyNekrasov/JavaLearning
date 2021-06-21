import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            average++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / average));
        scanner.close();
    }
}
