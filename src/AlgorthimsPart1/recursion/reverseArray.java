package recursion;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] p = {2,3,4,5,6,7,8};
        int n = p.length-1;

//        int[] arr = solve(p, 0,n);
//
//        for (int i = 0; i <= n; i++){
//            System.out.print(arr[i] +  " ");
//        }
         solve1(p, 0, n);
    }
    public static int[] solve(int[] arr, int start, int end) {

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       return arr;
    }
    public static void solve1(int []arr, int i, int n) {
        if (i >= n) { // Base case: entire array processed
            return;
        }

        // Swap elements at i and n-i-1
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        solve1(arr, i + 1, n);

    }
    public static void swap(int l, int n) {

    }
}
