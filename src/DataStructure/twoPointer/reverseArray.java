package twoPointer;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,6,3};

        int results[] = reverseArray(arr);
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
        }
    }
    public static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int reversed[] = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[n-i-1] = arr[i];
        }
        return reversed;
    }
    public static int[] reversedArrayOne(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
