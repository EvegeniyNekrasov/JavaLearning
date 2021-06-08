package com.evgeniy;

public class Main {

    public static void main(String[] args) {
	    /*
	    Precision refers to the format and amount of space occupied by the type.
	    Single precision occupies 32 bits (so has with of 32) and Double precision
	    occupies 64 bits (and thus has a width od64).
	     */

        /*
        As a result the float has a range from 1.3E-45 to 3.4028235E+38 ant the
        double is much more precise with a range from 4.9E-324 to 1.7976931348623157E+308
         */

        float minValue = Float.MIN_VALUE;
        float maxValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + minValue);
        System.out.println("Float max value = " + maxValue);

        double minValue1 = Double.MIN_VALUE;
        double maxValue1 = Double.MAX_VALUE;
        System.out.println("double min value = " + minValue1);
        System.out.println("double max value = " + maxValue1);

        int myIntValue       = 5;
        float myFloatValue   = 5.25f; // or use cast (float) 5.25
        double myDoubleValue = 5.25d;


    }
}
