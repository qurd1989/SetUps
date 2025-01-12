package gfg160DayChallenge;

import java.util.*;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 5, 6, 8, 6};
        System.out.println("Second largest element: " + findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, true);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        return keys.size() > 1 ? keys.get(1) : -1;
    }
    static void reverseArray(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }
        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }
    static void reversArray1(int []arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
}
}