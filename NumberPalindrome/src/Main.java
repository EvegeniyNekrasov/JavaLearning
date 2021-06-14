public class Main {
    public static void main(String[] args) {
        boolean test = NumberPalindrome.isPalindrome(-1221);
        System.out.println(test); // output true

        test = NumberPalindrome.isPalindrome(707);
        System.out.println(test); // output true

        test = NumberPalindrome.isPalindrome(12212);
        System.out.println(test); // output false
    }
}
