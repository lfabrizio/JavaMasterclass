package com.fabrizio;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int counter = 0;
    int sum = 0;

    while(true){
        int order = counter + 1;
        System.out.println("Enter here  " + order + "" );

        boolean isAnInt = scanner.hasNextInt();
        if(isAnInt){

        } else {
            System.out.println("invalid");
        }
    }
    scanner.close();

    }

}
