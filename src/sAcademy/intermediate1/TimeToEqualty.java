package intermediate1;

import java.util.Arrays;

public class TimeToEqualty {

    public static void main(String[] args) {
        int [] A ={731, 349, 490, 781, 271, 405, 811, 181, 102, 126, 866, 16, 622, 492, 194, 735};

        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        int sum = 0; int max = 0;


        for(int i = 0; i < A.length; i++) {

            if(A[i] > max) {
                max = A[i];
                System.out.println(max);

            }

            sum += max - A[i];


            System.out.println(sum);

        }

        return sum;
    }

    public static class InPlacePrefixSum {

        public static void main(String[] args) {


            int [] A = {6, 3, 3, 6, 7, 8, 7, 3, 7 };

            int [] result = solve(A);

            System.out.println(Arrays.toString(result));
        }
        public static int[] solve(int[] A) {




            for(int i = 1; i < A.length; i++) {

                A[i] = A[i-1] + A[i];




            }
            return A;

        }
    }
}



