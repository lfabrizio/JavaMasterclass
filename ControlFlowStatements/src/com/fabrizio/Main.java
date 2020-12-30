package com.fabrizio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year of birth ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name : ");
        String name = scanner.nextLine();

        int age = 2020 - yearOfBirth;

        if(age >= 0 && age <= 100){

            System.out.println(" your name is " + name + ", and you are " + age + " years old ");
        } else{
            System.out.println("Invalid");
        }

        scanner.close();
    }


    }


