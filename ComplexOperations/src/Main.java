public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);
        System.out.println("one.real = " + one.getReal()); // output one.real = 2.0
        System.out.println("one.imaginary = " + one.getImaginary()); // output one.imaginary = 2.0

        one.subtract(number);
        System.out.println("one.real = " + one.getReal()); // output one.real = -0.5
        System.out.println("one.imaginary = " + one.getImaginary()); // output one.imaginary = 3.5

        number.subtract(one);
        System.out.println("number.real = " + number.getReal()); // output number.real = 3.0
        System.out.println("number.imaginary = " + number.getImaginary()); // output number.imaginary = -5.0
    }
}
