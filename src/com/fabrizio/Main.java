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

       int topScore = 100;
       if(topScore >= 100){
           System.out.println("you got the high score");
       }
       int secondTopScore = 60;
       if((topScore > secondTopScore) && (topScore < 100)){
           System.out.println("Greater than second top score and less than 100");
       }

       if((topScore > 90) || (secondTopScore <= 90)){
           System.out.println("either or both conditions are true");
       }

       // operator challenge
        int newValue = 50;
       if(newValue == 50){
           System.out.println("This ");
       }

       boolean isCar = false;
       if(isCar == true){
           System.out.println("this is not supposed to happen");
       }
    }
}

