package com.fabrizio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.nextLine();

        System.out.println(" your name is " + name);
        scanner.close();
    }


    }


