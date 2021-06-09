public class TeenNumberChecker {
    public static boolean hasTeen(int param1, int param2, int param3) {
        if(isTeen(param1) || isTeen(param2) || isTeen(param3)) {
            return true;
        } else {
            return false;
        }

        // LESS CODE
        // return isTeen(param1) || isTeen(param2) || isTeen(param3);
    }

    public static boolean isTeen(int param) {
        if (param >= 13 && param <= 19) {
            return true;
        } else {
            return false;
        }

        // LESS CODE
        // return param >= 13 && param <= 19;
    }
}
