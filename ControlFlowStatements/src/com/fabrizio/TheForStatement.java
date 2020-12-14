package com.fabrizio;



public class TheForStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest =" + calculateInterest(10000.0, 2.0));


        for(int i = 2; i<9; i++){
            System.out.println("interest rate " + i + calculateInterest(10000, i));
        }
// start from 8 down to 2
        for(int i = 8; i>=2; i--){
            System.out.println("interest rate " + i + calculateInterest(10000, i));
        }


    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }

}
