package array;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class PrintEvenAndOddNumbersSeparatly {

    public static void main(String[] args) {

        int[] arr = {23,24,25,26,17,28,29};

        int[][] result = solve(arr);

        for (int odd : result[0]) {
            System.out.println(" Odd Numbers: " + odd );
        }

        for (int even : result[1]){
            System.out.println("Even Numbers " + even);
        }

    }

    public static int[][] solve(int[] arrw) {
        int n = arrw.length;
        int j =0, k = 0;

        int[] odd = new int[n];
        int[] even = new int[n];

        for (int i  = 0; i < n; i++) {

            if (arrw[i] % 2== 0) {
                even[j] = arrw[i];
                j++;
            }else
                odd[k] = arrw[i];
            k++;
        }

        odd =  Arrays.copyOf(odd, k);
        even =  Arrays.copyOf(even, j);

        int[][] result ={ odd, even};
        return result;
    }
}
