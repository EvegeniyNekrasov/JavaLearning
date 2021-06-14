public class Main {
    public static void main(String[] args) {
        int sumOddTest = SumOddRange.sumOdd(1, 100);
        System.out.println(sumOddTest); // output 2500

        sumOddTest = SumOddRange.sumOdd(-1, 100);
        System.out.println(sumOddTest); // output -1

        sumOddTest = SumOddRange.sumOdd(100, 100);
        System.out.println(sumOddTest); // output 0

        sumOddTest = SumOddRange.sumOdd(13, 13);
        System.out.println(sumOddTest); // output 13

        sumOddTest = SumOddRange.sumOdd(100, -100);
        System.out.println(sumOddTest); // output -1

        sumOddTest = SumOddRange.sumOdd(100, 1000);
        System.out.println(sumOddTest); // output 247500
    }
}
