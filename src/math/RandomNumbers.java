package math;

import java.util.Random;

public class goRandomNumbers {


    public static void main(String[] args) {



        for (int i = 0; i < 20; i++) {


            System.out.println(r.nextInt((100 -40)));
        }
    }
    public static int generateRandomNumberInRange(int max , int min) {


        if (min >= max){

            throw new IllegalArgumentException("min should be less than max")
        }
    }
}
