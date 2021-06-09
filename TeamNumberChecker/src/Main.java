public class Main {
    public static void main(String[] args) {
        boolean checkIfTeen = TeenNumberChecker.hasTeen(15, 23, 19);
        System.out.println(checkIfTeen); // output true

        checkIfTeen = TeenNumberChecker.hasTeen(22, 23, 24);
        System.out.println(checkIfTeen); // output false
    }
}
