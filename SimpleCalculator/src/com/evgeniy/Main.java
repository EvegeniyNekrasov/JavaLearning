package com.evgeniy;

public class Main {

    public static void main(String[] args) {
	    SimpleCalculator calc = new SimpleCalculator();

	    calc.setFirstNumber(6.0);
	    calc.setSecondNumber(4);

        System.out.println("Add = " + calc.getAdditionResult());
        System.out.println("Subtract = " + calc.getSubtractionResult());

        calc.setFirstNumber(5.25);
        calc.setSecondNumber(0);
        System.out.println("Multiply = " + calc.getMultiplicationResult());
        System.out.println("Divide = " + calc.getDivisionResult());


    }
}
