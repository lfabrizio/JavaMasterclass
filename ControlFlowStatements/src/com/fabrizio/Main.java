package com.fabrizio;

public class Main {

    public static void main(String[] args) {
	// control flow
        // the switch statement
        int value = 1;
        if(value == 1){
            System.out.println("value is one ");
        } else if(value == 2){
            System.out.println("value two");
        } else {
            System.out.println("was not 1 or 2");
        }

        int switchValue = 1;
         switch(switchValue){
             case 1:
                 System.out.println("Value one ");
                 break;

             case 2:
                 System.out.println("value two");
                 break;

             default:
                 System.out.println("neither");
                 break;
         }
    }
}
