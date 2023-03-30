package intermediat2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArithmeticProgression implements Comparable<ArithmeticProgression> {

    public static void main(String[] args) {

        int[] A = { -113, -70, -14, -8, -29, 5, -94, -44, 23, 9, 13, -132, -14};

        System.out.println(solve(A));
        System.out.println(solve2(A));

    }
    public static int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length;

        int d = A[1] - A[0];
        for(int i = 2; i < n; i++) {

            if(A[i] -A[i -1] == d) {

                return 1;
            }
        }

        return 0;
    }

    public static  int solve2(int [] A) {
    int n = A.length;
        Set<Integer> diffs = new HashSet<>();

        for (int i = 0; i < n-2; i++ ) {
            for (int j = i +1; j <  n-1; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if (A[j] - A[i] == A[k] - A[j]) {
                        return 1;

                    }
                }
            }
        }
        return 0;
    }


    @Override
    public int compareTo(ArithmeticProgression o) {
        return 0;
    }
}
