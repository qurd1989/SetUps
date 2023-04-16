package intermediat2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;

public class PairWithGivenDifference {

    public static void main(String[] args) {

    }

    public int solve(int[] A, int B) {


        int n = A.length;

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < n; i++) {

            if(hs.contains(A[i] -B) || hs.contains(A[i] +B)) {

                return 1;
            }

            hs.add(A[i]);
        }

        return 0;
    }
}

