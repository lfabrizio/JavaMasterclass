package OperatorChallenge;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // create a double variable w value 20.00
        double firstValue = 20.00d;
        // create second var of type double w value 80.00
        double secondValue = 80.00d;
        // add both numbers and multiply by 100.00
        double total = (firstValue + secondValue) * 100.00d;
        double remainder = total % 40.00d;
        // use moduler fro remainder
        System.out.println("Total " + total);
        System.out.println("Remainder = " + remainder);

    //boolean variable that assigns value to true if remainder is 0 false if not zero
    boolean isNoRemainder = (remainder == 0) ? true : false;
    // output boolean
        System.out.println(isNoRemainder);
    // if then statement
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

}}
