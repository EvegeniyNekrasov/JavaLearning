public class Main {
    public static void main(String[] args) {
        boolean check = EqualSumChecker.hasEqualSum(1,-1, 0);
        System.out.println(check); // output true

        check = EqualSumChecker.hasEqualSum(10, 10, 10);
        System.out.println(check); // output false
    }
}
