package HashMAp;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] sums = {1, 2, 3, 4, 5, 6, 7,};
        int target = 8;

        int j[] = solve(sums, target);
        for (int i = 0; i < sums.length; i++) {


        System.out.println(Arrays.toString(j));
    }
    }

    public static int[] solve(int [] nums, int target){

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                if (nums[i] + nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
        }
