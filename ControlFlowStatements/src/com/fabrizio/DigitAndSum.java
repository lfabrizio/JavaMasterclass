package com.fabrizio;

public class DigitAndSum {
    public static void main(String[] args) {
        System.out.println("sum of digits in 125 is " + sumDigits(125));
        System.out.println("sum of digits in -125 is " + sumDigits(-125));
        System.out.println("sum of digits in 4 is " + sumDigits(444));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }


}
