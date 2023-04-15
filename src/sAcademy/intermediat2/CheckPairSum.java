package intermediat2;

import java.util.HashMap;

public class CheckPairSum {

    /*
     Given an Array of integers B, and a target sum A.
     Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
    */
    public static void main(String[] args) {

        int A =100;
        int arr[] ={23, 52, 95, 29, 9, 47, 49, 55, 96, 4 };

        System.out.println(solve(arr, A));
    }

    public static int solve (int A[], int B) {

        int n = A.length;
        if (n < 1) {
            return 0;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (hm.containsKey(B - A[i])) {
                return 1;

            }

            hm.put(A[i], i);

        }
        return 0;
    }
}
