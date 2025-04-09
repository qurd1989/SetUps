package divideAndConquer;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }


    public static void merge(int arr[], int low, int mid, int high) {

        int num[] = new int[arr.length];
        int left = low;
        int right = mid +1;
        while ((left <= mid && right <= high)) {
            if (arr[left] <= arr[right]) {
                num[left] = arr[left];
                left++;
            } else {
                num[right] = arr[right];
                right++;
            }
        }
        while (left <= mid) {
            num[left] = arr[left];
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            num[right] = arr[right];
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = num[i-low];
        }
    }


    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
    }

}
