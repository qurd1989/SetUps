package arrays;

import java.util.Enumeration;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {

    }
    public static int[] removeDup(int arr[]) {
        int n = arr.length;
        int num = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] != arr[i]){
                arr[num] = arr[i];
                num++;
            }
        }
        return arr;
    }
}
