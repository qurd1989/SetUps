package IntroductionToProgramming;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {


        int[] data = new int[10];
        Random rand = new Random();rand.setSeed(System.currentTimeMillis());

        for (int i = 0;  i< data.length; i++) {

            data[i] = rand.nextInt(100);
            int[] orgi = Arrays.copyOf(data, data.length);

            System.out.println("Arrays  equal after sort : "  + Arrays.equals(data, orgi));
            System.out.println("orgi  = " + Arrays.toString(orgi));
            System.out.println("data  = " + Arrays.toString(data));

        }


    }
}
