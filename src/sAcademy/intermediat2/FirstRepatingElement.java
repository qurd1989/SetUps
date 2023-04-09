package intermediat2;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepatingElement {

    public static void main(String[] args) {

        int A[] = {8, 15, 1, 10, 5, 19, 19, 3, 5, 6, 6, 2, 8, 2, 12, 16, 3 };

        System.out.println(solve(A));

    }

    public static int solve(int[] A) {

        int n = A.length;

        int min = -1;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i ++) {

            if (hs.containsKey(A[i])) {
                hs.put(A[i], hs.get(A[i]) + 1);
            } else {
                hs.put(A[i], 1);

            }

        }
        for (int i = 0; i < n; i++) {
            if (hs.get(A[i]) == 2)
            {
               return A[i];

            }
        }
        return min;
    }

}