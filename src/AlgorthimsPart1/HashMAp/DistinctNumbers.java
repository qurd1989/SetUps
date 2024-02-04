package HashMAp;

import java.util.*;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve3(arr,n));

    }
    static int solve(int arr[], int n){

        Map<Integer, Boolean> hs = new HashMap<>();
        for (int  value : arr) {

            hs.put(value, true);
        }
            return hs.size();
    }
    static int solve2(int arr[], int n){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }
    static int solve3(int arr[], int n){

        int count = 1;
        Arrays.sort(arr);
        for (int i = 0; i<n-1; i++){
            if (arr[i] != arr[i+1]) {
                count++;
            }
        }
        return count;

    }
}
