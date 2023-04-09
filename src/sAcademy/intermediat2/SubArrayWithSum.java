package intermediat2;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithSum {

    public static void main(String[] args) {

    }
    public int solve(int[] A) {

        int n = A.length;

        HashSet<Long> hs = new HashSet<>();

         long sum = 0;

         for (int i = 0; i < n; i++) {
             sum += A[i];


             if (sum == 0 || hs.contains(sum)) {

                 return 1;
             }
             hs.add(sum);
         }
         return 0;
    }

}
