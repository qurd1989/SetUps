package divideAndConquer;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }


    public static void merge(int arr[], int low, int mid, int high) {

        int num[] = new int[arr.length];
        int left = low;
        int right = mid +1;
        int index = 0;
        while ((left <= mid && right <= high)) {
            if (arr[left] <= arr[right]) {
                num[index++] = arr[left++];
            } else {
                num[index++] = arr[right++];
            }
        }
        while (left <= mid) {
            num[index++] = arr[left++];
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            num[index] = arr[right++];
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[low + i] = num[i];
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
