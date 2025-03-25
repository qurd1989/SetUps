package pattern;

import java.util.Scanner;

public class RightAngleTriangleNumberPattern {
    public static void main(String args[]){

        int arr[] = {1, 2, 0, 4, 0, 5, 0, 7};
        int result[] = printRightAngleTriangleNumberPattern(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] printRightAngleTriangleNumberPattern(int arr[] ){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
            while (n > count){
                arr[count++] = 0;

            }
            return arr;
        }
        public static int[] EvenNumberFollowedByOddNumber(int nums[]){
        int n = nums.length;
        int count = 0;
        for(int i =0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                nums[count++] = nums[i];

            }
        }
           for(int i = count; i < n; i++){
                if (nums[i] % 2 != 0) {
                nums[count++] = nums[i];
                }
            }

        return nums;
        }
}
