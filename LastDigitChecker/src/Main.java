public class Main {
    public static void main(String[] args) {
        boolean testChallenge = LastDigitChecker.hasSameDigit(41, 22, 71);
        System.out.println(testChallenge); // output true

        testChallenge = LastDigitChecker.hasSameDigit(23, 32, 42);
        System.out.println(testChallenge); // output true

        testChallenge = LastDigitChecker.hasSameDigit(9, 99, 999);
        System.out.println(testChallenge); // output false

        testChallenge = LastDigitChecker.hasSameDigit(-10, 500, 999);
        System.out.println(testChallenge); // output false
    }
}
