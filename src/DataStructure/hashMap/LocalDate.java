package hashMap;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class LocalDate {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i < n; i++) {

            int comp = target - nums[i];

            if(hm.containsKey(comp)) {

                return new int[] {hm.get(comp), i};
            }

            hm.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

