package intermediat2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TensDigitSorting {

    public static void main(String[] args) {

    }
    public static int [] solve(int [] A) {

        int n =A.length;
        Integer[] boxedA = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            boxedA[i] = A[i];
        }
        Arrays.sort(boxedA, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                int firstTenDigfits = (a /10) % 10;
                int secondTenDigfits = (b /10) % 10;

                if (firstTenDigfits != secondTenDigfits) {
                    return  firstTenDigfits -secondTenDigfits;
                }else {
                    return b - a;

                }
            }
        });
        return A;
    }
}
