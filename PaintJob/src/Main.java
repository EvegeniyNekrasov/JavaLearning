public class Main {
    public static void main(String[] args) {
        int test = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println(test); // output -1
        test = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println(test); // output 3

        int test2 = PaintJob.getBucketCount(-3.4, 2.1, 1.5);
        System.out.println(test2); // output -1
        test2 = PaintJob.getBucketCount(3.4, 2.1, 1.5);
        System.out.println(test2); // output 5

        int test3 = PaintJob.getBucketCount(3.4, 1.5);
        System.out.println(test3); // output 3
        test3 = PaintJob.getBucketCount(6.26, 2.2);
        System.out.println(test3); // output 3

    }
}
