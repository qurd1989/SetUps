package intermediat2;

import java.util.Arrays;

public class ElementsRemovel {

    public static void main(String[] args) {

        int [] A = {10 ,3, 7};
        System.out.println(solve(A));

    }
    public static int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length;

        int ans = 0;
        for(int i =n-1; i >= 0; i--) {

            ans += A[i] * (n - i);
        }

        System.out.println(ans);;
        return ans;

    }
}


