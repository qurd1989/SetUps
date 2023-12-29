package array;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayTwoEqualSumSubarrays {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,5};
        int n = arr.length;

        int []resilt = solve(arr, n);
        if (resilt != null) {
            for (int i = 0; i < n; i++) {
                System.out.println(resilt[i] + " ");
            }
        }else
            throw new Exception("null  value is present");
    }
    public static int[] solve(int[] arr, int n) {

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if (totalSum % 2 !=0) {
            return null;
        }
        int target = totalSum /2;
        int currentSum =0;
        int index = -1;

        for (int i = 0; i < n; i++){
            currentSum += arr[i];
            if (currentSum == target){
                index = i;
            }
        }
        if (index == -1){
            return null;
        }
        return Arrays.copyOfRange(arr,index + 1, n);
    }

}
