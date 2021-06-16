public class Main {
    public static void main(String[] args) {
        boolean test = FlourPacker.canPack(1, 0, 4);
        System.out.println(test); // output false

        test = FlourPacker.canPack(1, 0, 5);
        System.out.println(test); // output true

        test = FlourPacker.canPack(0, 5, 4);
        System.out.println(test); // output true

        test = FlourPacker.canPack(2, 2, 11);
        System.out.println(test); // output true

        test = FlourPacker.canPack(-3, 2, 12);
        System.out.println(test); // output false
    }
}
