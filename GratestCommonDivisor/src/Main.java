public class Main {
    public static void main(String[] args) {
        int testChallenge = GreatestCommonDivisor.getGreatestCommonDivisor(25, 15);
        System.out.println(testChallenge); // output 5

        testChallenge = GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);
        System.out.println(testChallenge); // output 6

        testChallenge = GreatestCommonDivisor.getGreatestCommonDivisor(9, 18);
        System.out.println(testChallenge); // output -1

        testChallenge = GreatestCommonDivisor.getGreatestCommonDivisor(81, 153);
        System.out.println(testChallenge); // output 9
    }
}
