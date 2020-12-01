package com.fabrizio;

import java.util.zip.DeflaterOutputStream;

public class Main {

    public static void main(String[] args) {
     boolean gameOver = true;
     int score = 800;
     int score2 = 10000;
     int levelCompleted = 8;
     int bonus = 200;

     calculateScore(true, 800, levelCompleted, bonus);
     calculateScore(true, 10000, 8, 200);

     }

     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was "  + finalScore);
            return finalScore;
        }
        return -1;
     }
    }