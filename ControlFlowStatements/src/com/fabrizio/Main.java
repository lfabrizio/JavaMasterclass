package com.fabrizio;

public class Main {

    public static void main(String[] args) {
	// control flow
        // the switch statement
//        int value = 1;
//        if(value == 1){
//            System.out.println("value is one ");
//        } else if(value == 2){
//            System.out.println("value two");
//        } else {
//            System.out.println("was not 1 or 2");
//        }

//        int switchValue = 1;
//         switch(switchValue){
//             case 1:
//                 System.out.println("Value one ");
//                 break;
//
//             case 2:
//                 System.out.println("value two");
//                 break;
//
//             default:
//                 System.out.println("neither");
//                 break;
//    }

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


    }
}
