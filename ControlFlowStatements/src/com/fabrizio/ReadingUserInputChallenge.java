package com.fabrizio;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int counter = 0;
    int sum = 0;

    while(true){
        int order = counter + 1;
        System.out.println("enter " + order + "" );

        boolean isAnInt = scanner.hasNextInt();
    }
    scanner.close();

    }

}
