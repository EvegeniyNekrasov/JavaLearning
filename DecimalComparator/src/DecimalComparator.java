public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        int paramOne = (int)(param1 * 1000);
        int paramTwo = (int)(param2 * 1000);
        return paramOne - paramTwo == 0;
    }
}
