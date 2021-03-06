package com.fabrizio;

import java.util.zip.DeflaterOutputStream;

public class Main {

    public static void main(String[] args) {
     boolean gameOver = true;
     int score = 800;
     int score2 = 10000;
     int levelCompleted = 8;
     int bonus = 200;

     int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
     score = 10000;
     levelCompleted = 8;
     bonus = 200;
     highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score - " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Lou", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tom", highScorePosition);
     }




     public static void displayHighScorePosition(String playerName, int highScorePosition){
         System.out.println(playerName + " Managed to get into position " + highScorePosition + "on the high score table");
     }

     public static int calculateHighScorePosition(int playerScore){

//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500){
//            return 2;
//        } else if(playerScore >= 100){
//            return 3;
//        }
//        return 4;
         int position = 4; //assume position = 4

         if(playerScore >= 1000){
             position = 1;
         } else if(playerScore >= 500){
             position = 2;
         } else if(playerScore >= 100){
             position = 3;
         }
         return position;
     }

     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
     }
    }