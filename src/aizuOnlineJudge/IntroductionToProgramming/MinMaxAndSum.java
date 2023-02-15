package IntroductionToProgramming;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxAndSum {


    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);


        int n = sc.nextInt();

        int[] arr  = new int[n];

        for (int i = 0; i < arr.length; i++) {

          arr[i] = sc.nextInt();

        }
        minMaxSum(arr);
    }

    private static void minMaxSum(int[] n) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;






        for (int i = 0; i < n.length; i++) {

            if (n[i] < min) {

                min =n[i];

            } if (n[i] > max) {

                max = n[i];

            }

            sum += n[i];


        }

        System.out.println(min + " " + max + " " + sum);
    }
}
