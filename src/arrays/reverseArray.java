package arrays;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {


        int[] A= {2,34,5,6,7,8,};

         int j[] = solve(A);


        for (int i = 0; i < A.length; i++) {

            System.out.print(j[i]);
        }

    }

    public static  int[] solve(int[] A) {

        int n = A.length;



        for (int i =0; i < n/2; i++) {

             int temp = A[i];
            A[i] = A[n -i-1];
            A[n - i- 1] =temp;


        }

        return A;
    }


}
