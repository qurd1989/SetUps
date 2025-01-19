package gfg160DayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }


            Arrays.sort(arr);
            reverseArray(arr);

            int score = 0;


            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    score += arr[i];
                } else {

                }
            }
            System.out.println(score);
        }
    }

    // Helper method to reverse the array
    private static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
 }
}
}