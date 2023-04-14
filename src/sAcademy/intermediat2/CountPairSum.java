package intermediat2;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountPairSum {

    public static void main(String[] args) {




    }

    public static int solve(int[] A, int B) {

        int n = A.length;

        Arrays.sort(A);
        int i = 0;
        int j = n-1;
        int count =0;

        while (i < j) {

            if (A[i] + A[j]== B) {
                count++;
            }
        }
        return count;
    }
    public static int solve1(int[] A, int B) {

        int n = A.length;

        int count = 0;
        HashSet<Integer> hm = new HashSet<>();


        for (int i = 0;  i < n; i++) {

            int x = B - A[i];
            if (hm.contains(x)) {
                count++;
            }

            hm.add(A[i]);
            }
        return count;
    }
}
