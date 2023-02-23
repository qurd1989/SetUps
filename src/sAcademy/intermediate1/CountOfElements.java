package intermediate1;

import java.util.ArrayList;

public class CountOfElements {

    public static void main(String[] args) {


        int [] A = {1,2,3,4,5,6};
//        System.out.println(solve(A));

        System.out.println(solve1(A));
    }
    public static int solve (int[] A){

        int count = 0;

        int max = A[0];

        for(int i =0; i < A.length; i++) {

            if (A[i] > max) {

                max = A[i];

            }
            if (A[i]  == max) {

               count += 1;

            }

        }
        return count;
    }

    public static int solve1(int[] A) {
        int count = 0;
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] >= max) {
                if (A[i] > max) {
                    max = A[i];
                    count = 0;
                }
                count++;
            }
        }
        return count;
    }
}

