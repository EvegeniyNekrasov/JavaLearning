public class Main {
    public static void main(String[] args) {
        boolean testPlayingCat = PlayingCat.isCatPlaying(true, 10);
        System.out.println(testPlayingCat); // output false

        testPlayingCat = PlayingCat.isCatPlaying(false, 36);
        System.out.println(testPlayingCat); // output false

        testPlayingCat = PlayingCat.isCatPlaying(false, 35);
        System.out.println(testPlayingCat); // output true
    }
}
