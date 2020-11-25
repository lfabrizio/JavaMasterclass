package com.fabrizio;

import java.util.zip.DeflaterOutputStream;

public class Main {

    public static void main(String[] args) {
	//8 primitive types byte, short, int , long, float, double, char, boolean
        String myString= "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more";
        myString = myString + " \u00A9 2020";
        System.out.println("new string is now " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);











    }
}

