package math;

import java.util.Random;

public class RandomNumbers {


    public static void main(String[] args) {



        for (int i = 0; i < 20; i++) {


            System.out.println(generateRandomNumberInRange(100,  40));
        }
    }
    public static int generateRandomNumberInRange(int max , int min) {


        if (min >= max) {

            throw new IllegalArgumentException("min should be less than max");
        }


            Random r = new Random();

            return r.nextInt((max - min) +1) + min;


    }
}
