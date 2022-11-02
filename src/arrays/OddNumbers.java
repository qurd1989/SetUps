package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OddNumbers {


    public static void main(String[] args) {


        int[] arr  = new int[50];

        int num = 0;

        for (int i = -6; i < 38; i++) {

            if (i % 2 == 1) {

                System.out.println(arr[num++] = i);

            }

        }
    }
}
