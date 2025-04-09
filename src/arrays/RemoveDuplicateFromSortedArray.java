package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Elmar");
        list.add("Elmar");
        list.add("EDU");
        list.add("Tan");
        list.add("Jenk");
        list.add("Elmar");

        List<String> results = removeDupString(list);

        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(results.get(i));
        }
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

    public static List<String> removeDupString(List<String> list) {
        int n = list.size();
        int num = 1;
        Collections.sort(list);
        for (int i = 1; i < n; i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                list.set(num, list.get(i));
                num++;
            }
        }
        return list;
    }
}
