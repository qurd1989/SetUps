import java.util.Arrays;

public class InPlacePrefixSum {

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





