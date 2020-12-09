package CodingExercises;

public class MinutesToYears {
    public static void main(String[] args) {

    }

    public static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_VALUE);
        }
        long hours = minutes/60;
        long days = hours / 24;
        long remainingDays = days % 365;
        long years = days/365;

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}
