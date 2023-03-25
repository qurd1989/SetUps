package intermediat2;

import java.util.Arrays;

public class NobleInteger {

    public static void main(String[] args) {


    }
    public int solve(int[] A) {

        int n = A.length;
        Arrays.sort(A);
        if(A[n-1] ==0) {
            return 1;
        }
        for(int i = 0; i < n -1; i++) {

            if(A[i] == A[i + 1]) {
                continue;

            }

            if(A[i] == n - i -1) {
                return 1;
            }

        }
        return -1;
    }
}


