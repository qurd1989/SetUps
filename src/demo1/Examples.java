package demo1;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {


        int[] score = new int[]{4, 6, 8, 17, 23, 9, 10, 10};

        Arrays.sort(score);
        System.out.println("Sorted Scores:  ");

        for (int x : score) {
            System.out.print(x + " ");


        }
        System.out.print(" ");

        int low = score[0];
        int high = score[0];
        for (int x : score) {

            if (x <low) {
                low =x;

            }
            if (x>high) {
                high =x;

            }
        }
        int range = high -low;
        System.out.println("low: " + low);
        System.out.println("high: " + high);


        System.out.println("The range is: " + range);
    }
}
