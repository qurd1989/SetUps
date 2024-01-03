package arrays;

import java.util.Arrays;

public class RemoveDuplicatNum {

    public static void main(String[] args) {

        int[] a = {2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 87};

        System.out.println(solve(a));

    }

    public static int[] solve(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return new int[0];
        }

        int num = 0;
        for (int i = 1; i < n; i++) {
            if (nums[num] != nums[i]) {
                num++;
                nums[num] = nums[i];
            }
        }

        int[] result = new int[num + 1];
        System.arraycopy(nums, 0, result, 0, num + 1);
        System.out.println(result);
        return result;
    }
}
