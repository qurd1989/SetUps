package math;

import java.util.Scanner;

public class Math2 {


    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;

        } else if (playerScore >= 500) {

            position = 2;

        } else if (100 <= playerScore) {

            position = 3;

        }

            return position = 4;




    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into postion " + highScorePosition + " on the high score table.");
    }

    public static void main(String[] args) {


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Elmar", highScorePosition);

        highScorePosition = calculateHighScorePosition(950);
        displayHighScorePosition("Dim", highScorePosition);

        highScorePosition = calculateHighScorePosition(501);
        displayHighScorePosition("Sim", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Rim", highScorePosition);


    }


}

