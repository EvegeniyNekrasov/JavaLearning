package com.evgeniy;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mark", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sara", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Maria", highScorePosition);

    }

    /*
    Create a method called displayHighScorePosition
    It should a player name as a parameter, and a 2nd parameter as a position in
    the high score table. You should display the player name along with a message like
    " managed to get into position " and the position the got and a further message
    " on the high score table".

    Create a 2nd method called calculateHighScorePosition
    It should be sent one argument only, the player score
    It should return an int
    the return data should be
    1 if the score is >= 1000
    2 if the score is >= 500 and < 1000
    3 if the score is >= 100 and < 500
    4 in all other cases
    call both methods and display the result of the following
    a score of 1500, 900, 400, and 50
     */

    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println(name + " managed to get into position "
                + highScorePosition
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }

        // Resolving problem with one return
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
