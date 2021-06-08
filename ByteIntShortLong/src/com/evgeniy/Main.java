package com.evgeniy;

public class Main {

    public static void main(String[] args) {
	
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        System.out.println("Busted min value = " + (myMinIntValue - 1));
        System.out.println("Busted max value = " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte max value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short min value = " + myMinShortValue);
        System.out.println("short max value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);

        /*
         * A BYTE OCCUPIES 8 BITS. A BIT IS NOT DIRECTLY REPRESENTED IN A
         * PRIMITIVE TYPE. SO A BYTE OCCUPIES 8 BITS. WE SAY THAT A BYTE HAS
         * A WITH OF 8.
         *
         * A SHORT CANT STORE A LARGE RANGE IF NUMBERS AND OCCUPIES 18 BITS, AND
         * HAS A WIDTH OF 16.
         *
         * AN INT HAS A MUCH LARGER RANGE AS WE KNOW AND OCCUPIES 32 BITS AND HAS
         * A WITH OF 32.
         *
         * THE POINT HERE IS THAT EACH PRIMITIVE TYPE OCCUPIES A DIFFERENT AMOUNT OF
         * MEMORY - WE CAN SEE THAT AN INT NEEDS FOUR TIME THE AMOUNT OF SPACE THAN
         * A BYTE.
         */

        int myTotal = (myMaxIntValue / 2);
        // Casting means to treat or convert a number from one type to another.
        // We put the type we want the number to be in parenthesis like this:
        // (byte)(myMinByteValue / 2)
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

        // CHALLENGE
        byte  val1 = 30;
        short val2 = 3000;
        int   val3 = 60000;
        long  val4 = 50000L + 10L * (val1 + val2 + val3);

        System.out.println(val4);






    }
}
