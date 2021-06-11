public class Main {
    public static void main(String[] args) {
        double testArea = AreaCalculator.area(5.0); // output 78.53981633974483
        System.out.println(testArea);
        testArea = AreaCalculator.area(5.0,4.0); // output 20.0
        System.out.println(testArea);
        testArea = AreaCalculator.area(-1.0,4.0); // output -1.0
        System.out.println(testArea);
        testArea = AreaCalculator.area(-1.0); // output -1.0
        System.out.println(testArea);
    }
}
