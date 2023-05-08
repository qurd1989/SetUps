package Collections.string;

import java.util.Comparator;

public class SpecialSubsequences {

//    You have given a string A having Uppercase English letters.
//
//    You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
    public static void main(String[] args) {

        String A = "AGAAAGTETYYTDSHFGAFAAFAAFFDDGGGEHJHFGGGG";

        System.out.println(solve(A));
    }
    public static  long solve(String A) {

        long count = 0;
        long ans = 0;

        for (int i =0; i < A.length(); i++) {

            if (A.charAt(i) == 'A'){
                count++;
            } else if (A.charAt(i) == 'G') {

                ans += count;

            }
        }
        return ans;
    }
}
