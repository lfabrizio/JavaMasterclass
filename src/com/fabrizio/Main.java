package com.fabrizio;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello, Lou");

       short myMinShortValue = Short.MIN_VALUE;
       short myMaxShortValue = Short.MAX_VALUE;

       long myMinLongValue = Long.MIN_VALUE;
       long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Short min is equal to " + myMinShortValue);
        System.out.println("Short max is equal to " + myMaxShortValue);

        System.out.println("long min value is " + myMinLongValue);
        System.out.println("long max value is " + myMaxLongValue);

        long myLong = 100L;
        long myMinLong =Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("long min" + myMinLong);
        System.out.println("long max " + myMaxLong);
    }
}
