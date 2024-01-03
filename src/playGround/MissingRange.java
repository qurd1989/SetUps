package playGround;

import java.util.Scanner;

public class MissingRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int kthPlaceScore = scores[k - 1];
        int participantsAdvancing = 0;

        for (int score : scores) {
            if (score >= kthPlaceScore && score > 0) {
                participantsAdvancing++;
            }
        }

        System.out.println(participantsAdvancing);
    }
}