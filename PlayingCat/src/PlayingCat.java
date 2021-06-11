public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ( !summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return summer && (temperature >= 25 && temperature <= 45);
        }

        // Less Code
        // if (summer && temp >=25 && temp <=45) return true;
        // return !summer && temp >= 25 && temp <= 35;
    }
}
