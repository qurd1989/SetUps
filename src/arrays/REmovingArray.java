package arrays;

import java.util.Scanner;

public class REmovingArray {

    private String name;
    private int score;

    public REmovingArray(String n , int s) {
        this.name = n;
        this.score = s;

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {

        return "(" + name + ", " + score +")";


    }


    public static void main(String[] args) {

    }

    public class  ScoreBoard {
        private  int numEntreis = 0;
         private REmovingArray[] board;

         public ScoreBoard(int capacity) {
             board = new REmovingArray[capacity];

         }
    }
    public  void add(REmovingArray e){

        int newScore = e.getScore();
        if()

    }

}
