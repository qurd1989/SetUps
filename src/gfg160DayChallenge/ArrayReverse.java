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
}