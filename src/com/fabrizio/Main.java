package com.fabrizio;

import java.util.zip.DeflaterOutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here


        System.out.println("Hello, Lou");
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float max value " + myMaxFloat);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double max value " + myMaxDouble);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("My int value " + myIntValue);
        System.out.println("My float " + myFloatValue);
        System.out.println("My double" + myDoubleValue);


        double pound = 200d;
        double kilo = pound * 0.45359237d;
        System.out.println("Converts to " + kilo);

    





    }
}

