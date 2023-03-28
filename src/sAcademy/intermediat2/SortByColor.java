package intermediat2;

import java.util.Arrays;

public class SortByColor {

    public static void main(String[] args) {


        int[] A = { 2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1,
                2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1,
                2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0,
                0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2,
                0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2 };

        System.out.println(Arrays.toString(sortColors(A)));
    }

    public static int[] sortColors(int[] A) {
        int n = A.length;
        if (A[0] == '0' || n == 1) {
            return new int[] {0};
        }
        int[] arr = new int[3];
        for (int i = 0; i < n; i++) {
            arr[A[i]]++;
        }
        int j = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int m = 0; m < arr[k]; m++) {
                A[j++] = k;
            }
        }
        return A;
    }

}
