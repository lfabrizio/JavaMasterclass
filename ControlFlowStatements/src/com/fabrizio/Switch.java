package com.fabrizio;

public class Switch {

    public static void main(String[] args) {

    char switchValue = 'A';
        switch(switchValue){
        case 'A':
            System.out.println("It is A");
            break;
        case 'B':
            System.out.println("this is B");
            break;
        case 'C':
            System.out.println("this is c");
            break;
        case 'D':
            System.out.println("this is d");
            break;
        case 'E':
            System.out.println("this is e");
            break;
        default:
            System.out.println("not found ");
            break;
    }

    String month = "January";
        switch(month.toLowerCase()){
        case "january":
            System.out.println("Jan");
        case "february":
            System.out.println("feb");
        default:
            System.out.println("other");
    }
}}
