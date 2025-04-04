package twoPointer;

import java.util.HashMap;

public class GivenSum {

    public static void main(String[] args) {

    }
    public static boolean pairExists(int arr[], int n, int s) {
        int len = arr.length;
        for (int i = 0; i < len-2; i++) {
            for (int j = i +1; j < len-1; j++) {
                if (arr[i] + arr[j] == s) {
                    return true;
                }
            }
        }
        return false;
     }

     public static boolean pairExistsOne(int arr[], int n, int s) {
         HashMap<Integer, Integer> hashMap = new HashMap<>();
         for (int i = 0; i < n; i++) {
             hashMap.put(arr[i], i);
         }
         for (int i =0; i < n; i++)  {
             int num = arr[i];
             int target = s - num;
             if (hashMap.containsKey(target)){
                 return true;
             }
         }
         return false;
     }
     public static boolean pairExistsTwo(int arr[], int n, int s) {
        int left = 0, right = n-1;
        while(left < right) {
            int target = arr[left] + arr[right];
            if (s == target) {
                return true;
            }else if (target < s){
                left++;
            } else if (target > s) {
                right--;
            }
        }
        return false;
     }

}
