public class Main {
    public static void main(String[] args) {
        boolean checkIfEqualThreeDecimalPlaces = DecimalComparator.areEqualThreeDecimalPlaces(3.0, 3.0);
        System.out.println(checkIfEqualThreeDecimalPlaces); // output true

        checkIfEqualThreeDecimalPlaces = DecimalComparator.areEqualThreeDecimalPlaces(3.175, 3.176);
        System.out.println(checkIfEqualThreeDecimalPlaces); // output false
    }
}
