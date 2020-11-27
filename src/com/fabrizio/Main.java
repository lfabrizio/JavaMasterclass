package com.fabrizio;

import java.util.zip.DeflaterOutputStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Lou ");
	int result = 1 + 2; // 1 + 2 = 3;
        System.out.println("1 + 2" + result);
        int previousResult = result;
        System.out.println("Return Previous result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1" + result);
        System.out.println("previous result" + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 " + result);

        result = result % 3;
        System.out.println("4 % 3 =" + result);

        // result = result + 1;
        result++; // 1 +1 = 2
        result--;
        System.out.println("2 - 1 = " + result);

        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);











    }
}

