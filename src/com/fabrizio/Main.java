package com.fabrizio;

import java.util.zip.DeflaterOutputStream;

public class Main {

    public static void main(String[] args) {
     boolean gameOver = true;
     int score = 800;
     int score2 = 10000;
     int levelCompleted = 8;
     int bonus = 200;

//     if(score < 5000 && score > 1000) {
//         System.out.println("Your score was less 5000 but greater than 1000");
//     } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//     }
//     else{
//            System.out.println("this happens");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score " + finalScore);
        }

        if (gameOver) {
            int finalScore = score2 + (levelCompleted * bonus);
            System.out.println("Second score");
        }

     }
    }