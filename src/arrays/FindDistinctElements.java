package arrays;

import java.util.HashSet;

public class FindDistinctElements {

    public static void main(String[] args) {

        int arr[] = {1,2,3,3,4,4,5,5,6,6};

        System.out.println(solve(arr));
    }

    public static int solve(int arr[]) {

        int n = arr.length;

        HashSet<Integer> hs = new HashSet<>();

        for (int i =0; i < n; i++) {
            hs.add(arr[i]);

        }

        return hs.size();
    }

}
