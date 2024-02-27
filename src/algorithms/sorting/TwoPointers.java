package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i= 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = solve(arr, x);
        if (ans.length > 0)
        {
            for (int num : ans){
                System.out.println(num);
            }

        }else
            System.out.println("IMPOSSIBLE");
    }

    public  static int[] solve(int []arr, int x){
        Arrays.sort(arr);
        int right = arr.length -1;
        int left = 0;
        while (right > left) {
            if (arr[left] + arr[right] == x){
                return new int[] {left, right};

            }else if (arr[left] + arr[right] < x){
                left++;
            }else
                right--;
        }
        return new int [] {};
    }

}
