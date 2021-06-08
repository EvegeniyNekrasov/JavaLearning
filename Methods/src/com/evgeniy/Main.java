package com.evgeniy;

public class Main {

    public static void main(String[] args) {
        calculateScore();
    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalCore = score + (levelCompleted * bonus);
            finalCore += 1000;
            System.out.println("Your final score was " + finalCore);
        }
    }
}
